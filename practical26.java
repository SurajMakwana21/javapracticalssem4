// Write a java program using try-catch block to handle java.lang.ArrayIndexOutOfBoundsException

public class practical26 {
    public static void main(String[] args) {
        try {
            int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The Code Generates the following error :");
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }
}