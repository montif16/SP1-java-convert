import java.util.ArrayList;
import java.util.Scanner;

public class Dice {
   public ArrayList<Integer> pResult = new ArrayList<>();
    private static int diceThrow = 2;
   public int diceRoll() {
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        int diceResult = (int) (Math.random() * range) +min;
        pResult.add(diceResult);
        return diceResult;
    }
    public void displayResult(int result) {
        String jackpot = "You rolled the maximum, jackpot!";
        String lowestRoll = "You rolled the lowest, better luck next time";
        String average = "Nothing special, keep rolling";



        switch (result) {
            case 1:
                System.out.println(lowestRoll);
                break;
            case 2:
                System.out.println("A low roll.");
                break;
            case 3:
                System.out.println(average);
                break;
            case 4:
                System.out.println("Higher end roll. Nice");
                break;
            case 5:
                System.out.println("Very high roll, almost there.");
                break;
            case 6:
                System.out.println(jackpot);
                break;
            default:
                System.out.println("Are you sure that's a dice roll? maybe an error hmm");
                break;
        }
    }
    public int getDiceThrow(){
      return diceThrow;
    }
    public static void setDiceThrow(int throwCount){
       diceThrow = throwCount;
    }

    public void storeResult(int result) {
        pResult.add(result);
    }
}
