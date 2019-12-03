package challenges.solutions;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class JunctionBoxes {

    public List<String> orderJunctionBoxes(int numberOfboxes, List<String> boxList) {

        List<String> collect = boxList
                .stream()
                .filter(boxName -> !boxName.split(" ")[1].matches("-?\\d+(\\.\\d+)?"))
                .sorted(comparing(s -> s.split(" ")[1]))
                .collect(Collectors.toList());

        List<String> collect2 = boxList
                .stream()
                .filter(boxName -> boxName.split(" ")[1].matches("-?\\d+(\\.\\d+)?"))
                .sorted(comparing(s -> s.split(" ")[1]))
                .collect(Collectors.toList());

        collect.addAll(collect2);

        return collect;
    }
}
