package lozika.multmatrix;

import java.util.Random;

public class MultmatSeq {

    int[][] A = new int[40][15];
    int[][] B = new int[15][30];

    public MultmatSeq() {
        Random rd = new Random();
        System.out.println("A : ");
        for(int i=0; i<A.length; i++) {
            for(int j = 0; j<A[i].length; j++) {
                A[i][j] = rd.nextInt(15);
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("B : ");

        for(int i=0; i<B.length; i++) {
            for(int j = 0; j<B[i].length; j++) {
                B[i][j] = rd.nextInt(15);
                System.out.print(B[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("\n\n");

    }

    public int[][] multiply() {

        int[][] C = new int[this.A.length][this.B[0].length];
        
        for(int i=0; i<C.length; i++) {
            for(int j = 0; j<C[i].length; j++) {
                C[i][j] = 0;
            }
        }
    
        for(int row = 0; row < C.length; row++) {
            System.out.println(C.length);
            for(int col = 0; row < C[row].length; row++) {
                int cell = 0;
                for(int i = 0; i<this.B.length; i++) {
                    cell += A[row][i] * B[i][col];
                }
                C[row][col] = cell;
                System.out.print(C[row][col] + " ");
            }
            //System.out.println("");
        }
        
        System.out.println("\n\n");

        return C;
    }
}