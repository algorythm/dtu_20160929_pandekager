/**
 * Created by AndersWOlsen on 28-08-2016.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bag Pandekager-app\n");
        boolean success = false;
        int totalPancakeCount = 0;

        while(!success) {
            System.out.print("Hvor mange pandekager skal bruges? ");
            Scanner scanner = new Scanner(System.in);
            try {
                totalPancakeCount = scanner.nextInt();
//                Pancake.totalCount = scanner.nextInt();
                success = true;
            } catch(Exception e) {
                System.out.println("Du skal angive et heltal!");
            }
        }

        Pancake.printIngredients(totalPancakeCount);

        System.out.println("Sæt en pande på komfuret. \nTænd komfuret.\nRør ingredienserne sammen i en skål.");

        for (int i = 0; i < totalPancakeCount; i++) {
           Pancake.cookPancake();
        }

        boolean moreDoe = true;
        while (moreDoe) {
            boolean answer = Pancake.question("Er der mere dej tilbage i skålen");
            if (answer)
                Pancake.cookPancake();
//                System.out.println("Hæld fedtstof og en klat dej på panden.");
            else
                moreDoe = false;
        }

        System.out.println("Sluk komfuret!");

       boolean answer = Pancake.question("Er du meget sulten");
        if (answer)
            System.out.println("Spis det hele selv!");
        else
            System.out.println("Invitér naboerne på besøg.");
    }
}
