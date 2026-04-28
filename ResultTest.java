import java.util.Scanner;
interface Exam {
    void percent_cal();
}
class Student {
    String name;
    int roll_no;
    double marks1, marks2;
    void getData(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        roll_no = sc.nextInt();
        System.out.print("Enter Marks1: ");
        marks1 = sc.nextDouble();
        System.out.print("Enter Marks2: ");
        marks2 = sc.nextDouble();
        sc.nextLine();
    }
    void show() {
        System.out.println("\nName: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
    }
}
class Result extends Student implements Exam {
    double per;
    public void percent_cal() {
        per = (marks1 + marks2) / 2;
    }
    void display() {
        show();
        System.out.println("Percentage: " + per);
    }
}
public class ResultTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();
        r.getData(sc);
        r.percent_cal();
        r.display();
        sc.close();
    }
}
