package lambda;



import collections.Product;

import java.util.*;
import java.util.function.*;

public class Driver {
    public static void main(String[] args) {

        Supplier<String> companyNameSupplier = ()->"Ford India";

        System.out.println(companyNameSupplier.get());
        Supplier<Double> piValue = ()->{
           return  3.14;
        };
        System.out.println("pi:"+piValue.get());

        Consumer<String> stringConsumer = (s)->System.out.println(s);
        stringConsumer.accept("Dell India");
        // check N is even?
        Predicate<Integer> evenPredicate = (n)->(n%2)==0;
        System.out.println("is 65 even?:"+ evenPredicate.test(65));

        // Function
        Function<String,String> convertString = (s)->s.toUpperCase();
        System.out.println("ford ->:"+ convertString.apply("ford"));
        // write a lambda to calculate simple interest
        BiFunction<Double,Double,Double> simpleInterest = (p,i)->{

            return (p*1*i) / 100.0;
        };
        System.out.println("Simple interest on 25000 @ 12% is :"+ simpleInterest.apply(25000.0,10.0));
        // Bipridicate
        BiPredicate<String,String> isSubStringPresent = (ss,ms)->ms.contains(ss);

        System.out.println("India present in 'Ford India':"+ isSubStringPresent.test("India","Ford India"));

        //CustomFunction custom = (s)->s.length();

        CustomFunction custom = (li)-> {
            Collections.sort(li);
            return li;
        };
        List<Integer> unSortedIntList = new ArrayList<>();
        unSortedIntList.add(99);
        unSortedIntList.add(-22);
        unSortedIntList.add(15);
        //custom.display("Ford");
        System.out.println(custom.sort(unSortedIntList));

        //2. WL to check if Employee getting salary >=25000

        Predicate<Product> checkSalaryOfEmployee = (p)->p.getPrice()>=25000;
        Product newProduct = new Product(1,"Iphone 15",65000.0);
        System.out.println("Product price > 25K:" + checkSalaryOfEmployee.test(newProduct));
        //3. WL to convert given list of employee names to upper case and sort
        Function<List<String>,List<String>> convertAndSort = (ln)->{

            int i=0;
            for(String name:ln){
                ln.set(i++,name.toUpperCase());
            }
            Collections.sort(ln);
            return  ln;
        };

        List<String> nameList = new ArrayList<>();
        nameList.add("India");
        nameList.add("America");
        nameList.add("Uk");
        System.out.println(convertAndSort.apply(nameList));



    }
}
