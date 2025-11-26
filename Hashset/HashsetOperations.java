package Hashset;

import java.util.HashSet;

public class HashsetOperations {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Add
        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Banana"); // duplicate ignored

        System.out.println(set);

        // Remove
        set.remove("Mango");

        System.out.println(set);

        // Check 
        System.out.println( set.contains("Apple"));

        // Size
        System.out.println(set.size());

        // Loop
        for(String item:set) {
            System.out.println(item);
        }
    }
}
