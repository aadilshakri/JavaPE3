import java.io.*;
import java.util.*;


class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        // Call constructor of parent Exception 
        super(s); 
    } 
} 
  
// A Class that uses above MyException 
class ConstructorExp{ 
    // Driver Program 
    public static void main(String args[]) 
    { 
        try
        { 
            // Throw an object of user defined exception 
            throw new MyException("Aadil Shakri"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Caught"); 
  
            // Print the message from MyException object 
            System.out.println(ex); 
        } 
        finally{
            System.out.println("I am here");
        }
    } 
} 