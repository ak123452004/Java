import java.util.Scanner;
interface gross{
    void calculateGross();
}
class employee{
    protected int empId;
    protected String name;
    void getEmloyeeDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Id : ");
        empId=sc.nextInt();
        System.out.print("Enter your Name : ");
        name=sc.next();
    }
    void displayEmployeeDetails(){
        System.out.println("\nEmployee Id : "+empId);
        System.out.println("Employee Name : "+name);
    }
}
class salary{
    protected double basic,hra,da;
    void getSalaryDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary : ");
        basic=sc.nextDouble();
        System.out.print("Enter HRA : ");
        hra=sc.nextDouble();
        System.out.print("Enter DA : ");
        da=sc.nextDouble();
    }
}
class employeeSalary extends employee implements gross{
    private double grossSalary;
    salary s = new salary();
    public void calculateGross(){
        grossSalary=s.basic+s.hra+s.da;
    }
    void getData(){
        getEmloyeeDetails();
        s.getSalaryDetails();
    }
    void display(){
        displayEmployeeDetails();
        System.out.println("Gross Salary : "+grossSalary);
    }
}
public class Job {
    public static void main(String[] args) {
        employeeSalary emp = new employeeSalary();
        emp.getData();
        emp.calculateGross();
        emp.display();
    }
}
