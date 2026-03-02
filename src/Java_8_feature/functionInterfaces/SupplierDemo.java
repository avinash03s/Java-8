package Java_8_feature.functionInterfaces;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<String> supplier = ()-> "Avinash-03";
        System.out.println(supplier.get());
    }
}
