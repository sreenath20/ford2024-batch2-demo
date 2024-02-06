package generics;

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

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

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
