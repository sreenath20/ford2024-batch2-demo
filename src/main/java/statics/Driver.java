package statics;

public class Driver {

    public static void main(String [] args){

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setCompanyName("Ford");
        System.out.println(e2.getCompanyName());
        Employee.display();




    }
}
