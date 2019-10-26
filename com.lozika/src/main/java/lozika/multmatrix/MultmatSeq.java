package lozika.multmatrix;

import java.util.Random;

public class MultmatSeq {

    int[][] A = new int[40][15];
    int[][] B = new int[15][30];

    public MultmatSeq() {
        Random rd = new Random();

        for(int i=0; i<A.length; i++) {
            for(int j = 0; j<A[i].length; j++) {
                A[i][j] = rd.nextInt(15);
            }
        }

        for(int i=0; i<B.length; i++) {
            for(int j = 0; j<B[i].length; j++) {
                B[i][j] = rd.nextInt(15);
            }
        }
    }
}