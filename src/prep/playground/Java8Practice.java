package prep.playground;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Practice {
    public static void main(String[] args) {

        // Create a list to hold Employee objects
        List<Employee> employees = new ArrayList<>();

        // Add five dummy employees to the list
        employees.add(new Employee(1, "John Doe", 90000.0, 30, "HR"));
        employees.add(new Employee(2, "Jane Smith", 55000.0, 28, "IT"));
        employees.add(new Employee(3, "Bob Brown", 60000.0, 35, "AC"));
        employees.add(new Employee(4, "Mary Johnson", 35000.0, 32, "HR"));
        employees.add(new Employee(5, "James Williams", 10000.0, 40, "IT"));

        // Print the employees to verify
//        employees.stream().forEach(System.out::println);

//        ascending order of age
        List empSortedAgeAsc = employees.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
//        empSortedAgeAsc.stream().forEach(System.out::println);

//        descending order of age
        List empSortedAgeDesc = employees.stream().sorted((e1, e2) -> Integer.compare(e2.getAge(), e1.getAge())).collect(Collectors.toList());
//        empSortedAgeDesc.stream().forEach(System.out::println);


        //ascending order of salary
        List empSortedAsc = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        empSortedAsc = employees.stream().sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).collect(Collectors.toList());
//        empSortedAsc.stream().forEach(System.out::println);

        //descending order of salary
        List empSortedDesc = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        empSortedDesc = employees.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).collect(Collectors.toList());
//        empSortedDesc.stream().forEach(System.out::println);

        // Top 3 salaried employees
        List top3Sal = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList());
        top3Sal = employees.stream().sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary())).limit(3).collect(Collectors.toList());
        top3Sal = employees.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).limit(3).collect(Collectors.toList());
//        top3Sal.stream().forEach(System.out::println);

        //Employees with salary less than 3rd highest salary
        List lessThan3rdHighestSal = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(3).collect(Collectors.toList());
        lessThan3rdHighestSal = employees.stream().sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary())).skip(3).collect(Collectors.toList());
        lessThan3rdHighestSal = employees.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).skip(3).collect(Collectors.toList());
//        lessThan3rdHighestSal.stream().forEach(System.out::println);

        //Print unique department names
        List<String> deptNames = employees.stream().map(Employee::getDept).distinct().collect(Collectors.toList());
//        System.out.println(deptNames);

        //Number of people in each department
        Map<String, Long> count = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
//        System.out.println(count);

        //Average age of employees in each department
        Map<String, Double> avgAges = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAges);


    }
}




//Class Employee

class Employee {
    int id;
    String name;
    String dept;

    public Employee(int id, String name, double salary, int age, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    double salary;
    int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}