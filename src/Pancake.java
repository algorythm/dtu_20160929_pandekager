/**
 * Created by AndersWOlsen on 29-08-2016.
 */
import java.util.Scanner;

public class Pancake {
    public static void printIngredients(int totalCount) {
        /*
         * 12,6 gram mel pr. stk
         * 3 ml mælk pr. stk
         * 0,2 æg pr. stk
         * - æg afrundes
         */

        double flour = 12.6 * totalCount;
        double milk = 3 * totalCount;
        double eggs = Math.round(0.2 * totalCount);
        if(eggs == 0)
            eggs = 1;

        System.out.println("Til " + totalCount + " pandekager, skal der bruges:");
        System.out.println(flour + " gram mel, ");
        System.out.println(milk + " ml mælk, og");
        System.out.println(eggs + " æg\n");

    }

    public static boolean question(String question) {
        boolean success = false;
        String answer;
        boolean tmp = true;

        while(!success) {
            System.out.print(question + " (j/n)? ");
            Scanner scanner = new Scanner(System.in);
            try {
                answer = scanner.nextLine();

                if (answer.toLowerCase().startsWith("j"))
                { tmp = true; success = true; }
//                    return true;
                else if (answer.toLowerCase().startsWith("n"))
                { tmp = false; success = true; }
//                    return false;
                else
                    System.out.println("Du skal skrive ja eller nej!");
            } catch (Exception e) {
                System.out.println("Du skal skrive ja eller nej!");
            }
        }
        if (tmp)
            return true;
        else
            return false;
    }

    public static void cookPancake() {
        System.out.println("Hæld fedtstof og en klat dej på panden.");
        boolean isDone = false;
        while (!isDone) {
            boolean answer = question("Har pandekagen fået nok");
            if (answer) {
                isDone = true;
            } else {
                System.out.println("Steg pandekagen lidt mere.");
            }
        }
    }
}
