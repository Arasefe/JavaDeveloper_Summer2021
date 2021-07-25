package day27_Review;

public class Baba {
    int i  = 10;


    {
        m1();
        System.out.println("Baba first instance block");
    }
    Baba(){
        System.out.println("Baba Constructor");
    }
    public static void main(String[] args) {
        Baba t = new Baba();                //if this object creation was not here then the output would be only "Baba main"
        System.out.println("Baba main");
        //now If I add another object here. then it will repeat the instance control flow
        //Baba tt = new Baba();
    }
    public void m1() {
        System.out.println(j);              // RIWO (READ INDIRECTLY WRITE ONLY)
    }

    {
        System.out.println("Baba second instance block");
    }

    int j = 20;

}
