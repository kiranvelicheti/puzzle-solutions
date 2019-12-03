package reactivedemo;

import challenges.solutions.CellsImpl;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.assertEquals;

public class CellsImplTest {

    @Test
    public void calculate() {

        CellsImpl cells = new CellsImpl();

        List<Integer> calculate = cells.calculate(IntStream.of(1, 0, 0, 0, 0, 1, 0, 0).toArray(), 1);

        assertEquals(newArrayList(0, 1, 0, 0, 1, 0, 1, 0), calculate);
    }

    @Test
    public void calculate_days2() {

        CellsImpl cells = new CellsImpl();

        List<Integer> calculate = cells.calculate(IntStream.of(1, 1, 1, 0, 1, 1, 1, 1).toArray(), 2);

        assertEquals(newArrayList(0, 0, 0, 0, 0, 1, 1, 0), calculate);
    }

}