package challenges.solutions;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

import static java.lang.String.join;
import static java.util.stream.Collectors.toList;

public class PrimerNumber {

    public List<String> duplicateWords(List<String> strings) {

        return strings
                .stream()
                .map(s -> {
                    List<String> result = Lists.newArrayList();
                    String[] split = s.split(" ");
                    Arrays.stream(split)
                            .filter(word -> !result.contains(word))
                            .forEach(result::add);
                    return join(" ", result);
                }).collect(toList());


    }
}
