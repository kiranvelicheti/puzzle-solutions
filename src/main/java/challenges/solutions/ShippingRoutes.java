package challenges.solutions;

import com.google.common.collect.Lists;

import java.util.*;
import java.util.stream.Collectors;

public class ShippingRoutes {

    public List<List<Integer>> optimalUtilization(int maxTravelDist,
                                                  List<List<Integer>> forwardRouteList,
                                                  List<List<Integer>> returnRouteList) {

        List<Map.Entry<List<Integer>, Integer>> routes = forwardRouteList
                .stream()
                .map(forwardRoute -> {
                    Integer forwardRouteId = forwardRoute.get(0);
                    return returnRouteList
                            .stream()
                            .map(returnRoute -> {
                                HashMap<List<Integer>, Integer> toAndFro = new HashMap<>();
                                toAndFro.put(Lists.newArrayList(forwardRouteId, returnRoute.get(0)), returnRoute.get(1) + forwardRoute.get(1));
                                return toAndFro;
                            })
                            .collect(Collectors.toList());
                })
                .flatMap(List::stream)
                .map(Map::entrySet)
                .flatMap(Collection::stream)
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .filter(e -> e.getValue() <= maxTravelDist)
                .collect(Collectors.toList());

        return routes
                .stream()
                .filter(route -> route.getValue().equals(routes.get(routes.size() - 1).getValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
