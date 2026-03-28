import java.util.Scanner;

public class Replace{
    String s;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        s=sc.nextLine();
    }
    void display(){
        System.out.println(s.replace('d', 'f'));
    }
    public static void main(String[] args) {
        Replace re = new Replace();
        re.input();
        re.display();
    }
}
