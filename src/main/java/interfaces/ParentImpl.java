package interfaces;

public class ParentImpl implements Parent{

    @Override
    public void display() {
        System.out.println("Parent display");
    }

     public void defaultMethod(){
        System.out.println("Child Defuault method");
    }

}
