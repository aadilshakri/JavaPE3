import java.io.*;
import java.util.Scanner;

class Chess{
    public static void main(String[]args){
        String [][] chess = new String[8][8];
        for(int i=0;i<8;i+=2){
            for(int j=0;j<8;j+=2){
                chess[i][j]="BB|";
            }
            for(int j=1;j<8;j+=2){
                chess[i][j]="WW|";
            }
        }
        for(int i=1;i<8;i+=2){
            for(int j=0;j<8;j+=2){
                chess[i][j]="ww|";
            }
            for(int j=1;j<8;j+=2){
                chess[i][j]="BB|";
            }
        }
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print(chess[i][j]);
            }
            System.out.println();
        }

    }
}