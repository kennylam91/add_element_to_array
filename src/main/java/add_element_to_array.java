import java.util.Scanner;

public class add_element_to_array {
    private static int[] array;
    private static int arraySize;
    private static int insertPosition;
    private static int insertNumber;
    private static char answer;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        arraySize = getNumberElementsOfArray();
        array = new int[arraySize];
        do {

            do {
                System.out.println("Input position to insert:");
                insertPosition = scanner.nextInt();
                if (!isInsertPositionValid(insertPosition, arraySize))
                    System.out.println("Invalid position!");

            }
            while (!isInsertPositionValid(insertPosition, arraySize));
            System.out.println("Input Number to insert:");
            insertNumber = scanner.nextInt();
            insertElementToArray(insertNumber, insertPosition, array);
            showArray(array);
            System.out.println("Keep inserting Number? y/n");
            answer = scanner.next().charAt(0);
        }
        while (answer == 'y');


    }


    private static int getNumberElementsOfArray() {
        System.out.println("Input Array size: ");
        return scanner.nextInt();
    }

    private static void showArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "\t");
        }
    }

    private static boolean isInsertPositionValid(int position, int arraySize) {
        return (position >= 0 && position < arraySize);
    }

    private static void insertElementToArray(int element, int position, int[] array) {
        for (int i = array.length - 1; i > position; i--) {
            array[i] = array[i - 1];
        }
        array[position] = element;
    }

}
