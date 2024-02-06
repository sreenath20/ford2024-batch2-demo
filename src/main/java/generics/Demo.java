package generics;

import java.util.List;

public class Demo<T> {


    public <T> void displayClassName(T data){

        System.out.println("data Class name:"+data.getClass());
    }

    public <T,V> void display2(T data,V data2){

        System.out.println("data Class name:"+data.getClass());
        System.out.println("data2 Class name:"+data2.getClass());
    }

    public <T,V> void function(T data,V data2){
        System.out.println("data Class name:"+data.getClass());
        System.out.println("data2 Class name:"+data2.getClass());
    }

    public void upperLimit(List<? extends Parent> list){
        System.out.println(list.get(0).getClass());
    }
    public void lowerLimit(List<? super Parent> list){
        System.out.println(list.get(0).getClass());
    }
}
