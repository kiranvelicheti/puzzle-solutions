package reactivedemo;

import com.google.common.collect.Lists;
import org.junit.Test;

import static org.junit.Assert.*;

public class JunctionBoxesTest {

    @Test
    public void orderJunctionBoxes() {

        JunctionBoxes jb = new JunctionBoxes();

        jb.orderJunctionBoxes(6, Lists.newArrayList());
    }
}