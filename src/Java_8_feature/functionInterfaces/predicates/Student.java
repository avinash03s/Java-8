package Java_8_feature.functionInterfaces.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Student {
    private int id;
    private String name;
    private int mark;

    public Student(int id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
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

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", mark=" + mark +
                '}';
    }
}

class StudentMain {

    public static void main(String[] args) {
        Student s1 = new Student(101, "Avinash", 450);
        Student s2 = new Student(102, "Karan", 510);
        Student s3 = new Student(103, "Rahul", 250);
        Student s4 = new Student(104, "Narayan", 150);
        Student s5 = new Student(105, "Abhishek", 600);

        List<Student> list1 = Arrays.asList(s1, s2, s3, s4, s5);
        Function<Student, Integer> markFunction = x -> x.getMark();
        System.out.println("--Passing Student list--");
        for (Student student : list1) {
            if (markFunction.apply(student) > 500) {
                System.out.println("Pass Student: " + student.getName());
            }
        }
        System.out.println("--Fail Student list --");
        for (Student student : list1) {
            if (markFunction.apply(student) < 500) {
                System.out.println("Fail Student: " + student.getName());
            }
        }

//        Predicate<Student> predicate1 = Predicate.isEqual(s1);
//        System.out.println(predicate1.test(s2));//false
//
//        List<Student> list = Arrays.asList(s1, s2, s3, s4, s5);
//        Predicate<Student> predicate = x -> x.getMark() > 500;
//        for (Student s : list) {
//            if (predicate.test(s)) {
//                System.out.println("Pass Student: " + s.getName()); // Karan, Abhishek
//            }
//        }
    }
}
