package schoolsystem;

import java.util.Scanner;

public class Storage {

    static Scanner scan = new Scanner(System.in);
    public static void mainMenu() {

        String choice = "";

        do {
        System.out.println("============= STAR HIGH SCHOOL  =============\n" +
                "============= MAIN PAGE =============\n" +
                "\n" +
                "\t   1-School Information\n" +
                "\t   2-Teacher Page\n" +
                "\t   3-Student Page\t\t \n" +
                "\t   Q-Exit\n");
        System.out.println("Please, make a choice from the Menu");
        choice= scan.nextLine();

        switch (choice){
            case "1"://School information
                break;
            case "2"://Teacher Page
                break;
            case "3"://Student Page
                break;
            case "q":
            case "Q":
                break;
            default:
                System.out.println("Please enter a valid choice");
        }

        }while(!choice.equalsIgnoreCase("q"));


    }
}
