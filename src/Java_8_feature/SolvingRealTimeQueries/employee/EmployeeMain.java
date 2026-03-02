package Java_8_feature.SolvingRealTimeQueries.employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee emp1 = new Employee(103, "Avinash Surwase", 21, "Male", "Java Developer", 2026, 800000.0);
        Employee emp2 = new Employee(106, "Ganesh Shingate", 22, "Male", "Data Analytics", 2026, 900000.0);
        Employee emp3 = new Employee(108, "Riya Jangle", 18, "Female", "Python Developer", 2028, 600000.0);
        Employee emp4 = new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0);
        Employee emp5 = new Employee(101, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0);
        Employee emp6 = new Employee(104, "Nima Roy", 27, "Female", "HR", 2013, 22700.0);
        Employee emp7 = new Employee(105, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0);
        Employee emp8 = new Employee(109, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0);
        Employee emp9 = new Employee(111, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0);
        Employee emp10 = new Employee(110, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0);
        Employee emp11 = new Employee(113, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5);
        Employee emp12 = new Employee(112, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0);
        Employee emp13 = new Employee(120, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0);
        Employee emp14 = new Employee(117, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0);
        Employee emp15 = new Employee(114, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5);
        Employee emp16 = new Employee(115, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0);
        Employee emp17 = new Employee(116, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0);
        Employee emp18 = new Employee(118, "Dinash Shirame", 22, "Male", "Java Developer", 2026, 1000000.0);
        Employee emp19 = new Employee(119, "Narsing Patil", 23, "Male", "Java Developer", 2026, 1200000.0);
        Employee emp20 = new Employee(122, "Manish Bhawasar", 25, "Male", "Java Developer", 2026, 1200000.0);
        Employee emp21 = new Employee(123, "Bharat Karale", 24, "Male", "Java Developer", 2026, 1500000.0);

        List<Employee> list = new ArrayList<>(Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9,
                emp10, emp11, emp12, emp13, emp14, emp15, emp16, emp17, emp18, emp19, emp20, emp21));

        ///How many male and female employees are there in the organization?
        System.out.println("--male and female--");
        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect);
        System.out.println("--------------------------------------------------------------------------");

        ///Print the name of all departments in the organization?
        System.out.println("--all departments--");
        List<String> stringStream = list.stream()
                .map(Employee::getDepartment)
                .distinct()
                .toList();
        for (String e : stringStream) {
            System.out.println(e);
        }
        System.out.println("--------------------------------------------------------------------------");

        ///What is the average age of male and female employees?
        System.out.println("---average age of male and female---");
        Map<String, Double> collect1 = list.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(collect1);
        System.out.println("---------------------------------------------------------------------------");

        ///Get the details of highest paid employee in the organization?
        System.out.println("---highest paid employee---");
        Optional<Employee> collect2 = list.stream().max(Comparator.comparingDouble(Employee::getSalary));
        Employee employee = collect2.get();
        System.out.println("Details Of Highest Paid Employee : ");
        System.out.println("==================================");
        System.out.println("ID : " + employee.getId());
        System.out.println("Name : " + employee.getName());
        System.out.println("Age : " + employee.getAge());
        System.out.println("Gender : " + employee.getGender());
        System.out.println("Department : " + employee.getDepartment());
        System.out.println("Year Of Joining : " + employee.getJoiningYear());
        System.out.println("Salary : " + employee.getSalary());
        System.out.println("---------------------------------------------------------------------------------------");

        ///Get the names of all employees who have joined after 2015?
        System.out.println("---joined after 2015---");
        list.stream().filter(x -> x.getJoiningYear() > 2015)
                .map(Employee::getName)
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------------------------");

        ///count the number of employees in each department?
        //        Map<String, Long> collect = list.stream()
        //                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        //        for (Map.Entry<String, Long> m : collect.entrySet()) {
        //            System.out.println(m);
        //        }
        System.out.println("-------------------------------------------------------------------------------------------");

        ///what is average salary of each department?
        Map<String, Double> avgSalary = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        for (Map.Entry<String, Double> m : avgSalary.entrySet()) {
            System.out.println(m);
        }
        System.out.println("--------------------------------------------------------------------------");

        ///Who has the most working experience in the organization?
        Optional<Employee> first = list
                .stream().min(Comparator.comparingInt(Employee::getJoiningYear));
        System.out.println(first);
        System.out.println("-----------------------------------------------------------");

        ///Query 3.10 : How many male and female employees are there in the sales and marketing team?
        Map<String, Long> find = list.stream()
                .filter(x -> x.getDepartment() == "Sales And Marketing")
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        for (Map.Entry<String, Long> l : find.entrySet()) {
            System.out.println(l);
        }
        System.out.println("------------------------------------------------------------------");

        ///Query 3.11 : What is the average salary of male and female employees?
        Map<String, Double> avgSalaryMaleAndFemale = list.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        for (Map.Entry<String, Double> m : avgSalaryMaleAndFemale.entrySet()) {
            System.out.println(m);
        }
        System.out.println("--------------------------------------------------------------------");

        ///Query 3.12 : List down the names of all employees in each department?
        Map<String, List<Employee>> getNamesOfAllDepartment = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        for (Map.Entry<String, List<Employee>> m : getNamesOfAllDepartment.entrySet()) {
            System.out.println("------" + m.getKey() + "-------");
            List<Employee> list1 = m.getValue();
            for (Employee e : list1) {
                System.out.println(e.getName());
            }
        }
        System.out.println("-----------------------------------------------------------");

        ///Query 3.13 : What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics summarizing = list.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Total Average : " + summarizing.getAverage());
        System.out.println("Total Sum : " + summarizing.getSum());
        System.out.println("---------------------------------------------------------------");

        /// Query 3.15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Optional<Employee> max = list.stream()
                .max(Comparator.comparingInt(Employee::getAge));
        Employee oldestEmployee = max.get();
        System.out.println("Name : " + oldestEmployee.getName());
        System.out.println("Age : " + oldestEmployee.getAge());
        System.out.println("Department : " + oldestEmployee.getDepartment());

    }
}
