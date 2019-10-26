package lozika;

import lozika.multmatrix.MultmatSeq;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        seqMultiply();
    }

    public static void seqMultiply() {
        MultmatSeq multmatSeq = new MultmatSeq();
        Long start = System.currentTimeMillis();
        multmatSeq.multiply();
        Long end = System.currentTimeMillis();
        System.out.print( "Time elapsed : " + (end - start) );
    }
}
