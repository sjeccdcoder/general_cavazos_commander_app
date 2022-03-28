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
    lp : while(true) //labelling the while loop
    {
        System.out.println("Enter a command: ");
        ch = sc.nextInt(); //reading user's choice
        switch (ch)
        {
            case 1 : //for Quit
            System.out.println("Press 1 to quit the app \n");
            System.out.println("Thank you General Cavazos!");
            break;
            case 2 ://for list command
            System.out.println("01:  About Face\n");
            System.out.println("02:  Change Step\n");
            System.out.println("03:  Close Ranks\n");
            System.out.println("04:  Column Right\n");
            System.out.println("05:  Count Off\n");
            System.out.println("06:  Cover\n");
            System.out.println("07:  Eyes Right\n");
            System.out.println("08:  Fall In\n");
            System.out.println("09:  Fall Out\n");
            System.out.println("10:  Flight Attention\n");
            System.out.println("11:  Flight Halt\n");
            System.out.println("12:  Foward March\n");
            System.out.println("13:  Left Face\n");
            System.out.println("14:  Left Flank\n");
            System.out.println("15:  Open Ranks\n");
            System.out.println("16:  Order Arms\n");
            System.out.println("17:  Parade Rest\n");
            System.out.println("18:  Present Arms\n");
            System.out.println("19:  Present Arms\n");
            System.out.println("20:  Ready Front\n");
            System.out.println("21:  Report In\n");
            System.out.println("22:  Report Out\n");
            System.out.println("23:  Right Face\n");
            System.out.println("24:  Right Flank\n");
            System.out.println("25:  Right Step, March\n");
            System.out.println("26:  To the Rear, March\n");
            System.out.println("-----------------------------------------------------");
            System.out.println("General Cavazos Commander App");
            System.out.println("-----------------------------------------------------");
	    break;
        }
    }
    }
}
