package Task06;

import java.time.LocalDate;

public class Employee {

    private String name;
    private int year_of_joining;
    private String address;

    Employee(){

    }
    Employee(String name, int year_of_joining, String address ){
        this.name = name;
        this.year_of_joining = year_of_joining;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getYear_of_joining() {
        return year_of_joining;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear_of_joining(int year_of_joining) {
        this.year_of_joining = year_of_joining;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Robert", 1994, "64C- Walls Street");
        Employee employee2 = new Employee("Sam", 2000, "68D- Walls Street");
        Employee employee3 = new Employee("John", 1999, "26B- Walls Street");
        System.out.println("Name" + "     "+ "Year of Joining" + "       "+"Address");
        System.out.println();
        System.out.println(employee.getName()+ "   " + employee.getYear_of_joining() + "              " +employee.getAddress());
        System.out.println(employee2.getName()+ "      " + employee2.getYear_of_joining() + "              " +employee2.getAddress());
        System.out.println(employee3.getName()+ "     " + employee3.getYear_of_joining() + "              " +employee3.getAddress());

    }
}
