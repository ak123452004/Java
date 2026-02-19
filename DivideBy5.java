public class DivideBy5 {
    int num;
    
    void display(){
        if(num % 5 == 0){
            System.out.println(num+" Divisible by 5.");
        }
        else{
            System.out.println(num+" Not divisible by 5.");
        }
    }

    public static void main(String[] args) {
        DivideBy5 divide = new DivideBy5();
        divide.num=68;
        divide.display();
    }
}
