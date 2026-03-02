package Java_8_feature.methodReference;

import java.util.function.Supplier;

class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class MethodReference {

    public static void main(String[] args) {
        Company ob = new Company("AS Pvt.Ltd");

        Supplier<String> supplier = ()-> ob.getName();
        System.out.println(supplier.get());

        System.out.println("-----replace by method references------");
        Supplier<String> supplier1 = ob::getName;
        System.out.println(supplier1.get());
    }
}
