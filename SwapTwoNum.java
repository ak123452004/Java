public class SwapTwoNum {
    public SwapTwoNum(int x,int y){
        System.out.println("Before Swaping numbers :");
        System.out.println("X : "+x);
        System.out.println("Y : "+y);

        int a;
        a=x;
        x=y;
        y=a;
        System.out.println("After Swaping Numbers :");
        System.out.println("X : "+x);
        System.out.println("Y : "+y);
    }

    public static void main(String[] args) {
        SwapTwoNum obj = new SwapTwoNum(25, 85);
    }
}
