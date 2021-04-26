//import javafx.scene.CacheHint;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Alliens alliens = new Alliens();
        Wizards wizards = new Wizards();
        Warriors warriors = new Warriors();

        Scanner scanner = new Scanner(System.in);
        int attempt = 0;
        int options = 2;
        Characters[] characters = new Characters[4];
        try {

           // characters = new Characters[4];


            System.out.println("Please Select The Characters: ");
            System.out.println("1: Wizzard \n2: Warriors  ");
            options = scanner.nextInt();
            while (attempt < 5) {


                if (options == 1) {

                    System.out.print("Please Enter Wizard's Name: ");
                    wizards.name = scanner.next();
                    wizards.attack();
                    alliens.attack();
                    wizards.heal();
                    alliens.attack();
                    wizards.heal();
                    characters[0] = wizards;
                    characters[1] = alliens;
                    characters[2] = alliens;
                    characters[3] = alliens;
                    characters[4] = wizards;


                }

                else if (options == 2) {

                    System.out.print("Please Enter Warrior's Name: ");
                    warriors.name = scanner.next();
                    warriors.attack();
                    alliens.attack();
                    characters[0] = warriors;
                    characters[1] = alliens;
                    characters[2] = alliens;
                    characters[3] = alliens;
                    characters[4] = warriors;



                }


                attempt++;

            }




        } catch (Exception e) {
            System.out.println("You Can Add Only Five Characters At A Time");

        }
        for (int i=0; i<characters.length; i++){
            System.out.println(characters[i].getClass().getName());
       }


    }
}
