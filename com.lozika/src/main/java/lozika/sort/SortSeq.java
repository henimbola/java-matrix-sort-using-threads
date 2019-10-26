package lozika.sort;

import java.util.Random;

public class SortSeq {

    int[] arr = new int[100];

    public SortSeq() {
        Random rd = new Random();
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(); // storing random integers in an array
        }
    }

}