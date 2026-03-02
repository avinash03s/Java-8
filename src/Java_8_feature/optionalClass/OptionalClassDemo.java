package Java_8_feature.optionalClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class StudentService {

    Map<Integer, Student> studentMap;

    public StudentService() {
        studentMap = new HashMap<>();
        studentMap.put(1, new Student(1, "Avinash Surwase"));
    }

    public Optional<Student> getStudentById(int id) {
        Student newStudent = studentMap.get(id);
        Optional<Student> existStudent = Optional.ofNullable(newStudent);
        return existStudent;
    }
}

public class OptionalClassDemo {

    public static void main(String[] args) {
        StudentService ob = new StudentService();
        Optional<Student> obj = ob.getStudentById(1);
        if (obj.isPresent()) {
            System.out.println("Student Name: " + obj.get().getId());
            System.out.println("Student Name: " + obj.get().getName());
        } else {
            System.out.println("Student Not Found..!");
        }
    }
}
