package challenges.solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateStepsTest {

    @Test
    public void countingValleys() {

        assertEquals(1, CalculateSteps.countingValleys(8, "UDDDUDUU"));
    }


    @Test
    public void countingValleys2() {

        assertEquals(2, CalculateSteps.countingValleys(100, "DDUUDDDUDUUDUDDDUUDDUDDDUDDDUDUUDDUUDDDUDDDUDDDUUUDUDDDUDUDUDUUDDUDUDUDUDUUUUDDUDDUUDUUDUUDUUUUUUUUU"));
    }
}