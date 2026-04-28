import java.util.Scanner;
class Books {
    String author;
    String title;
    double price;
    String publisher;
    int stock;
    Books(String a, String t, double p, String pub, int s) {
        author = a;
        title = t;
        price = p;
        publisher = pub;
        stock = s;
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Publisher: " + publisher);
        System.out.println("Stock: " + stock);
        System.out.println();
    }
}
public class BookShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Books[] b = new Books[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details of Book " + (i + 1));
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            System.out.print("Publisher: ");
            String publisher = sc.nextLine();
            System.out.print("Stock: ");
            int stock = sc.nextInt();
            System.out.print("\n");
            sc.nextLine();
            b[i] = new Books(author, title, price, publisher, stock);
        }
        double maxPrice = b[0].price;
        int index = 0;
        for (int i = 1; i < 10; i++) {
            if (b[i].price > maxPrice) {
                maxPrice = b[i].price;
                index = i;
            }
        }
        System.out.println("\nBook with Highest Price:");
        b[index].display();
        sc.close();
    }
}
