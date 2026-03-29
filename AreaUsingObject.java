class Point{
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    void displayPoint(){
        System.out.println("Center Point: (" + x + ", " + y + ")");
    }
}
class Circle{
    Point center;
    double radius;
    Circle(int x, int y, double radius){
        center = new Point(x, y);
        this.radius = radius;
    }
    void displayCircle(){
        center.displayPoint();
        System.out.println("Radius: " +radius);
        System.out.println("Area of Circle: " +3.14 *radius*radius);
    }
}
public class AreaUsingObject{
    public static void main(String[] args) {
        Circle c = new Circle(9, 5, 7);
        c.displayCircle();
    }
}
