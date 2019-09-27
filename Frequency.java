import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Q 10

class Frequency{
    public static void main(String[] args) throws IOException{
        File text_file = new File("FrequencyTextFile.txt");
        FileReader fileReader = new FileReader(text_file);
        BufferedReader bufferedReader =  new BufferedReader(fileReader);

        Map <String, Integer> word_frequency = new HashMap<>();
        while( true ){
            String text = bufferedReader.readLine();

            // break case when end of file
            if( text == null){
                break;
            }
            String[] words = text.split(" |\\,|\\.");
            for(int i=0;i<words.length;i++){
                if( word_frequency.get(words[i]) == null ){
                    // new word
                    word_frequency.put(words[i], new Integer (1) );
                    continue;
                }
                word_frequency.put(words[i], new Integer (word_frequency.get(words[i]) + 1) );
            }
        }
        bufferedReader.close();

        for(Map.Entry m : word_frequency.entrySet() ){
            System.out.println(m.getKey() + " - " + m.getValue() );
        }
        
    }
}