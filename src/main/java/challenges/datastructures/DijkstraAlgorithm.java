package challenges.datastructures;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Comparator.comparing;

public class DijkstraAlgorithm {

    private Graph graph;

    public DijkstraAlgorithm(Graph graph) {

        this.graph = graph;
    }

    public List<Edge> calShortestPath(Vertex target) {

        List<List<Edge>> validPaths = newArrayList();
        findBottomEdges(target, validPaths);
        calculateAllPaths(graph, target, validPaths);
        return findShortestPath(validPaths);
    }

    private void findBottomEdges(Vertex target, List<List<Edge>> validPaths) {
        graph
                .getEdges()
                .stream()
                .filter(edge -> edge.getDestination().getName().equalsIgnoreCase(target.getName()))
                .forEach(edge -> validPaths.add(newArrayList(edge)));
    }

    private void calculateAllPaths(Graph graph, Vertex target, List<List<Edge>> validPaths) {
        graph
                .getEdges()
                .stream()
                .filter(edge -> edge.getDestination().getName().equalsIgnoreCase(target.getName()))
                .forEach(edge -> {
                    calculateAllPaths(graph, edge.getSource(), validPaths);
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
                .min(comparing(list -> list.stream()
                        .map(Edge::getWeight)
                        .reduce(Integer::sum)
                        .orElse(0)))
                .orElse(newArrayList());
    }
}