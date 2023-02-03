import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count=0;
        int trials = 5;
        int guessNum;
        int i;
        int number = 1 + (int) (100 * Math.random());

        System.out.println("-----------------------------------------------------");
        System.out.println(" $$$$$$$   WELCOME TO NUMBER GUESSING GAME   $$$$$$$$ ");
        System.out.println("-----------------------------------------------------");
        System.out.println();
        System.out.println(" --> Note: Guess the number within 5 trials ");
        System.out.println(" --> Note: A number is chosen between 1 to 100 ");
        System.out.println();

        for (i = 0; i < trials; i++) {
            System.out.println("enter the Guess number: ");
            guessNum = sc.nextInt();

            if (number == guessNum) {
                System.out.println("Congratulations!! You Guessed Right Number ");
                System.out.println("your source is = "+count);

                break;
            } else if (number > guessNum && i != trials - 1) {
                System.out.println("The number is greater than " + guessNum);
                System.out.println();
                count++;
            } else if (number < guessNum && i != trials - 1) {
                System.out.println("The number is less than " + guessNum);
                System.out.println();
                count++;
            }
        }


        if (i == trials) {
            System.out.println("Sorry !! Your Chances Are Over.");
            System.out.println("Your Score is = "+count);
            System.out.println("The number was --->>> " + number);
        }
    }
}

