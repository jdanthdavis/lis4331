import java.io.*;
import java.util.Scanner;

public class FileWriteRead
{
    public static void main(String [] args) {

    String myFile = "filewrite.txt";

    try{
        FileWriter fileWriter = new FileWriter(myFile);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Fourscore and seven years ago our fathers brought forth, ");
        bufferedWriter.newLine();
        bufferedWriter.write("on this continent, a new nation, conceived in liberty, ");
        bufferedWriter.newLine();
        bufferedWriter.write("and dedicated to the proposition that all men are created equal.");

        bufferedWriter.close();
    }
    catch(IOException ex)
    {
        System.out.println("Error writing to file" + myFile + "");
    }
}
}