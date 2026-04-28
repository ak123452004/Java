import java.util.Scanner;
class TollBooth {
    int totalCars = 0;
    int unpaidCars = 0;
    int amountCollected = 0;
    void payingCar() {
        totalCars++;
        amountCollected += 50;
    }
    void nonPayingCar() {
        totalCars++;
        unpaidCars++;
    }
    void display() {
        System.out.println("Total cars passed: " + totalCars);
        System.out.println("Cars not paid: " + unpaidCars);
        System.out.println("Total amount collected: Rs. " + amountCollected);
    }
}
public class TollBoothTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TollBooth t = new TollBooth();
        while (true) {
            System.out.println("\n1. Paying Car");
            System.out.println("2. Non-Paying Car");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    t.payingCar();
                    break;
                case 2:
                    t.nonPayingCar();
                    break;
                case 3:
                    t.display();
                    break;
                case 4:
                    System.out.println("Exiting..........");
                    System.exit(0);
            }
        }
    }
}
