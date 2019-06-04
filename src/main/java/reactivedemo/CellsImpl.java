package reactivedemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class CellsImpl {

//    A colony of eight houses, represented as cells, are arranged in a straight line. Each day evry cell competes with its adjacent cells (neighbours). An integer value of 1 represents an active cell and value of 0 represents as inactive cell. If both the neighbours are either active or inactive, the cell becomes inactive the next day, otherwise it becomes active on the next day.
//    The two cells on the ends have a single adjacent cell, so the other adjacent cell can be assumed to be always inactive. Even after updating the cell state, its previous state is considered for updating the state of other cells. The cell information of all cells should be updated simultatiously.
//    Write an algorithm to output the state of the cells after the given number of days.
//    Input
//    The input to the function consists of two arguments:
//    states, a list of integers representing the current state of cells.
//    days, an integer representing the number of days.
//            Output
//
//    Return a list of integers representing the state of the cells after the given number of days.
//
//            Note:
//
//    The elements of the list states contains 0s and 1st only.

    public List<Integer> calculate(int[] states, int days) {
        List<Integer> inp = IntStream.of(states).boxed().collect(Collectors.toList());
        ;
        while (days-- > 0) {
            inp = getDays(inp);
        }
        return inp;
    }

    private List<Integer> getDays(List<Integer> inp) {
        List<List<Integer>> triplets = IntStream
                .range(0, inp.size())
                .mapToObj(i -> new ArrayList<>(inp)
                        .stream()
                        .skip(i)
                        .limit(3)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());

        List<Integer> collect1 = triplets
                .stream()
                .filter(elements -> elements.size() > 2)
                .map(elements -> max(elements.get(0), elements.get(2)) - min(elements.get(0), elements.get(2)))
                .collect(Collectors.toList());
        collect1.add(triplets.get(inp.size() - 2).get(0));

        List<Integer> inp2 = new ArrayList<>();
        inp2.add(triplets.get(0).get(1));
        inp2.addAll(collect1);
        return inp2;
    }
}
