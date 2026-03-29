public class AddTwoNum {
    int a,b;

    void add (){
        int sum=a+b;
        System.out.println("Sum is "+sum);
    }

    public static void main(String[] args) {
        AddTwoNum num = new AddTwoNum();
        num.a=8;
        num.b=19;
        num.add();
    }
}
