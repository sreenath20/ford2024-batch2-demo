package statics;

public class Employee {

    private String name; // instance data member

    private static String companyName; // belongs to class name i.e Employee

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    static void display(){
        System.out.println("Company name :"+companyName);
    }
}
