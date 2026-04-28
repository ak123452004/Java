import java.util.Scanner;
class Book {
    String author;
    String title;
    double price;
    String publisher;
    Book(String a, String t, double p, String pub) {
        author = a;
        title = t;
        price = p;
        publisher = pub;
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Publisher: " + publisher);
        System.out.println();
    }
}
public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] b = new Book[4];
        for (int i = 0; i < 4; i++) {
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

            b[i] = new Book(author, title, price, publisher);
        }
        double maxPrice = b[0].price;
        int index = 0;
        for (int i = 1; i < 4; i++) {
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
