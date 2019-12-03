package challenges.solutions;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class VeryBigSumTest {

    @Test
    public void aVeryBigSum() {
        long[] elements = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        assertThat(VeryBigSum.aVeryBigSum(elements)).isEqualTo(5000000015l);
    }
}