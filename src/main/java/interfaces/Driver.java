package interfaces;

public class Driver {
    public static void main(String [] args){

       // Parent parent = new Parent();
        Parent parent = new ParentImpl();
        parent.display();
        parent = new ParentImplTwo();
        parent.display();
        parent.defaultMethod();
        ParentImpl child =new ParentImpl();
        child.defaultMethod();
    }
}
