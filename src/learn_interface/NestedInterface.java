package learn_interface;

public class NestedInterface {

    public interface NestIf {
        boolean isNotNegative(int x);
    }
}

class B implements NestedInterface.NestIf{

    @Override
    public boolean isNotNegative(int x) {
        return x >= 0;
    }
}
class NestedIfDemo{
    public static void main(String[] args){
        NestedInterface.NestIf nestIf = new B();
        nestIf.isNotNegative(10);

    }
}