package Java_8_feature.functionInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Company {
    private int id;
    private String name;
    private double salary;
    private String skill;

    public Company(int id, String name, double salary, String skill) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.skill = skill;
    }

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

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", skill='" + skill + '\'' +
                '}';
    }
}

class CompanyMain {

    public static void main(String[] args) {
        Company em1 = new Company(102, "Raju", 45000.0, "C++");
        Company em2 = new Company(104, "Karan", 85000.0, "Java");
        Company em3 = new Company(103, "Avinash", 88000.0, "Java");
        Company em4 = new Company(101, "Pramod", 75000.0, "Python");
        Company em5 = new Company(105, "Harsh", 70000.0, "Animation");
        Company em6 = new Company(107, "Abhi", 15000.0, "Editor");
        Company em7 = new Company(109, "Om", 55000.0, "C++");
        Company em8 = new Company(108, "Raju", 45000.0, "Java");
        Company em9 = new Company(106, "Ram", 50000.0, "Animation");
        Company em10 = new Company(110, "Arun", 40000.0, "Animation");

        List<Company> empList = new ArrayList<>(Arrays.asList(em1, em2, em3, em4, em5, em6, em7, em8, em9, em10));

        Predicate<Company> predicate = (company) -> company.getSalary() > 50000; //predicate hold condition

        Function<Company, String> function = company -> company.getName(); // take argument Type T and return type R

        List<String> list = new ArrayList<>();
        for (Company c : empList) {
            if (predicate.test(c)) {  //predicate method
                list.add(function.apply(c)); //function method
            }
        }
        System.out.println(list);

    }
}
