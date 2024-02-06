package inheritance;

import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Parent parent = new Parent();//#100
        parent.display();
        //parent.new

        Child child = new Child();
        child.display();
        child.newFunction();

        Parent parentRef;
//        parentRef = parent; // #100
//        parentRef.display();
//        parentRef = child;
//        parentRef.display();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter choice 1. Parent 2. child");
        Integer choice= scanner.nextInt();

        if(choice == 1)
            parentRef = parent;
        else
            parentRef=child;
        parentRef.display();


    }
}
