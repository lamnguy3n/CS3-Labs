import java.io.File;
import java.util.Scanner;

public class HerringBone {
    static int c;
    static int r;

    public static void main(String[] arr) throws Exception
    {
        Scanner scanner = new Scanner(new File("herringbone.dat"));
        int count = scanner.nextInt();

        while(count-->0)
        {
            encrypt(scanner.nextInt(), scanner.nextInt(), scanner.nextLine(), scanner.nextLine());
        }
    }


    public static void encrypt(int width, int height, String feed, String word)
    {
        c = 0;                                              //Columns
        r = 1;                                              //Rows
        String[] arrayWord = word.split("");
        int indexOf1DArray = 0;                             //Index in the array above
        String[][] twoDArray = new String[height][width];

        for(int a = 0; a < twoDArray.length; a++)           //Adds the characters into an array
        {
            for(int b = 0; b < twoDArray[0].length;b++)
            {
                twoDArray[a][b] = arrayWord[indexOf1DArray];
                indexOf1DArray++;
            }
        }
        for(int a = 0; a < twoDArray.length; a++)
        {
            for(int b = c /*starts at 0*/; b < twoDArray[0].length;++b)     //Horizontal Movement
            {
                System.out.print(twoDArray[a][b]);
            }
            ++c;
            for(int c = r /*starts at 1*/ ; c < twoDArray.length;++c)       //Vertical Movement
            {
                System.out.print(twoDArray[c][a]);
            }
            ++r;
        }
        System.out.println();
    }
}
