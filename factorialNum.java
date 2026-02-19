public class factorialNum {
    int f=6;
    public void display(){
        long fact=1;
        for(int i=1;i<=f;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+f+" is "+fact);
    }
    public static void main(String[] args) {
        factorialNum obj = new factorialNum();
        obj.display();
    }
}
