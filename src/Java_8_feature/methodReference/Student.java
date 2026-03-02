package Java_8_feature.methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Student {
    private int id;
    private String name;
    private String branch;

    public Student(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    public Student() {

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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(branch, student.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, branch);
    }
}

class StudentMain {

    public static void main(String[] args) {
        Student s1 = new Student(103, "Avinash", "Computer Science");
        Student s2 = new Student(101, "Pramod", "Civil");
        Student s3 = new Student(105, "Sushil", "Electronic");
        Student s4 = new Student(104, "Rama", "Chemical");
        Student s5 = new Student(102, "Rahul", "Biology");
        Student s6 = new Student(102, "Rahul", "Biology");

        List<Student> list = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5, s6));

//        System.out.println("---With Lambda---");
//        Predicate<Student> predicate = (x) -> x.getId() > 100;
//        List<String> list1 = new ArrayList<>();
//        for (Student std : list) {
//            if (predicate.test(std)) {
//                Function<Student, String> function = student -> student.getName();
//                list1.add(function.apply(std));
//            }
//        }
//        System.out.println(list1);
//
//        System.out.println("---With MethodReference---");
//        Predicate<Student> predicate1 = (x) -> x.getId() > 101;
//        List<String> list2 = new ArrayList<>();
//        for (Student student : list){
//            if (predicate1.test(student)){
//                Function<Student, String> function = Student::getBranch;
//                list2.add(function.apply(student));
//            }
//        }
//        System.out.println(list2);
//        System.out.println();

//        System.out.println("--Use Supplier Interface with Lambda--");
//        Supplier<Student> supplier = ()-> new Student(110,"Narsing","MBA");
//        System.out.println(supplier.get());
//
//        System.out.println("--Use Supplier Interface with MethodReference--");
//        Supplier<Student> supplier1 = Student::new;
//        System.out.println(supplier1.get());


///      --------Use Stream------------
//        System.out.println("Get only one student name");
//        List<String> sorted = list.stream().filter(x-> x.getId() == 103).map(Student::getName).toList();
//        for (String s : sorted){
//            System.out.println(s);
//        }
//        System.out.println("----------------------");
//
//        System.out.println("Get one Student information ");
//        List<Student> sorted1 = list.stream().filter(x-> x.getId() == 103).toList();
//        System.out.println(sorted1);
//        System.out.println("-------------------");

        System.out.println("-----Get Full sorted list------");
        List<Student> sorted2 = list.stream()
                .distinct()
                .sorted((a, b) -> a.getId() - b.getId())
                .toList();
        sorted2.forEach(System.out::println);
//        for (Student s : sorted2){
//            System.out.println(s);
//        }
    }
}
