import java.util.Scanner;
interface Mango {
    void showMangoType();
}
class Winter implements Mango {
    public void showMangoType() {
        System.out.println("Winter Mango: Available in limited quantity, stored or imported varieties.");
    }
}
class Summer implements Mango {
    public void showMangoType() {
        System.out.println("Summer Mango: Fresh seasonal mangoes like Alphonso, Kesar, Dasheri.");
    }
}
public class MangoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mango m;
        System.out.println("1. Winter Mango");
        System.out.println("2. Summer Mango");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                m = new Winter();
                m.showMangoType();
                break;
            case 2:
                m = new Summer();
                m.showMangoType();
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
