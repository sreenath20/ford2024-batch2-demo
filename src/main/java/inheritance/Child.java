package inheritance;

public class Child extends  Parent{

    public String name="India"; // this

    public Child() {
        super(); // call constructor of immediate parent
    }

    // by overridding we change existing functionalities
    public  void display(){
        System.out.println("Child display , parent data ="+super.name);
       // System.out.println(super.city);
    }
    public void newFunction(){
        System.out.println("New feature child name="+this.name);
    }
}
