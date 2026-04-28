import java.util.Scanner;
interface Department {
    String deptName = "CSE";
    String deptHead = "Dr. Sharma";
    void printDepartment();
}
class Hostel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;
    void getHostelData(Scanner sc) {
        System.out.print("Enter Hostel Name: ");
        hostelName = sc.nextLine();
        System.out.print("Enter Hostel Location: ");
        hostelLocation = sc.nextLine();
        System.out.print("Enter Number of Rooms: ");
        numberOfRooms = sc.nextInt();
        sc.nextLine();
    }
    void printHostelData() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}
class Student extends Hostel implements Department {
    String studentName;
    int regdNo;
    String electiveSubject;
    double avgMarks;
    void getData(Scanner sc) {
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();
        System.out.print("Enter Registration Number: ");
        regdNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Elective Subject: ");
        electiveSubject = sc.nextLine();
        System.out.print("Enter Average Marks: ");
        avgMarks = sc.nextDouble();
        sc.nextLine();
        getHostelData(sc);
    }
    void printData() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + studentName);
        System.out.println("Regd No: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
        printHostelData();
        printDepartment();
    }
    public void printDepartment() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Head: " + deptHead);
    }
}
public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[10];
        int count = 0;
        while (true) {
            System.out.println("\n1. Admit new student");
            System.out.println("2. Migrate a student");
            System.out.println("3. Display details");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    if (count < 10) {
                        s[count] = new Student();
                        s[count].getData(sc);
                        count++;
                    } else {
                        System.out.println("Limit reached");
                    }
                    break;
                case 2:
                    System.out.print("Enter Registration Number to migrate: ");
                    int r = sc.nextInt();
                    sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (s[i].regdNo == r) {
                            System.out.println("Enter new Hostel Details:");
                            s[i].getHostelData(sc);
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Student not found");
                    break;
                case 3:
                    for (int i = 0; i < count; i++) {
                        s[i].printData();
                    }
                    break;
                case 4:
                    System.out.println("Exiting.......");
                    System.exit(0);
            }
        }
    }
}
