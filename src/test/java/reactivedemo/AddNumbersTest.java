package reactivedemo;

import challenges.solutions.AddNumbers;
import com.google.common.collect.Lists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddNumbersTest {

    @Test
    public void add() {

        assertEquals(AddNumbers.add(1.01f, 2.04f), 3);
    }


    @Test
    public void countPairs() {
        assertEquals(AddNumbers.countPairs(Lists.newArrayList(6, 1, 2, 3, 4, 5, 6), 2), 4);
    }
}