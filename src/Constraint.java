public abstract class Constraint {
    private Party controllingParty;
    private ContigencyIndicator i;
    private Node start;
    private Node end;

    public Constraint(Party controllingParty, ContigencyIndicator i, Node start, Node end) {
        this.controllingParty = controllingParty;
        this.i = i;
        this.start = start;
        this.end = end;

    }

    public abstract boolean checkConstraint();

    public Party getControllingParty() {
        return controllingParty;
    }

    public void setControllingParty(Party controllingParty) {
        this.controllingParty = controllingParty;
    }

    public ContigencyIndicator getI() {
        return i;
    }

    public void setI(ContigencyIndicator i) {
        this.i = i;
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
}
