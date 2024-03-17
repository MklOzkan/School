package schoolsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Teacher {

    static Scanner scan =  new Scanner(System.in);
    static Map<String, String> teacherMap = new HashMap<>();
    public static void addTeacher() {
        teacherMap.put("123456987411", "Ali, Can, 1980, Matematik");
        teacherMap.put("123456987412", "Veli, Yan, 1981, Fizik");
        teacherMap.put("123456987413", "Ayse, Can, 1982, Kimya");
        teacherMap.put("123456987414", "Ali, San, 1983, Kimya");
        teacherMap.put("123456987415", "Alp, Yan, 1984, Matematik");

    }

    public static void teacherMenu() throws InterruptedException {

        String choice = "";

        do {
            System.out.println("============= STAR HIGH SCHOOL  =============\n" +
                    "============= TEACHER PAGE =============\n" +
                    "\n" +
                    "\t   1-Teacher Info\n" +
                    "\t   2-Find a Teacher from Last Name\n" +
                    "\t   3-Find a Teacher from Branch \t\t \n" +
                    "\t   4-Add Teacher with information\n" +
                    "\t   5-Delete registration with ID number\n" +
                    "\t   M- Main Menu\n" +
                    "\t   Q-Exit\n");
            choice= scan.nextLine();

            switch (choice){
                case "1" ://Teacher Info
                    teacherListPrint();
                    break;
                case "2" ://Find a Teacher from Last Name
                    findTeacherFromLastname();
                    break;//Find a Teacher from Branch
                case "3" :

                    break;
                case "4" :

                    break;
                case "5" :

                    break;
                case "m" :
                case "M" :
                    Storage.mainMenu();
                    break;
                case "q" :
                case "Q" :
                    break;
                default:
                    System.out.println("Please make a valid choice");
            }




        }while (!choice.equalsIgnoreCase("q"));
        Storage.stopProject();
    }

    public static void findTeacherFromLastname() throws InterruptedException {

        System.out.println("Please enter the lastname of the Teacher");
        String lastname = scan.nextLine();

        Set<Map.Entry<String, String>> teacherEntrySet =teacherMap.entrySet();

        System.out.println("============= STAR HIGH SCHOOL  =============\n" +
                "=============FIND TEACHER WITH LASTNAME =============\n" +
                "ID Number        Name     Last Name      Birthdate      Branch");

        for (Map.Entry<String, String> each : teacherEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValuarr = eachValue.split(", ");

            if (lastname.equalsIgnoreCase(eachValuarr[1])){
                System.out.printf("%11s    %-9s  %-8s   %4s %-6s\n" , eachKey , eachValuarr[0],
                        eachValuarr[1], eachValuarr[2], eachValuarr[3]);
            }

        }
        Thread.sleep(5000);

    }

    public static void teacherListPrint() throws InterruptedException {
        Set<Map.Entry<String, String>> teacherEntrySet =teacherMap.entrySet();

        System.out.println("============= STAR HIGH SCHOOL  =============\n" +
                "============= TEACHER PAGE =============\n" +
                "ID Number        Name     Last Name      Birthdate      Branch");

        for (Map.Entry<String, String> each : teacherEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValuarr = eachValue.split(", ");
            System.out.printf("%11s    %-9s  %-8s   %4s %-6s\n" , eachKey , eachValuarr[0],
                    eachValuarr[1], eachValuarr[2], eachValuarr[3]);

        }
        Thread.sleep(5000);
    }
}
