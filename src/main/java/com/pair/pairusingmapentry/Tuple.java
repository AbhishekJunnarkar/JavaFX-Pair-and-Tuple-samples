package com.pair.pairusingmapentry;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Pair
{
    // Return a map entry (key-value pair) from the specified values
    public static <T, U> Map.Entry<T, U> of(T first, U second)
    {
        return new AbstractMap.SimpleEntry<>(first, second);
    }
}

class Tuple
{
    // Implement Pair class in Java using Map.Entry
    public static void main(String[] args)
    {
        Set<Map.Entry<String, Integer>> entries = new HashSet<>();

        entries.add(Pair.of("John", 26));
        entries.add(Pair.of("Tom", 30));
        entries.add(Pair.of("John", 30));

        System.out.println(entries);

        // runs in Java 8 and above only
        entries.forEach(entry -> {
            if (entry.getKey().equals("John"))
                System.out.println(entry.getValue());
        });
    }
}