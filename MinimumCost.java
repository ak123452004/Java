import java.util.Scanner;
class Tender {
    float cost;
    String companyName;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Company Name: ");
        companyName = sc.nextLine();
        System.out.print("Enter Cost: ");
        cost = sc.nextFloat();
    }
}
public class MinimumCost {
    public static void main(String[] args) {
        Tender[] t = new Tender[5];
        int minIndex = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for Tender " + (i + 1));
            t[i] = new Tender();
            t[i].input();
        }
        for (int i = 1; i < 5; i++) {
            if (t[i].cost < t[minIndex].cost) {
                minIndex = i;
            }
        }
        System.out.println("\nCompany with Minimum Cost:");
        System.out.println("Company Name: " + t[minIndex].companyName);
        System.out.println("Cost: " + t[minIndex].cost);
    }
}
