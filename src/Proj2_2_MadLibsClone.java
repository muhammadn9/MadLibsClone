import java.util.Scanner;

public class Proj2_2_MadLibsClone {

    public static void main(String[] args) {



    Scanner keyboard = new Scanner(System.in);
    String adjective1;
    String girlsName;
    String adjective2;
    String occupation1;
    String place;
    String clothing;
    String hobby;
    String adjective3;
    String occupation2;
    String boysName;
    String mansName;


        System.out.println("enter an adjective: ");
        adjective1 = keyboard.nextLine();

        System.out.println("enter a girl's Name: ");
        girlsName = keyboard.nextLine();

        System.out.println("enter another adjective: ");
        adjective2 = keyboard.nextLine();

        System.out.println("enter an occupation: ");
        occupation1 = keyboard.nextLine();

        System.out.println("enter a place: ");
        place = keyboard.nextLine();

        System.out.println("enter a piece of clothing: ");
        clothing = keyboard.nextLine();

        System.out.println("enter a hobby: ");
        hobby = keyboard.nextLine();

        System.out.println("enter another adjective: ");
        adjective3 = keyboard.nextLine();

        System.out.println("enter another occupation: ");
        occupation2 = keyboard.nextLine();

        System.out.println("enter a boys name: ");
        boysName = keyboard.nextLine();

        System.out.println("enter a mans name: ");
        mansName = keyboard.nextLine();

        System.out.println("There was once a " + adjective1 + " girl named " + girlsName + ", who was a " + adjective2 +
                " " + occupation1 + " in the Kingdom of " + place + ". She loved to wear " + clothing + " and to "
                + hobby + ". She wanted to marry the " + adjective3 + " " + occupation2 + " named " + boysName +
                " but her father, King " + mansName + " forbid her from seeing him.");

    }//end main
}
