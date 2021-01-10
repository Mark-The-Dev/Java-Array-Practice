import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    public static int readInteger(){
        System.out.println("How many integers would you like to enter?\r");
        return scanner.nextInt();

    }

    public static int[] readElements(int n){
        System.out.println("Please enter " + n + " numbers.");
        int[] array = new int[n];
        for (int i =0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i< array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }


}
