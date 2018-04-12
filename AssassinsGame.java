import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import static java.lang.System.*;


public class AssassinsGame {
    String data;
    AssassinsGame next;
    private static AssassinsManager people = new AssassinsManager();
    private static AssassinsManager grave = new AssassinsManager();
    private static int testCases;

    /*Start Below*/
    public AssassinsGame(String a)
    {   data= a;
        next = null;
    }
    public AssassinsGame(String a, AssassinsGame next)
    {   data = a;
        this.next = next;
    }
    public static void addToClass() throws FileNotFoundException
    {
        Scanner scan = new Scanner(new File("namesAssassins.txt"));
        testCases = Integer.parseInt(scan.nextLine());
        while(testCases-- > 0)
        {
            String name = scan.nextLine();
            people.add(name);
        }
    }
    public static void main(String[] args) throws FileNotFoundException
    {

        addToClass();
        Scanner ask = new Scanner(System.in);
        String personKilled;
        boolean continuing = true;
        while(continuing != false)
        {
            if(people.size() == 0)
            {   break;  }
            if(people.get(0) == null)
            {   throw new NullPointerException(); }
            out.print("Who has been killed? --> ");
            personKilled = ask.nextLine();
            if (people.find(personKilled) >= 0) {
                grave.add(people.get(people.find(personKilled)));
                people.remove(people.find(personKilled));
                out.println("\nPeople Left: " + people.toString());
                out.println("Graveyard: " + grave.toString() + "\n");
            }
            else
                out.println("Person Not Found!\n");

        }


    }
}
