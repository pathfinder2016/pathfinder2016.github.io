package week_005_binary_tree.comparable;

/**
 * 此接口强行对实现它的每个类的对象进行整体排序。
 * 实现此接口的对象列表（和数组）可以通过 Collections.sort （和 Arrays.sort ）进行自动排序

 * 2.实现什么方法
 int compareTo(T o)
 比较此对象与指定对象的顺序。如果该对象小于、等于或大于指定对象，则分别返回负整数、零或正整数。
 */
public class Employee implements Comparable<Employee>{

    private double salary;
    private String name;

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public int compareTo(Employee employee) {
        if (this.salary > employee.salary) {
            return 1;
        }else if(this.salary == employee.salary){
            return 0;
        }
        return -1;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}