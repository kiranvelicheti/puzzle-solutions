package challenges.solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortestTest {

    @Test
    public void shortest() {

        Shortest s = new Shortest();

        assertEquals(13, s.shortest("asdfkjeghfalawefhaef"));
    }
}