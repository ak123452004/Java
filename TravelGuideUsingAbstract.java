import java.util.Scanner;
abstract class AbstractProduct{
    protected int product_id;
    protected String name;
    protected String description;
    public AbstractProduct(int product_id,String name,String description){
        this.product_id=product_id;
        this.name=name;
        this.description=description;
    }
    abstract void display();
}
class product extends AbstractProduct{
    protected double price;
    public product(int product_id,String name,String description,double price){
        super(product_id, name, description);
        this.price=price;
    }
    void display(){
        System.out.println("Product ID : "+product_id);
        System.out.println("Name : "+name);
        System.out.println("Description : "+description);
        System.out.println("Price : "+price);
    }
}
class book extends product{
    protected String isbn;
    protected String author;
    protected String title;
    public book(int product_id,String name,String description,double price,String isbn,String author,String title){
        super(product_id, name, description, price);
        this.author=author;
        this.title=title;
        this.isbn=isbn;
    }
    void display(){
        super.display();
        System.out.println("ISBN : "+isbn);
        System.out.println("Author : "+author);
        System.out.println("Title : "+title);
    }
}
class travelGuide extends book{
    private String country;
    public travelGuide(int product_id,String name,String description,double price,String isbn,String author,String title,String country){
        super(product_id, name, description, price, isbn, author, title);
        this.country=country;
    }
    void display(){
        super.display();
        System.out.println("Country : "+country);
    }
}
class compactDisc extends product{
    private String artist;
    private String title;
    public compactDisc(int product_id,String name,String description,double price,String artist,String title){
        super(product_id, name, description, price);
        this.artist=artist;
        this.title=title;
    }
    void display(){
        super.display();
        System.out.println("Artist : "+artist);
        System.out.println("Title : "+title);
    }
}
public class TravelGuideUsingAbstract{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Travel Guide Details :");
        System.out.print("Product Id : ");
        int pid1=sc.nextInt();
        sc.nextLine();
        System.out.print("Name : ");
        String name1=sc.nextLine();
        System.out.print("Description : ");
        String desc1=sc.nextLine();
        System.out.print("Price : ");
        double price1=sc.nextDouble();
        sc.nextLine();
        System.out.print("ISBN : ");
        String isbn=sc.nextLine();
        System.out.print("Author : ");
        String author=sc.nextLine();
        System.out.print("Title : ");
        String title1=sc.nextLine();
        System.out.print("Country : ");
        String country=sc.nextLine();
        travelGuide tg = new travelGuide(pid1, name1, desc1, price1, isbn, author, title1, country);
        System.out.println("\nEnter compact Disc Details : ");
        System.out.print("Product Id : ");
        int pid2=sc.nextInt();
        sc.nextLine();
        System.out.print("Name : ");
        String name2=sc.nextLine();
        System.out.print("Description : ");
        String desc2=sc.nextLine();
        System.out.print("Price : ");
        double price2=sc.nextDouble();
        sc.nextLine();
        System.out.print("Artist : ");
        String artist=sc.nextLine();
        System.out.print("Title : ");
        String title2=sc.nextLine();
        compactDisc cd = new compactDisc(pid2, name2, desc2, price2, artist, title2);
        System.out.println("\n----------------Displaying Products-------------");
        System.out.println("\nTravel Guide Details : ");
        tg.display();
        System.out.println("\nCompact Disc details : ");
        cd.display();
        sc.close();
    }
}
