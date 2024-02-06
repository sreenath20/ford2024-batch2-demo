package oops;

public class Calculator {

    // method over loading
    // static polymorphism

    public void display(){
        System.out.println("Casio Calculator");
    }
    public void display(Integer number){
        System.out.println("Casio Calculator:"+number);
    }
    public void display(String name){
        System.out.println("Casio Calculator:"+name);
    }
    public void display(Double number){
        System.out.println("Double:"+number);
    }
    public void display(Double number,Integer data){
        System.out.println("Double:"+number);
    }

    public void display(Double number,Integer data,String name){
        System.out.println("Double+int+str:"+number);
    }
    public void display(Integer data,Double number,String name){
        System.out.println("int+Double+str:"+number);
    }
}

