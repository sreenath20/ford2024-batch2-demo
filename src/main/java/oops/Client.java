package oops;

public class Client {

    public static void main(String [] args){

        Integer number =100;

        Employee employee ; // reference variable of type Employee
        employee= new Employee(); //
        System.out.println(employee.toString());

        Employee employeeOne = new Employee(1,"Sreenath",2500.0,"Ford");
        System.out.println(employeeOne);

        Calculator calculator = new Calculator();
        calculator.display();
        calculator.display(100); // different signatures
        calculator.display(250.0);
        calculator.display(55,75.5,"hello");



    }
}
