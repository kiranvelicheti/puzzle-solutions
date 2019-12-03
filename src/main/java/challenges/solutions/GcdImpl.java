package challenges.solutions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GcdImpl {

    public int generalizedGCD(int num, int[] arr) {
        List<Integer> values = IntStream.of(arr).boxed().collect(Collectors.toList());
        Integer small = values.stream().sorted().findFirst().orElse(1);
        if (values.stream().allMatch(i -> i % small == 0)) {
            return small;
        } else {
            int index = values.indexOf(small);
            int element = small / 2;
            values.add(index, element);
            return generalizedGCD(num, values.stream().mapToInt(i -> i).toArray());
        }
    }
}
