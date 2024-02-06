package interfaces;

public class ABImpl implements  A,B{
    @Override
    public void functionOne() {

        System.out.println("Fun 1");
    }

    @Override
    public void functionTwo() {
        System.out.println("Fun 2");
    }
}
