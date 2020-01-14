package challenges.solutions;

import java.util.ArrayList;
import java.util.List;

public class Employess {

    public static long teamFormation(List<Integer> score, int team_size, int k) {
        // Write your code here

        List<Integer> empl = new ArrayList<>();

        while (empl.size() < team_size) {
            scoreEvaluation(score, k, empl);
        }

        return empl.stream().reduce(Integer::sum).orElse(0);

    }

    private static void scoreEvaluation(List<Integer> score, int k, List<Integer> empl) {

        Integer score1 = score.stream()
                .limit(k)
                .sorted()
                .max(Integer::compare).orElse(0);

        Integer score2 = score.stream()
                .skip(score.size() - k)
                .sorted()
                .max(Integer::compare).orElse(0);

        Integer integer = score1 > score2 ? score1 : score2;
        score.remove(integer);
        empl.add(integer);
    }
}
