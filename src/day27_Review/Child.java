package day27_Review;

public class Child extends Baba{
    int i  = 100;


    {
        m2();
        System.out.println("Child First instance block");
    }
    Child(){
        System.out.println("Child Constructor");
    }
    public static void main(String[] args) {
        Child t = new Child();
        //if this object creation was not here then the output would be only "Child main"
        System.out.println("Child main");

        //now If I add another object here. then it will repeat the instance control flow
        //Lesson04_Instance_Control_Flow tt = new Lesson04_Instance_Control_Flow();
        // When extending another class only child class main method runs
        /*
        If there is a superclass, initialize it first
        Static variable declarations and static initializers in the order they appear in the file


         */
    }
    public void m2() {
        System.out.println(y);              // RIWO
    }
    {
        System.out.println("Child Second instance block");
    }

    int y = 20;

}
