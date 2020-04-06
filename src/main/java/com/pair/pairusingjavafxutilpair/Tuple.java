package com.pair.pairusingjavafxutilpair;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

class Tuple
{
    // Demonstrate javafx.util.Pair class introduced in Java 8 and above
    public static void main(String[] args)
    {
        List<Pair<String, Integer>> entries = new ArrayList<>();

        entries.add(new Pair<>("John", 26));
        entries.add(new Pair<>("Tom", 30));
        entries.add(new Pair<>("John", 26));

        // print first pair using getKey() and getValue() method

        System.out.println("{" + entries.get(0).getKey() + ", " +
                entries.get(0).getValue() + "}");

        // print second pair using getKey() and getValue() method

        System.out.println("{" + entries.get(1).getKey() + ", " +
                entries.get(1).getValue() + "}");
    }
}
