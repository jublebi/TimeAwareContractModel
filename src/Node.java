public class Node {
    private NodeTypes type;
    private Party controllingParty;
    private ContigencyIndicator i;
    private int executionTimePoint;

    public Node (){

    }

    public NodeTypes getType() {
        return type;
    }

    public void setType(NodeTypes type) {
        this.type = type;
    }

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

    public Integer getExecutionTimePoint() {
        return executionTimePoint;
    }

    public void setExecutionTimePoint(Integer executionTimePoint) {
        this.executionTimePoint = executionTimePoint;
    }
}
