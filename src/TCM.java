import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TCM {
    private List<Party> parties;
    private List<Node> nodes;
    private List<Edge> edges;
    private List<Constraint> constraints;
    private Map<Node, List<Node>> adjacencyList;

    public TCM(){
        parties = new ArrayList<>();
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
        constraints = new ArrayList<>();
    }

    private void buildAdjacencyList(){
        this.adjacencyList = new HashMap<>();
        for(Edge edge : edges){
            List<Node> oldEdges = adjacencyList.get(edge.getStart());
            oldEdges.add(edge.getEnd());
            adjacencyList.put(edge.getStart(), oldEdges);

            //Mache es zu einem ungerichteten Graphen
            List<Node> reverseAdjacentNodes = adjacencyList.getOrDefault(edge.getEnd(), new ArrayList<>());
            reverseAdjacentNodes.add(edge.getStart());
            adjacencyList.put(edge.getEnd(), reverseAdjacentNodes);
        }
    }

    public List<Party> getParties() {
        return parties;
    }

    public void setParties(List<Party> parties) {
        this.parties = parties;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    public List<Constraint> getConstraints() {
        return constraints;
    }

    public void setConstraints(List<Constraint> constraints) {
        this.constraints = constraints;
    }
}
