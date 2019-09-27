import java.io.*;

public class MultipleExp {

   public static void main(String args[]) {
       String s=null;
        try {
            int a[] = new int[2];
            System.out.println(a[3]);
            if (s.equals("gfg")) 
                    System.out.print("Same"); 
                else 
                    System.out.print("Not Same"); 

        } 
        catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Exception thrown  :" + e1);
        }
        catch(NullPointerException e2){ 
            System.out.print("Exception thrown  :" + e2); 
        } 
        catch(NegativeArraySizeException e3){
            System.out.print("Exception thrown  :" + e3); 
        }
    }
}