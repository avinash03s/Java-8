package Java_8_feature.functionInterfaces;

@FunctionalInterface //only one abstract method
public interface Employee {
    String getName();

    static void getCabinId(int id) {
        System.out.println(id);
    }
}

class SoftwareDeveloper {

    public static void main(String[] args) {

        Employee.getCabinId(264);
        Employee employee1 = () -> "Avinash Surwase";
        System.out.println(employee1.getName());

        Employee.getCabinId(265);
        Employee employee2 = () -> "Rahul Surwase";
        System.out.println(employee2.getName());

        Employee.getCabinId(266);
        Employee employee3 = () -> "Karan P";
        System.out.println(employee3.getName());
    }
}
