import java.util.Scanner;
class Item {
    int code;
    float price;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item Code: ");
        code = sc.nextInt();
        System.out.print("Enter Item Price: ");
        price = sc.nextFloat();
    }
    void display() {
        System.out.println(code + "\t\t" + price);
    }
}

public class ItemUsingArray {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        float total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for Item " + (i + 1));
            items[i] = new Item();
            items[i].input();
        }
        System.out.println("\nCode\t\tPrice");
        System.out.println("----------------------");

        for (int i = 0; i < 5; i++) {
            items[i].display();
            total += items[i].price;
        }
        System.out.println("----------------------");
        System.out.println("Total Price = " + total);
    }
}
