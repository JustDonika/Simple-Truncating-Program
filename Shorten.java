import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

/**
 * Simple Java program to shorten text files to a desired length.
 */
public class Shorten{
    public static void main(String[] args) throws IOException {
        //Set desired length and text to shorten here.
        String filename = "Sqrt(2) - Dec.txt";
        int desiredLength = 10000000;
        //Read in file. String content = Files.readString(Path.of(filename), StandardCharsets.US_ASCII) could work, but causes memory issues for longer files. This is more versatile.
        Scanner sc = new Scanner(new File(filename));
        sc.useDelimiter("");
        StringBuilder content = new StringBuilder();
        while(sc.hasNext() && desiredLength>0){
            desiredLength--;
            content.append(sc.next());
        }
        //Outputs as file.
        File output = new File("Output.txt");
        FileWriter FW = new FileWriter("Output.txt");
        FW.write(String.valueOf(content));
        FW.close();
        //Done!
        System.out.println("File shortened");
    }
}