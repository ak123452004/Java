public class PrintName {
    String name;

    void display(){
        System.out.println("My Name is "+name);
    }

    public static void main(String[] args) {
        PrintName input = new PrintName();
        input.name="Ankit Kumar";
        input.display();
    }
}
