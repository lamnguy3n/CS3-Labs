import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class TextFileCreate
{
    private static FileWriter writer;
    static Scanner scan = new Scanner(System.in);

    //Constructor which creates a new text file in the folder \"Computer Science\"
    public TextFileCreate(String fileName) throws IOException
    {
        writer = new FileWriter(new File("h://Computer Science//" + fileName + ".txt"));
    }

    //Adds data to the file
    public void addToFile(String adding) throws IOException
    {
        writer.write(adding + "\n");
    }
    public void addToFile(Set<String> set) throws IOException
    {
        writer.write(set+ "\n");
    }
    public void addToFile(int num) throws IOException
    {
        writer.write(num+ "\n");
    }
    public void addToFile(double num) throws IOException
    {
        writer.write(num+ "\n");
    }
    public void addToFile(char character) throws IOException
    {
        writer.write(character+ "\n");
    }

    //Close the stream
    public void closeStream() throws IOException
    {
        writer.close();
    }
}

