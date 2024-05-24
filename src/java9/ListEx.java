package Arrayzz.src.java9;

import java.util.List;
import java.util.Map;

public class ListEx{
    public static void main(String[] args) {
        System.out.println("test java9");
        List<String> immutableList = List.of();
        Map.Entry<Integer, String> e1 = Map.entry(101, "Java");
        Map.Entry<Integer, String> e2 = Map.entry(102, "Spring");
        Map.Entry<Integer,String> e3 = Map.entry(103,"java9");
        Map<Integer,String> unmodifiableMap= Map.ofEntries(e1,e2,e3);

        System.out.println(unmodifiableMap);
    }
}