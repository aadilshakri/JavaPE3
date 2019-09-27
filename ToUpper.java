import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Q 09

class ToUpper{
    public static void main(String[] args) throws IOException{
        File text_file = new File("ToUpperTextFile.txt");
        FileReader fileReader = new FileReader(text_file);
        BufferedReader bufferedReader =  new BufferedReader(fileReader);
        String text = bufferedReader.readLine();
        System.out.println(text.toUpperCase());
    }
}