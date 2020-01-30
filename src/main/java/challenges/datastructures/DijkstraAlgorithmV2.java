package challenges.datastructures;

import java.util.List;
import java.util.function.Consumer;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Comparator.comparing;

public class DijkstraAlgorithmV2 {

    private Graph graph;

    public DijkstraAlgorithmV2(Graph graph) {

        this.graph = graph;
    }

    public List<Edge> calShortestPath(Vertex target) {

        List<List<Edge>> validPaths = newArrayList();
        findBottomEdges(target)
                .andThen(calculateAllPaths(graph, target))
                .accept(validPaths);
        return findShortestPath(validPaths);
    }

    private Consumer<List<List<Edge>>> findBottomEdges(Vertex target) {
        return validPaths -> graph
                .getEdges()
                .stream()
                .filter(edge -> edge.getDestination().getName().equalsIgnoreCase(target.getName()))
                .forEach(edge -> validPaths.add(newArrayList(edge)));
    }

    private Consumer<List<List<Edge>>> calculateAllPaths(Graph graph, Vertex target) {
        return validPaths -> graph
                .getEdges()
                .stream()
                .filter(edge -> edge.getDestination().getName().equalsIgnoreCase(target.getName()))
                .forEach(edge -> {
                    calculateAllPaths(graph, edge.getSource()).accept(validPaths);
                    for (List<Edge> path : validPaths) {
                        if (path.get(path.size() - 1).getSource().getName().equalsIgnoreCase(edge.getDestination().getName())) {
                            path.add(edge);
                        }
                    }
                });
    }

    private List<Edge> findShortestPath(List<List<Edge>> validPaths) {
        return validPaths
                .stream()
                .min(comparing(list -> list.stream().map(Edge::getWeight).reduce(Integer::sum).orElse(0)))
                .orElse(newArrayList());
    }
}