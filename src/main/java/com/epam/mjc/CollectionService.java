package com.epam.mjc;

import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
       return list.stream().filter(x->x%2==0).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
       return list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().reduce(Math::max);
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
      return list.stream()
              .flatMap(List::stream)
              .reduce(Math::min);
    }

    public Integer sum(List<Integer> list) {
        return  list.stream().
                mapToInt(x->x).
                sum();
    }
}
