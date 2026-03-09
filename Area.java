public class Area {
    void area(double r){
        double result = 3.14 * r * r;
        System.out.println("Area of Circle : "+result);
    }
    void area(int l,int b){
        int result = l * b;
        System.out.println("Area of Rectangle : "+result);
    }
    void area(double b,double h){
        double result = 0.5 * b * h;
        System.out.println("Area of Triangle : "+result);
    }
    public static void main(String[] args) {
        Area ar = new Area();
        ar.area(56);
        ar.area(8, 6);
        ar.area(9.1, 4.6);
    }
}
