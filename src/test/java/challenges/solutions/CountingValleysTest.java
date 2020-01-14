package challenges.solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountingValleysTest {

    @Test
    public void countingValleys() {

        assertEquals(1, CountingValleys.countingValleys(8, "UDDDUDUU"));
    }


    @Test
    public void countingValleys2() {

        assertEquals(2, CountingValleys.countingValleys(100, "DDUUDDDUDUUDUDDDUUDDUDDDUDDDUDUUDDUUDDDUDDDUDDDUUUDUDDDUDUDUDUUDDUDUDUDUDUUUUDDUDDUUDUUDUUDUUUUUUUUU"));
    }
}