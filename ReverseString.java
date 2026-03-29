import java.util.Scanner;
public class ReverseString{
    public static void main(String[] args){
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        s = sc.nextLine();
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
