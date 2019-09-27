import java.io.*;
import java.util.Scanner;

class Consecutive{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String string=input.nextLine();
        String[] arrOfStr = string.split(",");
        int [] numbers= new int[7];
        int count=0;
        for(int i=0;i<arrOfStr.length;i++){
            numbers[i] = Integer.parseInt(arrOfStr[i]);
        }
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i+1]==numbers[i]+1 || numbers[i+1]==numbers[i]-1 ){
                count=1;
            }
            else{
                count=0;
                break;
            }
        }
        if(count==1){
             System.out.println(string + " are consecutive numbers");
        }
        else{
            System.out.println(string + " are non-consecutive numbers");
        }
        input.close();
    }
}