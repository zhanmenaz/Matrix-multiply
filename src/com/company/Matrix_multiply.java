package com.company;

import java.util.Scanner;

/**
 * Created by Мечта on 30.06.2016.
 */
 class Matrix_multiply {
public static void main(String arg []){
    int rows1, columns1, rows2, columns2, sum=0;
    int c,d,k;
    Scanner in= new Scanner(System.in);
    System.out.println(" Enter the number of rows1 and columns1 ");
    rows1 = in.nextInt();
    columns1 = in.nextInt();

    int [][] first = new int [rows1][columns1];

    System.out.println("Enter the elements of first matrix");

    for(c =0; c< rows1; c++)
        for (d =0; d < columns1; d++)
            first [c][d] = in.nextInt();

    System.out.println("Enter the number of rows2 and columns2");
    rows2 = in.nextInt();
    columns2 = in.nextInt();

    if( rows1!= rows2)
    System.out.println("Matrices cant be multipled");

    else{
        int[][] second = new int[rows2][columns2];
        int[][] multiply = new int[columns1][columns2];
        System.out.println(" Enter the elements of second matrix");

        for( c=0; c< rows2; c++);
            for( d=0; d< columns2; d++);
                second[c][d]=in.nextInt();

        for(c=0; c<rows1; c++);
        {
            for(d=0; d<columns2; d++);
            {
                for(k=0; k<rows2;k++);
                {
                    sum= sum+ first[c][k]*second[k][d];
                }

                multiply[c][d]=sum;
                sum=0;
            }
        }

        System.out.println("Matrices: ");
        for(c=0; c<rows1;c++)
        {
            for (d=0; d<columns2;d++)
                System.out.println(multiply[c][d]+ "\t");
            System.out.println("\n");
        }
    }

}
}
