import java.util.Arrays;

public class ReverseArray {

    public static int[] reverse(int[] array){
        int [] reversed = new int[array.length];



        int j;
        int idx = array.length - 1;
        int i = 0;


        while (i < array.length) {

            j = array[idx];

            reversed[i] = j;
            i++;
            idx--;

        }
        return reversed;
    }

    public static int[] reverse2(int[] array) {
        int maxIdx = array.length - 1;
        int halfPoint = array.length / 2;

        for (int i = 0; i < halfPoint; i++) {
            int temp = array[i];
            array[i] = array[maxIdx - i];
            array[maxIdx - i] = temp;
        }

        return array;
    }
}
