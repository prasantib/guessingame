import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        long from = 1;
        long to = 10;
        int randomNumber = random.nextInt((int)(to - from + 1)) + (int)from;
        int guessedNumber = 0;
        System.out.printf("I've chosen a number between %d and %d.\n", from, to);
        do
        {
            System.out.print("Try to guess it: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high! Guess again.");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low! Guess again.");
            else
                System.out.println("You got it! You're a good guesser.");
        } while (guessedNumber != randomNumber);
    }
} 