public class UpperBoundConstraint extends Constraint{
    private int maxTime;
    public UpperBoundConstraint(Party controllingParty, ContigencyIndicator i, Node start, Node end, int deadline) {
        super(controllingParty, i, start, end);
        this.maxTime = deadline;
    }

    @Override
    public boolean checkConstraint() {
        return this.getEnd().getExecutionTimePoint() <= this.getStart().getExecutionTimePoint() + this.maxTime;
    }
}
