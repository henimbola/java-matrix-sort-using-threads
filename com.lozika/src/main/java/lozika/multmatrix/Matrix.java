package lozika.multmatrix;

import java.util.Random;

public class Matrix implements Runnable {

    private int[][] matrix = new int[this.rowCount][this.colCount];

    private int rowCount;
    private int colCount;

    public Matrix() {
        this.rowCount = 4;
        this.colCount = 4;
        Random rd = new Random();
        System.out.println("A : ");
        for(int i=0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[i].length; j++) {
                matrix[i][j] = rd.nextInt(15);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public Matrix(int rowCount, int colCount) {
        this.rowCount = rowCount;
        this.colCount = colCount;

        Random rd = new Random();
        System.out.println("A : ");
        for(int i=0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[i].length; j++) {
                matrix[i][j] = rd.nextInt(15);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public Matrix multiplySeq(Matrix matrix) { 

        Matrix mat = new Matrix();
        mat.setRowCount(this.getColCount());
        mat.setColCount(matrix.getRowCount());
        int[][] c = new int[this.getColCount()][matrix.getRowCount()];

        if (this.getColCount() != matrix.getRowCount()) {
            return null;
        } else if (this.getColCount() == matrix.getRowCount()) {
            int[][] A = this.matrix;
            int[][] B = matrix.getMatrix();
        
            for(int row = 0; row < c.length; row++) {
                System.out.println(c.length);
                for(int col = 0; row < c[row].length; row++) {
                    int cell = 0;
                    for(int i = 0; i<B.length; i++) {
                        cell += A[row][i] * B[i][col];
                    }
                    c[row][col] = cell;
                    System.out.print(c[row][col] + " ");
                }
            }
            
            System.out.println("\n\n");    
        }

        mat.setMatrix(c);

        return mat;
    };

    public Matrix multiplyMulti(Matrix matrix) {
        return null;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public void setColCount(int colCount) {
        this.colCount = colCount;
    }

    public String toString() {
        return "hello";
    }    
}