import java.util.Scanner;
class Grader {
    private int score;
    Grader(int score) {
        this.score = score;
    }
    char letterGrade() {
        if (score >= 90) return 'O';
        else if (score >= 80) return 'E';
        else if (score >= 70) return 'A';
        else if (score >= 60) return 'B';
        else if (score >= 50) return 'C';
        else return 'F';
    }
}
public class GraderTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;
        while (true) {
            System.out.print("Enter score (0-100): ");
            score = sc.nextInt();
            if (score >= 0 && score <= 100) break;
            System.out.println("Invalid input. Please enter a value between 0 and 100.");
        }
        Grader g = new Grader(score);
        char grade = g.letterGrade();
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
