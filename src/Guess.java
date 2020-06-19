import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args){
        Random randomGenerator = new Random();
        // create number from 1-10
        int randomNumber = randomGenerator.nextInt(10) + 1;

        System.out.println("Try to guess a number!\nCan you guess it?");
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        do {
            userNumber = scanner.nextInt();
            if (userNumber < randomNumber) {
                System.out.println("Your guess is too low. Try again!");
            } else if (userNumber > randomNumber) {
                System.out.println("Your guess is too high. Try again!");
            }

        } while (userNumber != randomNumber);

        System.out.println("That's right, your a good guesser!");
    }
}
