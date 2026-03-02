package Java_8_feature.functionInterfaces.predicates;

import java.util.function.Predicate;

public class PredicateString {

    public static void main(String[] args) {
//        Predicate<String> predicate = x -> x.toLowerCase().charAt(0) == 'a';
//        Predicate<String> predicateWithEnd = x -> x.toLowerCase().charAt(x.length()-1) == 'h';
//        Predicate<String> and = predicate.and(predicateWithEnd);
////        System.out.println(and.test("Avinash"));
//        Predicate<String> or = predicate.or(predicateWithEnd);
////        System.out.println(or.test("AvinashS"));
//        Predicate<String> negate = predicate.negate();
//        System.out.println(negate.test("A"));

        int age = 21;
        Predicate<Integer> integerPredicate = x-> x > 20;
        if (integerPredicate.test(age)){
            System.out.println("Go for vote");
        }else {
            System.out.println("Not go");
        }
    }
}
