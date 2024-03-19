package schoolsystem;


import java.time.LocalDate;
import java.util.*;

public class Student {

    static Scanner scan =  new Scanner(System.in);
    static Map<String, String> studentMap = new LinkedHashMap<>();

    public static void addStudent() {

        studentMap.put("123456987411", "Ali, Can, 2008, 3569, 12, A");
        studentMap.put("123456987412", "Veli, Yan, 2008, 3559, 12, B");
        studentMap.put("123456987413", "Ayse, Can, 2007, 4569, 12, A");
        studentMap.put("123456987414", "Ali, San, 2009, 1569, 11, A");
        studentMap.put("123456987415", "Alp, Yan, 2009, 3769, 11, A");

    }



    public static void studentPage() throws InterruptedException {

        String choice = "";

        do {
            System.out.println("============= STAR HIGH SCHOOL  =============\n" +
                    "============= TEACHER PAGE =============\n" +
                    "\n" +
                    "\t   1-Student Info\n" +
                    "\t   2-Find a Student with Last Name\n" +
                    "\t   3-Find a Student with class and branch \t\t \n" +
                    "\t   4-Add Student with information\n" +
                    "\t   5-Student's lessons Info\n" +
                    "\t   6-Delete registration with ID number\n" +
                    "\t   M- Main Menu\n" +
                    "\t   Q-Exit\n");
            choice= scan.nextLine();

            switch (choice){
                case "1":
                    studentList();//ok
                    break;
                case "2":
                    findStudentWithLastname();
                    break;
                case "3":
                    findStudentWithClassAndBranch();
                    break;
                case "4":
                    addStudentInfo();//ok
                    break;
                case "5":
                    lessonInfo();
                    break;
                case "6"://Lessons
                    deleteStudent();
                    break;
                case "M", "m":
                    break;
                case "q", "Q":
                    break;
            }

        }while (!choice.equalsIgnoreCase("q"));
        Storage.stopProject();
    }




    public static void studentList() throws InterruptedException {
        Set<Map.Entry<String, String>> studentEntrySet =studentMap.entrySet();

        System.out.println("============= STAR HIGH SCHOOL  =============\n" +
                "============= STUDENT PAGE =============\n" +
                "ID Number      Name     LastName      Birthdate  StudentId   Class  Branch");

        for (Map.Entry<String, String> each : studentEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValuarr = eachValue.split(", ");
            System.out.printf("%11s    %-9s  %-8s       %4s       %-8s %4s    %2s\n" , eachKey , eachValuarr[0],
                    eachValuarr[1], eachValuarr[2], eachValuarr[3], eachValuarr[4], eachValuarr[5]);

        }
        Thread.sleep(5000);

    }
    public static void findStudentWithLastname() throws InterruptedException {
        System.out.println("Please enter last name of student");
        String lName = scan.nextLine();

        Set<Map.Entry<String, String>> studentEntrySet =studentMap.entrySet();

        System.out.println("""
                ============= STAR HIGH SCHOOL  =============
                ============= FIND STUDENT WITH LAST NAME =============
                ID Number      Name     LastName      Birthdate  StudentId   Class  Branch""");

        for (Map.Entry<String, String> each : studentEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValuarr = eachValue.split(", ");
            if (lName.equalsIgnoreCase(eachValuarr[1])) {
                System.out.printf("%11s    %-9s  %-8s       %4s       %-8s %4s    %2s\n", eachKey, eachValuarr[0],
                        eachValuarr[1], eachValuarr[2], eachValuarr[3], eachValuarr[4], eachValuarr[5]);
            }

        }
        Thread.sleep(5000);
    }
    public static void findStudentWithClassAndBranch() throws InterruptedException {

        System.out.println("Please enter class of student");
        String classLevel = scan.nextLine();
        System.out.println("Please enter branch of student");
        String branch = scan.nextLine();

        Set<Map.Entry<String, String>> studentEntrySet =studentMap.entrySet();

        System.out.println("""
                ============= STAR HIGH SCHOOL  =============
                ============= FIND STUDENT WITH LAST NAME =============
                ID Number      Name     LastName      Birthdate  StudentId   Class  Branch""");

        for (Map.Entry<String, String> each : studentEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValuarr = eachValue.split(", ");
            if (classLevel.equalsIgnoreCase(eachValuarr[4])&&branch.equalsIgnoreCase(eachValuarr[5])) {
                System.out.printf("%11s    %-9s  %-8s       %4s       %-8s %4s    %2s\n", eachKey, eachValuarr[0],
                        eachValuarr[1], eachValuarr[2], eachValuarr[3], eachValuarr[4], eachValuarr[5]);
            }

        }
        Thread.sleep(5000);
    }
    public static void addStudentInfo() throws InterruptedException {
        String key ="";
        int l =0;
        do {

                System.out.println("Please enter your ID");
                key = scan.nextLine();
                l = key.length();
                if (!key.isEmpty()&&l==11){
                    continue;
                }else {
                    System.out.println("Id must not be empty and its length must be 11 ");
                    Thread.sleep(3000);
                }

        }while (key != null&&l!=11);

        String fName ="";
        do {

            System.out.println("Please enter first name");
            fName = scan.nextLine();
            if (!fName.isEmpty()){
                continue;
            }else {
                System.out.println("Name must not be empty!");
                Thread.sleep(2000);
            }

        }while (fName == null);

        String lName ="";
        do {
            System.out.println("Please enter Last name");
            lName = scan.nextLine();
            if (!lName.isEmpty()){
                continue;
            }else {
                System.out.println("Lastname must not be empty!");
                Thread.sleep(2000);
            }

        }while (lName==null);

        String yOfBirthdate = "";
        do {
            System.out.println("Please enter year of birthdate");
            yOfBirthdate = scan.nextLine();

            if (!yOfBirthdate.isEmpty()){
                continue;
            }else {
                System.out.println("Year of birthdate must not be empty!");
                Thread.sleep(2000);
            }
        }while (yOfBirthdate == null);

        LocalDate myDate = LocalDate.now();
        String registrationYear = String.valueOf(myDate.getYear());

        String tailNum = "";
        if (studentMap.size()<10){
            tailNum= "00" + (studentMap.size()+1);
        } else if (studentMap.size()<100) {
            tailNum= "0" + (studentMap.size()+1);
        }else {
            tailNum=  ""+studentMap.size()+1;
        }
        String studentId = registrationYear.substring(2) + yOfBirthdate.substring(2) + tailNum;

        String classLevel ="";
        do {
            System.out.println("Please enter class");
            classLevel = scan.nextLine();

            if (!classLevel.isEmpty()){
                continue;
            }else {
                System.out.println("Class must not be empty!");
                Thread.sleep(2000);
            }


        }while (classLevel==null);





        System.out.println("Please enter branch");
        String branch = scan.nextLine();

        String value = fName + ", " + lName + ", " +yOfBirthdate + ", " + studentId + ", " + classLevel + ", " + branch;
        studentMap.put(key,value);

    }
    public static void lessonInfo() {
    }

    public static void deleteStudent() throws InterruptedException {

        System.out.println("please enter the Id to delete teacher Info");
        String studentId= scan.nextLine();

        String deletedTeacherInfo = studentMap.get(studentId);

        String deletedValue = studentMap.remove(studentId);

        try {
            boolean result = deletedValue.equals(deletedTeacherInfo);
            System.out.println("The student with " + studentId + " no : " +"\""+ deletedTeacherInfo +"\""+ " successfully deleted.");
        } catch (Exception e) {
            System.out.println("Please enter a valid Id");
        }

        Thread.sleep(5000);
    }


}
