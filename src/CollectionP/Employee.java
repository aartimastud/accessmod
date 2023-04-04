package CollectionP;

import java.util.Set;
import java.util.HashSet;

public class Employee {
    int empId;
    int salary;
    String department;
    String city;
    public Employee(int empId, int salary, String department, String city){
        this.empId = empId;
        this.salary = salary;
        this.department = department;
        this.city = city;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
