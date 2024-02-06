package interfaces;

public interface Parent { // contarct

    void display(); // public and abstract method

    static void utility(){

    }
    default void defaultMethod(){
        System.out.println("Parent Defuault method");
    }

}
