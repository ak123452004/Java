import java.util.Scanner;
abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}
class Box extends ThreeDObject {
    double length, width, height;
    public Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }
    double volume() {
        return length * width * height;
    }
}
class Cube extends ThreeDObject {
    double side;
    public Cube(double s) {
        side = s;
    }
    double wholeSurfaceArea() {
        return 6 * side * side;
    }
    double volume() {
        return side * side * side;
    }
}
class Cylinder extends ThreeDObject {
    double radius, height;
    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }
    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    double volume() {
        return Math.PI * radius * radius * height;
    }
}
class Cone extends ThreeDObject {
    double radius, height;
    public Cone(double r, double h) {
        radius = r;
        height = h;
    }
    double wholeSurfaceArea() {
        double l = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + l);
    }
    double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}
public class GeometryTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThreeDObject obj;
        System.out.println("Enter Box details:");
        System.out.print("Length: ");
        double l = sc.nextDouble();
        System.out.print("Width: ");
        double w = sc.nextDouble();
        System.out.print("Height: ");
        double h = sc.nextDouble();
        obj = new Box(l, w, h);
        System.out.println("Surface Area: " + obj.wholeSurfaceArea());
        System.out.println("Volume: " + obj.volume());
        System.out.println("\nEnter Cube details:");
        System.out.print("Side: ");
        double s = sc.nextDouble();
        obj = new Cube(s);
        System.out.println("Surface Area: " + obj.wholeSurfaceArea());
        System.out.println("Volume: " + obj.volume());
        System.out.println("\nEnter Cylinder details:");
        System.out.print("Radius: ");
        double r1 = sc.nextDouble();
        System.out.print("Height: ");
        double h1 = sc.nextDouble();
        obj = new Cylinder(r1, h1);
        System.out.println("Surface Area: " + obj.wholeSurfaceArea());
        System.out.println("Volume: " + obj.volume());
        System.out.println("\nEnter Cone details:");
        System.out.print("Radius: ");
        double r2 = sc.nextDouble();
        System.out.print("Height: ");
        double h2 = sc.nextDouble();
        obj = new Cone(r2, h2);
        System.out.println("Surface Area: " + obj.wholeSurfaceArea());
        System.out.println("Volume: " + obj.volume());
        sc.close();
    }
}
