package reactivedemo;

import challenges.solutions.ShippingRoutes;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShippingRoutesTest {

    @Test
    public void optimalUtilization() {

        ShippingRoutes shippingRoutes = new ShippingRoutes();

        List<List<Integer>> forwardRouteList = new ArrayList<>();
        forwardRouteList.add(Lists.newArrayList(1, 8));
        forwardRouteList.add(Lists.newArrayList(2, 7));
        forwardRouteList.add(Lists.newArrayList(3, 14));

        List<List<Integer>> returnRouteList = new ArrayList<>();
        returnRouteList.add(Lists.newArrayList(1, 5));
        returnRouteList.add(Lists.newArrayList(2, 10));
        returnRouteList.add(Lists.newArrayList(3, 14));
        List<List<Integer>> lists = shippingRoutes.optimalUtilization(20, forwardRouteList, returnRouteList);

        assertEquals(lists.size(), 1);
    }
}