package lozika.multmatrix;

public class MyThread implements Runnable {

    private int row;
    private int col;
    private int [][] A;
    private int [][] B;
    private int [][] C;

    public MyThread(int row, int col, int[][] A,
      int[][] B, int[][] C) {
        this.row = row;
        this.col = col;
        this.A = A;
        this.B = B;
        this.C = C;
    }

    @Override
    public void run() {
        C[row][col] = (A[row][0] * B[0][col])+ (A[row][1]*B[1][col]);        
    }
}