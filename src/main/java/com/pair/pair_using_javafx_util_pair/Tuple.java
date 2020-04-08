package com.pair.pair_using_javafx_util_pair;

import javafx.util.Pair;

import java.util.*;

class Tuple
{
    // Demonstrate javafx.util.Pair class introduced in Java 8 and above
    public static void main(String[] args)
    {
        List<Pair<String, Integer>> entries = new ArrayList<>();

        LinkedHashMap<String,Integer> entriesmap = new LinkedHashMap<>();

        entries.add(new Pair<>("John", 26));
        entries.add(new Pair<>("Tom", 30));
        entries.add(new Pair<>("John", 26));

        entriesmap.put("Jane",22);
        entriesmap.put("Marry",21);
        entriesmap.put("Jane",22);


        // print first pair using getKey() and getValue() method

        System.out.println("{" + entries.get(0).getKey() + ", " +
                entries.get(0).getValue() + "}");

        Set<Map.Entry<String, Integer>> entriesSet = entriesmap.entrySet();

        System.out.println("Printing the key and value using Map.entryset");

        for( Map.Entry<String,Integer> it :entriesSet) {
            System.out.println("{ " + it.getKey() + ", " +
                    it.getValue() + "}");
        }

        // print second pair using getKey() and getValue() method

        System.out.println("{" + entries.get(1).getKey() + ", " +
                entries.get(1).getValue() + "}");
    }
}
