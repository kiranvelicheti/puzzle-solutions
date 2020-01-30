package challenges.datastructures;

import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class DijkstraAlgorithmTest {

    private Vertex a = buildVertex("A");
    private Vertex b = buildVertex("B");
    private Vertex c = buildVertex("C");
    private Vertex d = buildVertex("D");
    private Vertex e = buildVertex("E");
    private Edge ab = buildEdge(a, b, 1);
    private Edge ac = buildEdge(a, c, 3);
    private Edge be = buildEdge(b, e, 5);
    private Edge cd = buildEdge(c, d, 1);
    private Edge de = buildEdge(d, e, 4);
    private Edge ce = buildEdge(c, e, 7);
    private Graph graph = Graph.builder()
            .edges(newArrayList(ab, ac, cd, de, ce, be))
            .root(a)
            .build();

    private DijkstraAlgorithm subject = new DijkstraAlgorithm(graph);

    @Test
    public void calShortestPath() {

        List<Edge> edges = subject.calShortestPath(e);

        assertThat(edges).hasSize(2);
        assertThat(edges.get(1).getDestination().getName()).isEqualTo("B");
    }

    @Test
    public void calShortestPath_forD() {

        List<Edge> edges = subject.calShortestPath(d);

        assertThat(edges).hasSize(2);
        assertThat(edges.get(1).getDestination().getName()).isEqualTo("C");
    }

    private Edge buildEdge(Vertex source, Vertex target, int weight) {
        return Edge.builder()
                .source(source)
                .destination(target)
                .weight(weight)
                .build();
    }

    private Vertex buildVertex(String vertexName) {
        return Vertex
                .builder()
                .name(vertexName)
                .build();
    }
}