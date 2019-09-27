import java.io.*;
import java.util.Scanner;

class Places{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int no_places = input.nextInt();
        String[] places = new String[no_places];
        String[] newStr= new String[no_places];
        for(int i=0;i<no_places;i++){
            places[i]=input.next();
        }
        for(int i=0; i<no_places; i++){
            int k=0;
            String[] str= new String[places[i].length()];
            for(int j=0;j<places[i].length();j++){
                if(places[i].charAt(j)!='a' && places[i].charAt(j)!='i' && places[i].charAt(j)!='e' && places[i].charAt(j)!='o' && places[i].charAt(j)!='u'){
                    str[k]=places[i].substring(j,j+1);
                    k++;
                }
            }
            String str1 = "";
            for(int j=0; j<str.length; j++){
                if (str[j]!=null)
                str1+=str[j];
            }
            newStr[i]=str1;
        }
        for(int i=0; i<no_places; i++){
            System.out.println(newStr[i]);
        }
    }
}