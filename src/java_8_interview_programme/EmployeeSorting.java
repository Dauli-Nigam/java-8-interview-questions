package java_8_interview_programme;

import model.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorting {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(new Employee("Rahul", 45, 15000.00),
                new Employee("Mukesh", 45, 7000.00),
                new Employee("ram", 65, 8000.00),
                new Employee("Aman", 22, 10000.00),
                new Employee("Mohit", 29, 9000.00));

        // TODO SORT EMPLOYEE BASED ON SALARY WITH ASCENDING ORDER...

        List<Employee> sortedEmployeeOnSalary = employeeList.stream().sorted(Comparator
                .comparingDouble(Employee::getSalary)).collect(Collectors.toList());

        //TODO here we have created stream from list of String using .stream()
        // and we have used sorted method to sort the employee list and in sorted we are using comparator Comparator.ComparingDouble
        // based on salary so it will apply sorting on the basis of salary
        // and here we are collecting output as a List so we are using Collectors.ToList() inside collect..

        System.out.println("Employee based on Salary with ascending Order :" + sortedEmployeeOnSalary);

        // TODO SORT EMPLOYEE BASED ON SALARY WITH DESCENDING ORDER

        List<Employee> reverseSortedEmployeeOnSalary = employeeList.stream().sorted(Comparator
                .comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());

        //TODO here we have created stream from list of String using .stream()
        // and we have used sorted method to sort the employee list and in sorted we are using comparator Comparator.comparingDouble
        // based on salary so it will apply sorting on the basis of salary we have used reversed() for reverse order
        // and here we are collecting output as a List so we are using Collectors.ToList() inside collect....

        System.out.println("Employee Based On Salary With Descending Order: " + reverseSortedEmployeeOnSalary);

        // TODO SORT EMPLOYEE BASED ON NAME...

        List<Employee> sortedEmployeeByName =
                employeeList.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList());


        //TODO here we have created stream from list of String using .Stream()
        // and we have used sorted method to sort the employee list and we have passes lambda expression which is comparing names
        // so that we can get sorting base on name using compare to method
        // and here we are collecting output as a List so we are using Collectors.ToList() inside collect...

        System.out.println("Sorted Employee Based On Name " + sortedEmployeeByName);

        // TODO EMPLOYEE BASED ON NAME AND SALARY ...

        Comparator<Employee> sortByName = (e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName());

        // TODO HERE WE HAVE CREATED NAME COMPARATOR TO SORT EMPLOYEE OBJECT BY NAME...


        Comparator<Employee> sortBySalary = (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());

        // TODO HERE WE HAVE CREATED SALARY COMPARATOR TO SORT EMPLOYEE BASED ON SALARY...
        //  SORT BY NAME THAN SORT BY SALARY ...

        employeeList.stream().sorted(sortByName.thenComparing(sortBySalary))
                .forEach(e -> System.out.println("Sort Employee Based On Name And Salary" + e));

        // TODO HERE WE ARE USING BOTH COMPARATOR WITCH SORTED METHOD TO APPLY BOTH COMPARATOR BASED ON NAME AND SALARY ..


    }


}
