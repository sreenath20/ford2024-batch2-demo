package generics;


import interfaces.A;
import interfaces.B;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args){
        Box<Integer> box = new Box<Integer>(250);
        box.display();

        Box<String> stringBox = new Box<>("Ford");
        stringBox.display();

        Box<Employee> empBox = new Box<>(new Employee(1,"ford",555.6));
        empBox.display();
        Pair<Integer,String> countryCode = new OrderPair<>(91,"India");

        System.out.println("Key:"+countryCode.getKey());
        System.out.println("Value:"+countryCode.getValue());

        Pair<String,String> namePair = new OrderPair<>("Ford","India");
        System.out.println(namePair.getKey() +":"+namePair.getValue());

        Pair<Integer,Box<String>> intBoxPair = new
                OrderPair<>(777, new Box<>("Hello !"));

        System.out.println(intBoxPair.getKey() +":"+intBoxPair.getValue().getData());

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"AA",100.0));
        empList.add(new Employee(2,"BB",200.0));
        empList.add(new Employee(3,"CC",300.0));

        Pair<String, List<Employee>> empListPair = new OrderPair<>("Chennai List",empList);

        System.out.println("Key :"+empListPair.getKey());
        System.out.println("Values :"+empListPair.getValue());

        Demo<Integer> demo = new Demo();
        demo.displayClassName(250);
        Demo<Employee> demoEmp = new Demo<>();
        demo.displayClassName(new Employee(1,"AA",100.0));

        demo.<Integer,Float>display2(99,55.5F);

        List<GrandParent> grandList= new ArrayList<>();
        grandList.add(new GrandParent());
        List<Parent> parentList = new ArrayList<>();
        parentList.add(new Parent());
        List<Child> childList = new ArrayList<>();
        childList.add(new Child());

        //demo.upperLimit(grandList);
        demo.upperLimit(parentList);
        demo.upperLimit(childList);
        demo.lowerLimit(grandList);
        demo.lowerLimit(parentList);
        //demo.lowerLimit(childList);



    }
}
