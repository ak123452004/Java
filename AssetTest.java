import java.util.Scanner;
abstract class Asset {
    String descriptor;
    String date;
    double current_value;
    Asset(String d, String dt, double cv) {
        descriptor = d;
        date = dt;
        current_value = cv;
    }
    abstract void displayDetails();
}
class Stock extends Asset {
    int num_shares;
    double share_price;
    Stock(String d, String dt, double cv, int ns, double sp) {
        super(d, dt, cv);
        num_shares = ns;
        share_price = sp;
    }
    void displayDetails() {
        System.out.println("\nStock Details:");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Number of Shares: " + num_shares);
        System.out.println("Share Price: " + share_price);
    }
}
class Bond extends Asset {
    double interest_rate;
    Bond(String d, String dt, double cv, double ir) {
        super(d, dt, cv);
        interest_rate = ir;
    }
    void displayDetails() {
        System.out.println("\nBond Details:");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Interest Rate: " + interest_rate + "%");
    }
}
class Savings extends Asset {
    double interest_rate;
    Savings(String d, String dt, double cv, double ir) {
        super(d, dt, cv);
        interest_rate = ir;
    }
    void displayDetails() {
        System.out.println("\nSavings Details:");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Interest Rate: " + interest_rate + "%");
    }
}
public class AssetTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Asset obj;
        System.out.println("Enter Stock Details:");
        System.out.print("Descriptor: ");
        String d1 = sc.nextLine();
        System.out.print("Date: ");
        String dt1 = sc.nextLine();
        System.out.print("Current Value: ");
        double cv1 = sc.nextDouble();
        System.out.print("Number of Shares: ");
        int ns = sc.nextInt();
        System.out.print("Share Price: ");
        double sp = sc.nextDouble();
        sc.nextLine();
        obj = new Stock(d1, dt1, cv1, ns, sp);
        obj.displayDetails();
        System.out.println("\nEnter Bond Details:");
        System.out.print("Descriptor: ");
        String d2 = sc.nextLine();
        System.out.print("Date: ");
        String dt2 = sc.nextLine();
        System.out.print("Current Value: ");
        double cv2 = sc.nextDouble();
        System.out.print("Interest Rate: ");
        double ir1 = sc.nextDouble();
        sc.nextLine();
        obj = new Bond(d2, dt2, cv2, ir1);
        obj.displayDetails();
        System.out.println("\nEnter Savings Details:");
        System.out.print("Descriptor: ");
        String d3 = sc.nextLine();
        System.out.print("Date: ");
        String dt3 = sc.nextLine();
        System.out.print("Current Value: ");
        double cv3 = sc.nextDouble();
        System.out.print("Interest Rate: ");
        double ir2 = sc.nextDouble();
        obj = new Savings(d3, dt3, cv3, ir2);
        obj.displayDetails();
        sc.close();
    }
}
