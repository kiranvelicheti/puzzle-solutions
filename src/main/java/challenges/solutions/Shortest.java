package challenges.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static java.util.Arrays.asList;

public class Shortest {


    public int shortest(String s) {

        List<String> chars = new ArrayList<>(new HashSet<>(asList(s.split(""))));
        int windowSize = chars.size();
        int result = s.length();
        while (windowSize < s.length()) {
            for (int i = 0; i < s.length() - chars.size() - 1; i++) {
                String substring = s.substring(i, windowSize - 1);
                result = chars
                        .stream()
                        .allMatch(substring::contains)
                        && substring.length() < result

                        ? substring.length()
                        : result;
            }
            windowSize++;
        }
        return result;
    }
}
