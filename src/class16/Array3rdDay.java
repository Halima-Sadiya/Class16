/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class16;

import java.util.Scanner;

/**
 *
 * @author Singer BD
 */
public class Array3rdDay {
    public static void main(String[] args) {
        Scanner user_input=new Scanner (System.in);
        
        System.out.println("Enter  Matrix-A value");
        int [][] matrix1=new int[2][3];
        
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                matrix1[row][col]=user_input.nextInt();
            }
        
        }
        System.out.println();
        System.out.println("Enter Matrix-B value");
        int [][] matrix2=new int[2][3];
        for(int row2=0; row2<2;row2++){
            for(int col2=0;col2<3;col2++){
                matrix2[row2][col2]=user_input.nextInt();
            }
        }
        
        System.out.println("A :");
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print(" "+matrix1[row][col]);
            }
            System.out.println("");
        }
        System.out.println("B :");
        for(int row2=0; row2<2;row2++){
            for(int col2=0;col2<3;col2++){
                System.out.print(" "+matrix2[row2][col2]);
            }
            System.out.println("");
               
    }
    
}
