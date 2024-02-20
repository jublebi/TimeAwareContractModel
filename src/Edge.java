public class Edge {
    private Node start;
    private Node end;
    private Party controllingParty;

    public Edge(Node start, Node end, Party controllingParty) {
        this.start = start;
        this.end = end;
        this.controllingParty = controllingParty;
    }

    public Node getStart() {
        return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

    public Party getControllingParty() {
        return controllingParty;
    }

    public void setControllingParty(Party controllingParty) {
        this.controllingParty = controllingParty;
    }
}
