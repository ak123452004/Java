public class AreaPerimeter {
    double length;
    double width;

    void display(){
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Area of Rectangle is "+area);
        System.out.println("Perimeter of Rectangle is "+perimeter);
    }
    
    public static void main(String[] args) {
        AreaPerimeter num = new AreaPerimeter();
        num.length=54;
        num.width=42;
        num.display();
    }
}
