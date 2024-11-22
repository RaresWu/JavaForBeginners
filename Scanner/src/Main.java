import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
        System.out.println("Ghicește numărul corect (de la 1 la 5):");
        int userNumber = scanner.nextInt();

        if(userNumber == randomNumber) {
            System.out.println("Corect!");

        }

        else {
            System.out.println("Încearcă din nou:");
            userNumber = scanner.nextInt();
            System.out.println("Încearcă din nou:");
            userNumber = scanner.nextInt();
            if (userNumber == randomNumber) {
                System.out.println("Corect!");
            } else {
                System.out.println("Necâștigător.");
            }
        }

    }
}