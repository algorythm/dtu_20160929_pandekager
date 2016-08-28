/**
 * Created by AndersWOlsen on 28-08-2016.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bag Pandekager-app\n");

        initialInfo();
        cookPancakes();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println("Er du meget sulten (j/n)?");
        if (input.toLowerCase().startsWith("j")) {
            System.out.println("Spis det hele selv!");
        } else if (input.toLowerCase().startsWith("n")) {
            System.out.println("Invitér naboerne til spisning!");
        }
    }

    public static void initialInfo() {
        Scanner pancakeCount = new Scanner(System.in);

        System.out.println("Hvor mange pandekager skal der laves?");
        int count = pancakeCount.nextInt();
        //pancakeCount.close();

        /*
         * 12,6 gram mel pr. stk
         * 3 ml mælk pr. stk
         * 0,2 æg pr. stk
         * - æg afrundes
         */

        double gFlour = 12.6 * count;
        double mlMilk = 3 * count;
        double eggs = Math.round(0.2 * count);

        System.out.println("Til " + count + " pandekager, skal der bruges:");
        System.out.println(gFlour + " gram mel, ");
        System.out.println(mlMilk + " ml mælk, og");
        System.out.println(eggs + " æg\n");

        System.out.println("Sæt en pande på komfuret. \nTænd komfuret.\nRør ingredienserne sammen i en skål.");
    }


    public static void cookPancakes() {
        boolean moreDoe = true;
        while (moreDoe) {
            System.out.print("Mere dej (j/n)? ");
            Scanner input = new Scanner(System.in);
            String answer = input.nextLine();

            if (answer.toLowerCase().startsWith("j")) {
                System.out.println("Hæld fedtstof og en klat dej på panden.");
                checkIfDone();
            } else if (answer.toLowerCase().startsWith("n")) {
                System.out.println("Sluk komfuret");
                moreDoe = false;
            }
        }
    }

    public static void checkIfDone() {
        boolean isDone = false;
        while (!isDone) {
            System.out.println("Har pandekagen fået nok (j/n)?");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.toLowerCase().startsWith("j")) {
                System.out.println("Tag pandekagen af panden.");
                isDone = true;
            } else if (input.toLowerCase().startsWith("n")) {
                System.out.println("Bag pandekagen lidt længere.");
            }
        }
    }
}
