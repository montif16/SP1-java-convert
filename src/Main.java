import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RunDialog.runDialog();
        Dice dice = new Dice();
        int sum = 0;
        int diceThrow = dice.getDiceThrow();

        // Create dice throws depending on the variable "diceThrow"
        for (int i = 1; i <= diceThrow; i++) {
            int result = dice.diceRoll();
            System.out.println("\nYour dice number #"+i+" Rolled: " + result);
            dice.storeResult(result); // Store the result in the ArrayList
            dice.displayResult(result); // Display the result
            sum += result; // Add the result to the sum
        }

        // Display the sum of dice rolls
        System.out.println("\nSum of your dice rolls: " + sum);
    }

}