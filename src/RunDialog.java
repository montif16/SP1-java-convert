import java.util.Scanner;

public class RunDialog {
    public static void runDialog(){
        System.out.println("How many dice do you wish to throw? Please enter an amount\n");
        Scanner scanChoice = new Scanner(System.in);
        int choice = scanChoice.nextInt();
        if(choice == 1) {
            System.out.println("You chose to roll " + choice + " dice.");
        } else {
            System.out.println("You chose to roll " + choice + " dices.");
        }
         Dice.setDiceThrow(choice);
    }
}
