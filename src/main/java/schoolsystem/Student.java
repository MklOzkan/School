package schoolsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {

    static Scanner scan =  new Scanner(System.in);
    static Map<String, String> studentMap = new HashMap<>();

    public static void addStudent() {

        studentMap.put("123456987411", "Ali, Can, 1980, Matematik");
        studentMap.put("123456987412", "Veli, Yan, 1981, Fizik");
        studentMap.put("123456987413", "Ayse, Can, 1982, Kimya");
        studentMap.put("123456987414", "Ali, San, 1983, Kimya");
        studentMap.put("123456987415", "Alp, Yan, 1984, Matematik");

    }



    public static void studentPage() {

        String choice = "";

        do {
            System.out.println("============= STAR HIGH SCHOOL  =============\n" +
                    "============= TEACHER PAGE =============\n" +
                    "\n" +
                    "\t   1-Student Info\n" +
                    "\t   2-Find a Teacher with Last Name\n" +
                    "\t   3-Find a Teacher with class \t\t \n" +
                    "\t   4-Add Student with information\n" +
                    "\t   5-Delete registration with ID number\n" +
                    "\t   M- Main Menu\n" +
                    "\t   Q-Exit\n");
            choice= scan.nextLine();

            switch (choice){
                case "":

                    break;
            }

        }while (!choice.equalsIgnoreCase("q"));
    }
}
