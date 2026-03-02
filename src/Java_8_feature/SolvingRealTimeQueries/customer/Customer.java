package Java_8_feature.SolvingRealTimeQueries.customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String productName;
    private int visitYear;

    public Customer(int id, String name, int age, String gender, String productName ,int visitYear) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.productName = productName;
        this.visitYear = visitYear;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getVisitYear() {
        return visitYear;
    }

    public void setVisitDate(int visitDate) {
        this.visitYear = visitDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", productName='" + productName + '\'' +
                ", visitYear='" + visitYear + '\'' +
                '}';
    }

    static List<Customer> getCustomer() {
        Customer c1 = new Customer(101, "Pramod", 21, "Male", "PUMA",2025);
        Customer c2 = new Customer(102, "Sushil", 15, "Male", "XYZ",2025);
        Customer c3 = new Customer(103, "Avinash", 21, "Male", "BOAT",2024);
        Customer c4 = new Customer(104, "Riya", 30, "Female", "ABCD",2015);
        Customer c5 = new Customer(105, "Jiya", 29, "Female", "WXYZ",2013);
        Customer c6 = new Customer(106, "Lala", 25, "Male", "MRF",2016);
        Customer c7 = new Customer(107, "Rahul", 19, "Male", "MAHENDRA",2015);
        Customer c8 = new Customer(108, "Ram", 29, "Male", "PUMA",2025);
        Customer c9 = new Customer(109, "Siddhi", 21, "Female", "BOAT",2018);
        Customer c10 = new Customer(110, "Karan", 22, "Male", "TALP",2023);
        Customer c11 = new Customer(103, "Avinash", 21, "Male", "BOAT",2019);
        Customer c12 = new Customer(109, "Siddhi", 21, "Female", "BOAT",2026);


        return new ArrayList<>(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12));
    }
}
