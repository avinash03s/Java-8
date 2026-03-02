package Java_8_feature.streamOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentList {
    private int id;
    private int rollNo;
    private String name;
    private String courseName;

    public StudentList(int id, int rollNo, String name, String courseName) {
        this.id = id;
        this.rollNo = rollNo;
        this.name = name;
        this.courseName = courseName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "StudentList{" +
                "id=" + id +
                ", rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}

class StudentMain {

    public static void main(String[] args) {
        StudentList s1 = new StudentList(2, 42, "Om", "Zologi");
        StudentList s2 = new StudentList(1, 41, "Karan", "Agri");
        StudentList s3 = new StudentList(5, 45, "Avinash", "BCS");
        StudentList s4 = new StudentList(3, 43, "Sushil", "MCA");
        StudentList s5 = new StudentList(4, 44, "Pramod", "Python");

        List<StudentList> list = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));
        System.out.println("Sorted By id");
        List<StudentList> sortedList = list.stream()
                .sorted((a, b) -> a.getId() - b.getId())
                .toList();
        for (StudentList s : sortedList) {
            System.out.println(s);
        }
        System.out.println("--------------------");
        System.out.println("Sorted By RollNo and get only Name");
        List<String> stringStream = list.stream().filter(x -> x.getRollNo() > 41)
                .sorted((a,b)->a.getRollNo() - b.getRollNo()).map((a)-> a.getName()).toList();
        for (String name : stringStream) {
            System.out.println(name);
        }
    }
}
