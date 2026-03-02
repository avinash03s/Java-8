package Java_8_feature.functionInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class TeacherList {

    private int id;
    private String name;
    private String department;
    private int age;

    public TeacherList(int id, String name, String department, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TeacherList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }
}

public class FunctionDemo {

    public static void main(String[] args) {

        TeacherList t1 = new TeacherList(101, "Avinash", "CS", 20);
        TeacherList t2 = new TeacherList(104, "Rahul", "BA", 25);
        TeacherList t3 = new TeacherList(102, "Karan", "MA", 21);
        TeacherList t4 = new TeacherList(103, "Sumit", "11th and 12th", 45);
        TeacherList t5 = new TeacherList(105, "Pramod", "Biology", 30);

        List<TeacherList> list = new ArrayList<>(Arrays.asList(t1, t2, t3, t4, t5));

        Predicate<TeacherList> predicate = t -> t.getAge() > 20;

        System.out.println("Function For Only getName");
        Function<TeacherList, String> function = (li) -> li.getName();
        List<String> list1 = new ArrayList<>();
        for (TeacherList li : list) {
            if (predicate.test(li)){
                list1.add(function.apply(li));
            }
        }
        System.out.println(list1);
        System.out.println("---------------------------------");
    }
}
