public class GradeSystem {
    int number;
    void display(){
        if(number>=90){
            System.out.println("Grade A for "+number);
        }
        else if(number>=80){
            System.out.println("Grade B for "+number);
        }
        else if(number>=70){
            System.out.println("Grade C for "+number);
        }
        else if(number>=60){
            System.out.println("Grade D for "+number);
        }
        else if(number>=40){
            System.out.println("Grade E for "+number);
        }else if(number<40){
            System.out.println("Grade F for "+number);
        }
    }
    public static void main(String[] args) {
        GradeSystem grade = new GradeSystem();
        grade.number=86;
        grade.display();
    }
}
