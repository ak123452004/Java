public class OuterClass {
    String outerMessage = "This is Outer Class .";
    
    public class InnerClass {
        void display(){
            System.out.println(outerMessage);
            System.out.println("This is Inner Class .");
        }  
    }
    public void demoInnerClass(){
        InnerClass inner = new InnerClass();
        inner.display();
    }
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.demoInnerClass();
    }
}
