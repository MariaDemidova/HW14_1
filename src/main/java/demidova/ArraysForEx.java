package demidova;

import java.util.Arrays;

public class ArraysForEx {

    public static int[] newArrAfter4(int[] arr) throws RuntimeException{
        if(arr.length == 0) throw new NullPointerException("Задайте массив");
        int indexAfter4 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) indexAfter4 = i + 1;
        }
        if(indexAfter4 == -1) throw new RuntimeException("4 is not found.");
        else return Arrays.copyOfRange(arr, indexAfter4, arr.length);
    }

    public static boolean foundOneOr4(int[] arr) {
        boolean b1 = false;
        boolean b4 = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) b1 = true;
            else if(arr[i] == 4) b4 = true;
            else return false;
        }
        return b1 && b4;
    }

}
