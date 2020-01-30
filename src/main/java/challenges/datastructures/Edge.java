package challenges.datastructures;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Edge {

    private Vertex source;
    private Vertex destination;
    private int weight;
}
