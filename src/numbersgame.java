import java.util.Random;
import java.util.Scanner;

public class numbersgame {
    public static void main(String[] args) {
        int number = new Random().nextInt(100) + 1; // случайное число от 1 до 100
        Scanner in = new Scanner(System.in);
        int guess = in.nextInt(); // число, прочитанное с клавиатуры
        while (guess != number) {
            if (guess < number) {
                System.out.println("Меньше");
            } else {
                System.out.println("Больше");
            }
            guess = in.nextInt();
        }
        System.out.println("Вы победили. Yay.");
    }
}
