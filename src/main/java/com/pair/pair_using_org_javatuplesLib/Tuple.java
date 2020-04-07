package com.pair.pair_using_org_javatuplesLib;

import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.List;

class Tuple {
    // Demonstrate Pair class provided JavaTuples Library in Java
    public static void main(String[] args) {
        List<Pair<String, Integer>> pairs = new ArrayList<>();

        pairs.add(Pair.with("John", 26));     // using Pair.with()
        pairs.add(new Pair<>("Tom", 30));     // using constructors

        // print first pair using getValue0() and getValue1() method
        System.out.println("{" + pairs.get(0).getValue0() + ", " +
                pairs.get(0).getValue1() + "}");

        // print second pair using getValue0() and getValue1() method
        System.out.println("{" + pairs.get(1).getValue0() + ", " +
                pairs.get(1).getValue1() + "}");
    }
}
