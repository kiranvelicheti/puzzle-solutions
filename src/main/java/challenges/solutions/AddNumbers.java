package challenges.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AddNumbers {

    public static int add(float a, float b) {
        return Math.round(a + b);
    }

    public static int countPairs(List<Integer> numbers, int k) {

        List<Integer> validList = new ArrayList<>();
        int count = 0;
        for (int j = 0; j <= numbers.size() - 1; j++) {
            if (j != numbers.size() - 1 && numbers.get(j) <= numbers.get(j + 1) && !validList.contains(numbers.get(j))) {
                validList.add(numbers.get(j));
            }
            if (j == numbers.size() - 1 && numbers.get(numbers.size() - 1) > validList.get(validList.size() - 1)) {
                validList.add(numbers.get(j));
            }
        }
        for (int l : validList) {
            if (validList.contains(l + k)) {
                ++count;
            }
        }


        return count;
    }

    public static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder, int itemPerPage, int pageNumber) {

        Comparator<Object> reversed = Comparator.comparing(list -> {
            List<String> list1 = (ArrayList<String>) list;
            return list1.get(sortParameter);
        }).reversed();

        List<List<String>> collect = items.stream()
                .sorted(reversed)
                .collect(Collectors.toList());
        if (sortOrder == 1)
            collect = collect.stream()
                    .sorted(Collections.reverseOrder())
                    .collect(Collectors.toList());

        System.out.println(collect);
        int i = itemPerPage * (pageNumber - 1) < 0 ? 0 : itemPerPage * (pageNumber - 1);
        List<String> finaList = collect.stream().skip(i).map(list -> list.get(0)).collect(Collectors.toList());
        List<String> finaList1 = new ArrayList<>();
        for (int l = 0; l <= finaList.size() - 1 && l < itemPerPage; l++) {
            finaList1.add(finaList.get(l));
        }
        return finaList1;
    }
}
