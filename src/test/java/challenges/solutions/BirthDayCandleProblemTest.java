package challenges.solutions;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BirthDayCandleProblemTest {

    @Test
    public void birthdayCakeCandles() {

        int[] data = {44, 53, 31, 27, 77, 60, 66, 77, 26, 36};
        Integer i = BirthDayCandleProblem.birthdayCakeCandles(data);

        assertThat(i).isEqualTo(2);
    }
}