package oops;

public class Employee { // User defined data type // always start with Capital & noun
    //
    // data members
    private Integer id;
    private String name;
    private Double salary;
    private String company;


    // constructors
    public Employee() {
        this.company = "Ford";
    }

    public Employee(Integer id, String name, Double salary, String company) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.company = company;
    }

    @Override
    public String toString() {

        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }


}
