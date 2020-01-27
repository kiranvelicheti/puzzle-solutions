package challenges.solutions;

import com.google.common.collect.Lists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumTest {

    @Test
    public void pallindrome() {

        assertEquals(9, Sum.pallindrome("aabaa"));
    }

    @Test
    public void music() {
        assertEquals(3, Sum.music(Lists.newArrayList(30, 20, 150, 100, 40)));
    }
}