import java.io.*;
import java.util.Scanner;


class StudentMarks{
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        int [] stuGrades= new int [numOfStudents];
        for(int i=0;i<numOfStudents;i++){
            int temp = scanner.nextInt();
            try{
                if(temp<0 || temp>100){
                    throw new Exception();
                }else{
                    stuGrades[i]=temp;
                }
            }
            catch (Exception e){
                System.out.println("Error");
                i--;
            }
        }
    }
}
