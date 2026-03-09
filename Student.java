public class Student {
    int id;
    String name;
    Student(){
        id = 0;
        name = "Unknown";
    }
    Student(int i){
        id = i;
        name = "Not Assigned Yet";
    }
    Student(int j,String n){
        id = j;
        name = n;
    }
    void display(){
        System.out.println("Id : "+id+" Name : "+name);
    }
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student(567);
        Student stu3 = new Student(587,"Ankit Kumar");
        stu1.display();
        stu2.display();
        stu3.display();
    }
}
