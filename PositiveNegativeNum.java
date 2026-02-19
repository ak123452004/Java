public class PositiveNegativeNum {
    public PositiveNegativeNum(int num){
        if(num>0){
            System.out.println("Number is Positive : "+num);
        }
        else if(num<0){
            System.out.println("Number is Negative : "+num);
        }
    }

    public static void main(String[] args) {
        PositiveNegativeNum num1 = new PositiveNegativeNum(-8);
    }
}
