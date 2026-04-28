import java.util.Scanner;
interface SalesDepartment {
    void processSale(double amount);
}
interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}
class CommercialExecutive implements SalesDepartment, FinanceDepartment {
    double lastSaleAmount;
    String lastClient;
    public void processSale(double amount) {
        lastSaleAmount = amount;
        System.out.println("\nProcessing sale of amount: " + amount);
        System.out.println("Sale completed successfully");
    }
    public void generateInvoice(String clientName, double amount) {
        lastClient = clientName;
        System.out.println("Generating invoice...");
        System.out.println("Client Name: " + clientName);
        System.out.println("Invoice Amount: " + amount);
    }
    void showSummary() {
        System.out.println("\n--- Summary ---");
        System.out.println("Last Client: " + lastClient);
        System.out.println("Last Sale Amount: " + lastSaleAmount);
        System.out.println("Operations completed successfully");
    }
}
public class CommercialTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CommercialExecutive obj = new CommercialExecutive();
        System.out.print("Enter client name: ");
        String name = sc.nextLine();
        System.out.print("Enter sale amount: ");
        double amount = sc.nextDouble();
        obj.processSale(amount);
        obj.generateInvoice(name, amount);
        obj.showSummary();
        sc.close();
    }
}
