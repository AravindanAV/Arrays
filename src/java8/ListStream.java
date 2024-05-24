package Arrayzz.src.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ListStream {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(2,4,3,6,8);
        List<Integer> evenNumber = li.stream().filter(en->en%2==0).toList();
        System.out.println(evenNumber);

        // Using Mutable Key
        HashMap<MutableKey, String> mutableMap = new HashMap<>();
        MutableKey key1 = new MutableKey(1);
        mutableMap.put(key1, "Value 1");

        System.out.println("Value for key1: " + mutableMap.get(key1)); // Output: Value 1

        //key1.setValue(2); // Changing the key
        key1=new MutableKey(2);
        System.out.println("Value for key1 (after mutation): " + mutableMap.get(key1)); // Output: null (key not found)
        System.out.println(mutableMap);
        System.out.println("______________________________________");
        // Using Immutable Key (String)
        HashMap<String, String> immutableMap = new HashMap<>();
        String key2 = "key2";
        immutableMap.put(key2, "Value 2");

        System.out.println("Value for key2: " + immutableMap.get(key2)); // Output: Value 2

        // Attempting to change the key (which is immutable)
        key2 = "key3"; // This doesn't affect the actual key in the map

        System.out.println("Value for key2 (after mutation): " + immutableMap.get(key2)); // Output: null (key not found)
        System.out.println(immutableMap);
    }
}


class MutableKey {
    private int value;

    public MutableKey(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return value; // Hash code based on value
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MutableKey other = (MutableKey) obj;
        return value == other.value;
    }
}
