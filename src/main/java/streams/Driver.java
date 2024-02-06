package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] ar){
        //1. create stream source
        List<String> nameList = new ArrayList<>();
        nameList.add("Ford");
        nameList.add("Maruthi");
        nameList.add("Hyundai");
        nameList.add("BMW");
        // 2. create strem from source
        // Map
        nameList.stream().map((s)->s.toUpperCase())
                .forEach((s)->System.out.println(s));
        // print length of all names
        nameList.stream().map((s)->s.length())
                .forEach((s)->System.out.println(s));
        // filter out names lenth <5
        nameList.stream().filter((s)->s.length()<5)
                .forEach((s)->System.out.println(s));
        // sort
        nameList.stream().sorted().forEach((s)->System.out.println(s));
        //reduce       // nameList.clear();
        Optional<Integer> totalLengthOpt=  nameList.stream().map((s)->s.length())
                .reduce((a, b)->a+b);
       // System.out.println("Total len = "+ totalLengthOpt.get());
            if(totalLengthOpt.isPresent())
                System.out.println("Total len = "+ totalLengthOpt.get());
            else
                System.out.println("optional result was empty");
        //limit
            nameList.stream().limit(2).forEach((s)->System.out.println(s));
        //skip
        System.out.println("After skipping 3 elements:");
        nameList.stream().skip(3).forEach((s)->System.out.println(s));
        //count
        Long count = nameList.stream().count();
        System.out.println("Total elements:"+count);
        //min
        List<Double> salaryList = new ArrayList<>();
        salaryList.add(9.0);
        salaryList.add(7.0);
        salaryList.add(3.0);
        salaryList.add(2.5);

       Optional<Double> minOpt =  salaryList.stream().min((e1,e2)->e1.compareTo(e2));
        if(minOpt.isPresent())
            System.out.println("MIn :"+minOpt.get());
        //Max
        Optional<Double> maxOpt =  salaryList.stream().max((e1,e2)->e1.compareTo(e2));
        if(minOpt.isPresent())
            System.out.println("Max :"+maxOpt.get());

        // filter out names lenth <5
       List<String> namesLessThan5 =  nameList.stream().filter((s)->s.length()<5).collect(Collectors.toList());
        System.out.println("Names < 5:"+ namesLessThan5);
        //


    }
}
