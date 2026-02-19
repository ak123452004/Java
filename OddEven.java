public class OddEven {
    int num;
     
    void display(){
        if(num % 2 == 0){
            System.out.println("Even number : "+num);
        }
        else{
            System.out.println("Odd number : "+num);
        }
    }

    public static void main(String[] args) {
        OddEven value = new OddEven();
        value.num=87;
        value.display();
    }
}
