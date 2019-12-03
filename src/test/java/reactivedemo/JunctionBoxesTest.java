package reactivedemo;

import challenges.solutions.JunctionBoxes;
import com.google.common.collect.Lists;
import org.junit.Test;

public class JunctionBoxesTest {

    @Test
    public void orderJunctionBoxes() {

        JunctionBoxes jb = new JunctionBoxes();

        jb.orderJunctionBoxes(6, Lists.newArrayList());
    }
}