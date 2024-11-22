import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        for(int i=1; i<=40; i++) {
//            System.out.println(i);
//            if(i % 3 == 0) {
//                System.out.println("Quack!");
//            }
//        }
//    }
        //---------------------
//
//        String pass;
//       do {
//           System.out.println("Pass:");
//           pass = scanner.next();
//           if (pass.equals("shark50")){
//               System.out.println("Access approved");
//           }
//       }
//           while (!pass.equals("shark50"));
//--------------------------------------------
//        int i = 0;
//        while (i<=10) {
//
//            System.out.println(i);
//            i++;
//        }
        //-------------------------------
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.println("Ghicește numărul corect (de la 1 la 100):");
        int userNumber;
        int nrIncercari = 0;

        do {
            userNumber = scanner.nextInt();
            nrIncercari++;
            if(userNumber > randomNumber) {
                System.out.println("Mai mic");
            }
            else if (userNumber < randomNumber) {
                    System.out.println("Mai mare");
        }
            else             {
                System.out.println("Corect! Ai ghicit in " + nrIncercari + " incercari.");

                            }

        }
        while (userNumber != randomNumber);


    }
    }
