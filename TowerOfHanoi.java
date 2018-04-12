import java.util.Scanner;
import static java.lang.System.*;

public class TowerOfHanoi
{
    private static Scanner scan = new Scanner(System.in);
                                        //'A'             'C'            'B'
    private static void moveDisk(int n, char fromTower, char toTower, char auxTower)
    {
        if(n == 1)
        {   out.println(fromTower + " ---> " + toTower);     }
        else
        {
            moveDisk(n - 1, fromTower, auxTower, toTower);
            out.println(fromTower+ " ---> " + toTower);
            moveDisk(n - 1, auxTower,toTower, fromTower);
        }
    }

    public static void main(String[] args){
        int disk;
        out.print("Enter number of disks ---> ");
        disk = scan.nextInt(); out.println("The moves are: \n");
        moveDisk(disk, 'A', 'C', 'B');
    }
}
