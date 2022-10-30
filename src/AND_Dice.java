import java.util.Random;

public class AND_Dice {
    public static void main(String args[]) {
        //Set variables to 0
        int dice1 = 0;
        int dice2 = 0;
        int doublesCount = 0;

        //Loop 11 times
        for (int i = 1; i < 101; i++) {
            //Roll each dice
            dice1 = roll(6);
            dice2 = roll(6);

            //Show each roll.
            if((dice1 == 6) && (dice2 == 6)){
                //Highlight the double 6
                System.out.println("Dice1 = " + dice1 + " Dice2 = " + dice2 + " *** DOUBLE 6 ***");
                //Increment the counter
                doublesCount++;
            } else {
                System.out.println("Dice1 = " + dice1 + " Dice2 = " + dice2);
            }
        }

        //Show the final double 6 tally.
        System.out.println("Double 6 was thrown " + doublesCount + " times out of 100.");
    }

    private static int roll(int sides) {
        //Return int between 1 and # of sides - always 6 at present lol.
        Random random = new Random();
        return random.nextInt(sides ) +1; // 1 to #sides

    }

}
