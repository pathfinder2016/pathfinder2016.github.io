package week_005_binary_tree.comparable;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {

    @Test
    public void should_return_nagetive(){
        Employee employee = new Employee(1000.0, "Mike");
        Employee employee1 = new Employee(2000.0, "Water");
        Assert.assertEquals(-1, employee.compareTo(employee1));
    }

    @Test
    public void should_be_sorted_in_array_case(){
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(3, "Mike3");
        employees[1] = new Employee(2, "Mike2");
        employees[2] = new Employee(1, "Mike1");

        Arrays.sort(employees);

        Assert.assertEquals(1.0, employees[0].getSalary());
    }

    @Test
    public void should_be_sorted_in_collections_case(){
        List<Employee> employees = new ArrayList<>();
        Employee employee3 = new Employee(3, "Mike3");
        Employee employee2 = new Employee(2, "Mike2");
        Employee employee1 = new Employee(1, "Mike1");

        employees.add(employee3);
        employees.add(employee2);
        employees.add(employee1);
        Collections.sort(employees);

        Assert.assertEquals(1.0, employees.get(0).getSalary());
    }
}