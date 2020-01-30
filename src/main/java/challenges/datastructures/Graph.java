package challenges.datastructures;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Graph {

    private Vertex root;
    private List<Vertex> vertices;
    private List<Edge> edges;
}
