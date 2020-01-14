package challenges.solutions;

import com.google.common.collect.Lists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployessTest {

    @Test
    public void teamFormation() {

        assertEquals(Employess.teamFormation(Lists.newArrayList(8, 18, 5, 15, 18, 11, 15, 9, 7), 5, 1), 50);
    }
}