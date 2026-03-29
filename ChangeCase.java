import java.util.Scanner;
public class ChangeCase {
    public static void main(String[] args) {
        String s;
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s=sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } 
            else if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } 
            else {
                result += ch; 
            }
        }
        System.out.println("Changed string: " + result);
    }
}
