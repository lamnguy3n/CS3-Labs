import java.util.Scanner;
import static java.lang.System.*;
import java.io.IOException;

public class TextFileCreateClient
{
	static Scanner scan = new Scanner(System.in);
	static boolean contin = true;
	static boolean contins = true;
	private static String fileName;
	private static TextFileCreate test;
	private static String data;
	public static void main(String[] args) throws IOException
	{
		while(contin != false)
		{
			out.print("Enter File Name --> ");
			fileName = scan.nextLine();
			test = new TextFileCreate(fileName);
			while(contins != false)
			{
				out.print("Enter one item to add to data (type \"stop\" to end) ---> ");
				data = scan.nextLine();
				if(data.equals("stop"))
				{	 break;	  }
				test.addToFile(data);
			}
			if(data.equals("stop"))
			{ 	test.closeStream(); break; 	}
		}
	}
}