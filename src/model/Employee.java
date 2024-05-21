package model;

import java.text.DecimalFormat;

public class Employee {

    private String name;

    private Integer age;

    private double salary;

    public Employee(String name, Integer age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(){

        DecimalFormat decimalFormat= new DecimalFormat(".##");

        return "Employee Name:"+ this.name+"Age:"+ this.age +"Salary:"+ decimalFormat.format(this.salary);


    }


}
