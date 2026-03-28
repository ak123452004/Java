import java.util.Scanner;

public class Count {
    String str;
    int upperCase;
    int lowerCase;
    int digits;
    int spaces;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        str=sc.nextLine();
    }
    void find(){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z')
                upperCase++;
            else if(ch>='a' && ch<='z')
                lowerCase++;
            else if(ch>='0' && ch<='9')
                digits++;
            else
                spaces++;
        }
    }
    void display(){
        System.out.println("Count of Uppercase character : "+upperCase);
        System.out.println("Count of Lowercase character : "+lowerCase);
        System.out.println("Count of Digits character : "+digits);
        System.out.println("Count of Spaces character : "+spaces);
    }
    public static void main(String[] args) {
        Count c = new Count();
        c.input();
        c.find();
        c.display();
    }
}
