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

    public int[][] multiply() {
        int[][] C = new int[this.A.length][this.B[15].length];
        
        for(int row = 0; row < C.length; row++) {
            for(int col = 0; row < C[row].length; row++) {
                int cell = 0;
                for(int i = 0; i<this.B.length; i++) {
                    cell += A[row][i] * B[i][col];
                }
                C[row][col] = cell;
            }
        }
        
        return C;
    }
}