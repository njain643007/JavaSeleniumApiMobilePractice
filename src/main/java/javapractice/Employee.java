package javapractice;

import java.util.ArrayList;
import java.util.List;

class Employee {
    int id;
    String name;
    int age;
    double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "John", 28, 45000));
        empList.add(new Employee(102, "Alice", 32, 55000));
        empList.add(new Employee(103, "Bob", 25, 40000));
        empList.add(new Employee(104, "Nik", 18, 30000));

        empList.removeIf(k->k.age<=19);
    }
}
