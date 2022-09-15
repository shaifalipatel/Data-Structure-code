package learn_interface;

public class C extends A {
    //public C(){}

    public void getValue(){
        A a= new A();
        int value= a.getA();
        System.out.println(value);
    }
}
