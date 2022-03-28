// importing the class Scanner
import java.util.Scanner;
public class Menu
{
    public static void main (String[] args) {
        int ch; //for storing users choice
        Scanner sc = new Scanner(System.in); //creating object of scanner class
        //displaying the menu
        System.out.println("-----------------------------------------------------");
        System.out.println("General Cavazos Commander App");
        System.out.println("-----------------------------------------------------");
        System.out.println("1: Issue a command");
        System.out.println("l: List all the commands");
        System.out.println("u: Undo the last command that was issued");
        System.out.println("r: Redo the last command that was issued");
        System.out.println("q: Quit");
        System.out.println("-----------------------------------------------------");
        System.out.println("Enter a command");
    lp : while(true) //labelling the while loop
    {
        System.out.println("[General-Cavazos]: ");
        ch = sc.nextInt(); //reading user's choice
        switch (ch)
        {
            case 1 : //for Quit
            System.out.println("Press 1 to quit the app \n");
            System.out.println("Thank you General Cavazos!");
	    break;
        }
    }
    }
}
