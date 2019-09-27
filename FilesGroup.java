import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

// Q 10

class FilesGroup {
    public static void main(String[] args) throws IOException {
        File folder = new File("FilesGroupFolder/");
        File[] files = folder.listFiles();
        System.out.println("Files in current directory : ");
        for (File file : files) {
            System.out.println(file.getName() + " ");
        }
        System.out.println("Specify the file extension : (ex: '.txt' )");
        Scanner sc = new Scanner(System.in);
        String extension = sc.next();
        for (File file : files) {
            if (file.getName().endsWith(extension)) {
                System.out.println("Displaying contents of " + (file.getName()) + " : ");
                DisplayFile(file.getPath());
            }
        }
    }

    public static void DisplayFile(String filepath) {
        try {
            byte[] filecontent = Files.readAllBytes(Paths.get(filepath) );
            for (byte temp : filecontent) {
                System.out.print((char) temp);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}