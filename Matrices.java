import java.io.*;
import java.util.Scanner;

class Matrices{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows of matrix: ");
        int no_rows= input.nextInt();
        System.out.print("Input number of columns of matrix: ");
        int no_columns= input.nextInt();
        int [][] matrix1 = new int[no_rows][no_columns];
        System.out.println("Input elements of first matrix: ");
        for(int i=0;i<no_rows;i++){
            for(int j=0;j<no_columns;j++){
                matrix1[i][j]=input.nextInt();
            }
        }
        int [][] matrix2 = new int[no_rows][no_columns];
        System.out.println("Input elements of second matrix: ");
        for(int i=0;i<no_rows;i++){
            for(int j=0;j<no_columns;j++){
                matrix2[i][j]=input.nextInt();
            }
        }
        int [][] sum_matrix = new int[no_rows][no_columns];
        for(int i=0;i<no_rows;i++){
            for(int j=0;j<no_columns;j++){
                sum_matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int i=0;i<no_rows;i++){
            for(int j=0;j<no_columns;j++){
               System.out.print(sum_matrix[i][j]);
            }
            System.out.println();
        }
    }
}