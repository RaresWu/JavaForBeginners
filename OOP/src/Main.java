import java.util.Scanner;

public class Main {

    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    static void displayGuests()  {
        System.out.println("_______________________________________________________\n- Guests -\n");
        for (int i = 0; i < guests.length; i++) {
            System.out.println((i + 1) + ". " + (guests[i] == null ? "--" : guests[i]));
        }
    }

    static void displayMenu() {
        System.out.println("_______________________________________________________");
        System.out.println("- Menu -");
        System.out.println();

        System.out.println("1 - Add Guest");
        System.out.println("2 - Remove Guest");
        System.out.println("3 - Exit");

    }

    static int getOption() {
        System.out.print("Option: ");
        int option = scanner.nextInt();
        System.out.println();
        return option;
    }

    public static void main(String[] args) {

        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Molly";
        guests[4] = "Christopher";


        do {
            displayGuests();
            displayMenu();
            int option = getOption();

            if (option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print("Name: ");
                        guests[i] = scanner.next();
                        break;
                    }
                }
            }
            else if (option == 2) {
                System.out.print("Name: ");
                String name = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null && guests[i].equals(name)) {
                        guests[i] = null;
                        break;
                    }
                }
            }
            else if (option == 3) {
                System.out.println("Exiting...");
                break;
            }
        } while (true);

    }



}