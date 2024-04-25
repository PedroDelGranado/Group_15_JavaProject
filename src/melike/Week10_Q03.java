package melike;

import java.util.*;

public class Week10_Q03 {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("Italy","Roma");
        map.put("Turkiye","Ankara");
        map.put("England","London");
        map.put("Japon","Tokyo");

        sort(map);

    }

    /**
     * Sorts the map by its values in ascending order and prints the sorted map.
     * @param map The map to be sorted.
     */

    public static void sort(Map<String, String> map) {
        // Create a list from elements of the map to sort
        List<Map.Entry<String, String>> entries = new ArrayList<>(map.entrySet());

        // Sort the list based on values of the map entries
        Collections.sort(entries, new Comparator<Map.Entry<String, String>>() {
            public int compare(Map.Entry<String, String> a, Map.Entry<String, String> b) {
                return a.getValue().compareTo(b.getValue());
            }
        });

        // Create a new LinkedHashMap to maintain the order
        LinkedHashMap<String, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted map
        System.out.println(sortedMap);
    }
}


/*
Write a method that can sort the Map by values.
 */