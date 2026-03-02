package Java_8_feature.streamOperation.questions;

import java.util.HashMap;
import java.util.Map;

class MapProblem{

    public static void mergeMaps(){
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("Avinash",3);
        map1.put("Pramod",4);
        map1.put("Sushil",2);
        map1.put("Kakde Avinash",2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Rahul",100);
        map2.put("Gopal",200);

        Map<String, Integer> map3 = new HashMap<>(map1);
        map2.forEach((k,v)->map3.merge(k ,v, Integer::sum));
        System.out.println(map3);
    }

    public static void addMap(){
        Map<Integer,Map<Integer,String>> map = new HashMap<>();

        Map<Integer, String > map1 = new HashMap<>();
        map1.put(10,"Java");
        map1.put(20,"Java");
        map1.put(30,"Java");

        map.put(100,map1);
        for (Map.Entry<Integer,Map<Integer,String>> entry: map.entrySet()){
            System.out.println(entry);
        }
    }
}
public class MergeMap extends MapProblem{

    public static void main(String[] args) {
       mergeMaps();
        System.out.println("----------------------------------------------------------");
       addMap();
    }
}
