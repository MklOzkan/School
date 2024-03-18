package schoolsystem;

import java.util.Scanner;

public class Storage {

    static Scanner scan = new Scanner(System.in);
    public static void mainMenu() throws InterruptedException {

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
                schoolInformationPrint();
                break;
            case "2"://Teacher Page
                Teacher.teacherPage();
                break;
            case "3"://Student Page
                Student.studentPage();
                break;
            case "q":
            case"Q":
                break;
            default:
                System.out.println("Please make a valid choice");
        }

        }while(!choice.equalsIgnoreCase("q"));

        Storage.stopProject();


    }

    public static void schoolInformationPrint() throws InterruptedException {
        System.out.println("============= STAR HIGH SCHOOL  =============\n" +
                "\t\t Address : " + School.address +
                "\n\t\t Phone Number : " + School.mobilePhone);
        Thread.sleep(5000);
    }


    public static void stopProject() {
        System.out.println("You exited from Application");
    }
}
