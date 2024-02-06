package generics;

import java.util.List;

public class Box<T> {
    T data;

    public Box(T data) {
        this.data = data;
    }

    public void display(){
        System.out.println("Data :"+data);
    }
    public T getData(){
        return this.data;
    }


}
