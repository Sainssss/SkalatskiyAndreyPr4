import java.util.Random;
import java.util.Scanner;

class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Вгадуйте число від 1 до 100:");
        guess = scanner.nextInt();
        attempts++;

        while (guess != numberToGuess) {
            if (guess < numberToGuess) {
                System.out.println("Загадане число більше.");
            } else {
                System.out.println("Загадане число менше.");
            }
            guess = scanner.nextInt();
            attempts++;
        }

        System.out.println("Ви вгадали число за " + attempts + " спроб!");

        numberToGuess = random.nextInt(100) + 1;
        attempts = 0;
        System.out.println("Спробуйте ще раз вгадати число від 1 до 100:");
        do {
            guess = scanner.nextInt();
            attempts++;
            if (guess < numberToGuess) {
                System.out.println("Загадане число більше.");
            } else if (guess > numberToGuess) {
                System.out.println("Загадане число менше.");
            }
        } while (guess != numberToGuess);

        System.out.println("Ви вгадали число за " + attempts + " спроб!");
    }
}
