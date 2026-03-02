package Java_8_feature.realTimeuseFunctionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentMain {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Avinash", 78.1, "Java Developer");
        Student s2 = new Student(2, "Rahul", 70.3, "PHP Developer");
        Student s3 = new Student(3, "Narayan", 48.4, "C# Developer");
        Student s4 = new Student(4, "Karan", 58.0, "C++ Developer");
        Student s5 = new Student(5, "Abhishek", 68.3, "Ruby Developer");
        Student s6 = new Student(6, "Ritesh", 58.8, "HTML Developer");
        Student s7 = new Student(7, "Pramod", 87.9, "CSS Developer");
        Student s8 = new Student(8, "Sushil", 88.1, "Python Developer");
        Student s9 = new Student(9, "Avinash K", 98.1, "Java Developer");
        Student s10 = new Student(10, "Ganesh", 78.1, "React Developer");

        List<Student> studentList = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
        /// Predicate Interface
        /// test()
//        Predicate<Student> studentPredicate = (Student s) -> s.getSkill().equals("Java Developer");
//        List<Student> list = new ArrayList<>();
//        for (Student s : studentList) {
//            if (studentPredicate.test(s)) {
//                list.add(s);
//            }
//        }
//        System.out.println(list);

        ///Consumer Interface
        /// accept()
//        Consumer<Student> consumer = (Student s) -> {
//            System.out.println("Student Name: " + s.getName() + " : " + " Percentage: " + s.getPercentage());
//        };
//        for (Student s : studentList) {
//            consumer.accept(s);
//        }

        /// Function Interface
        /// apply()
//        Function<Student, String> function = (Student s) -> s.getName();
//        List<String> list = new ArrayList<>();
//        for (Student s : studentList){
//            list.add(function.apply(s));
//        }
//        System.out.println(list);

        /// Supplier Interface
        /// get()
        Supplier<Student> supplier = () -> new Student(11,"Ram",99.0,"FullStack");
        studentList.add(supplier.get());
        for (Student s : studentList){
            System.out.println(s);
        }
    }
}
