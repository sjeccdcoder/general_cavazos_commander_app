// importing the class Scanner
import java.util.Scanner;
public class GeneralCavazos
{
    public static void main (String[] args) {
        int ch; //for storing users choice
        Scanner sc = new Scanner(System.in); //creating object of scanner class
        //displaying the menu
        System.out.println("-----------------------------------------------------");
        System.out.println("General Cavazos Commander App");
        System.out.println("-----------------------------------------------------");
        System.out.println("1: Quit");
        System.out.println("2: List all the commands");
        System.out.println("3: Issue a command");
        System.out.println("4: undo the last command that was issued");
        System.out.println("5: Redo the last command");
        System.out.println("-----------------------------------------------------");
        System.out.println("Enter a command");
    }
}
