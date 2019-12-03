package challenges.solutions;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TimeConversionTest {

    @Test
    public void timeConversion() {
        assertThat(TimeConversion.timeConversion("07:05:45PM")).isEqualTo("19:05:45");
    }
}