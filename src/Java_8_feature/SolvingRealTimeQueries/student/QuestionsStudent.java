package Java_8_feature.SolvingRealTimeQueries.student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QuestionsStudent {

    static List<Student> getStudentList() {
        Student s1 = new Student(101, "Pramod", "Core Java", 66.4);
        Student s2 = new Student(102, "Sushil", "C++", 50.0);
        Student s3 = new Student(103, "Avinash", "Adv Java", 86.0);
        Student s4 = new Student(104, "Rushi", "Python", 60.0);
        Student s5 = new Student(105, "Aniket", "DSA", 45.0);
        Student s6 = new Student(106, "Om", "Java Script", 61);

        return new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5, s6));
    }

    static void question1() {
        /// Given a list of students, write a Java 8 code to partition the students who got above 60% from those who didn’t?
        System.out.println("Partition Student in 2 group");
        List<Student> list = getStudentList();
        Map<Boolean, List<Student>> partition = list.stream()
                .collect(Collectors.partitioningBy(x -> x.getPercentage() > 60));

        for (Map.Entry<Boolean, List<Student>> m : partition.entrySet()) {
            System.out.println(m);
        }
        /// filter use when we need one group
//        list.stream().filter(x->x.getPercentage() > 60).forEach(System.out::println);
        System.out.println("----------------------------------------------------------------");
    }

    static void question2() {
        /// Given a list of students, write a Java 8 code to get the names of top 3 performing students?
        System.out.println("get Top 3 Performing Student");
        List<Student> list = getStudentList();
        List<Student> list1 = list.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed())
                .limit(3)
                .toList();
        for (Student s : list1) {
            System.out.println(s);
        }
        System.out.println("----------------------------------------------------------------");
    }

    static void question3() {
        ///Given a list of students, how do you get the name and percentage of each student?
        System.out.println("get Name and Percentage");
        List<Student> list = getStudentList();
        Map<String, Double> useToMap = list.stream().collect(Collectors.toMap(Student::getName, Student::getPercentage));
        for (Map.Entry<String, Double> m : useToMap.entrySet()) {
            System.out.println(m);
        }
        System.out.println("----------------------------------------------------------------");
    }

    static void question4() {
        /// Given a list of students, how do you get the subjects offered in the college?
        System.out.println("Get All Subjects");
        List<Student> list = getStudentList();
        Set<String> getSub = list.stream().map(Student::getSubject).collect(Collectors.toSet());
        for (String s : getSub) {
            System.out.println(s);
        }
        System.out.println("-------------------------------------------------------------------");
    }

    static void question5() {
        /// Given a list of students, write a Java 8 code to get highest, lowest and average percentage of students list?
        System.out.println("Get Highest, Lowest, Average");
        List<Student> list = getStudentList();

        DoubleSummaryStatistics collect = list.stream().collect(Collectors.summarizingDouble(Student::getPercentage));
        System.out.println("Highest : " + collect.getMax());
        System.out.println("Lowest : " + collect.getMin());
        System.out.println("Average : " + collect.getAverage());
        System.out.println("----------------------------------------------------------------------------");
    }

    static void question6() {
        ///How do you get total number of students (count) from the given list of students?
        List<Student> list = getStudentList();
        System.out.println("Count of Student");
        Long collect = list.stream().count();
        System.out.println(collect);
        System.out.println("---------------------------------------------------------------");
    }

    static void question7(){
        /// How do you get the students grouped by subject from the given list of students?
        List<Student> list = getStudentList();
        System.out.println("Get Group By Subject");
        Map<String, List<Student>> groupSubject = list.stream().collect(Collectors.groupingBy(Student::getSubject));
        for (Map.Entry<String , List<Student>> m : groupSubject.entrySet()) {
            System.out.println(m);
        }
        System.out.println("---------------------------------------------------------------------------");
    }

    static void question8(){
        /// what is output of given statement ?
        System.out.println(IntStream.range(0, 5).sum());
        /// output : 8
    }
}
