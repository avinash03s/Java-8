package Java_8_feature.streamOperation;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
    private int id;
    private String name;
    private String city;

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
public class SortMapByKeys {

    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(4,2);
        map.put(1,4);
        map.put(3,1);
        map.put(2,3);

        /// sort by keys
//        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//        System.out.println();
//        /// sorting by value
//        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        Student student1 = new Student(3,"Avinash","Beed");
        Student student2 = new Student(6,"Ram","Pune");
        Student student3 = new Student(2,"Hari","Mumbai");
        Student student4 = new Student(5,"Rakesh","Majlgov");
        Student student5 = new Student(1,"Narayan","Gevrai");
        Student student6 = new Student(4,"Karan","Jalna");

        List<Student> list = new ArrayList<>(Arrays.asList(student1,student2,student3,student4,student5,student6));
        List<Student> list1 = list.stream().sorted((a, b) -> a.getId() - b.getId()).toList();

        List<String> list2 = list.stream()
                .filter(x -> x.getId() < 5).sorted((a, b) -> b.getId() - a.getId())
                .map(Student::getName).collect(Collectors.toList());
        System.out.println(list1);

        System.out.println(list2);

    }
}
