public class LowerBoundConstraint extends Constraint{
    private int minTime;
    public LowerBoundConstraint(Party controllingParty, ContigencyIndicator i, Node start, Node end, int deadline) {
        super(controllingParty, i, start, end);
        this.minTime = deadline;
    }

    @Override
    public boolean checkConstraint() {
        return this.getEnd().getExecutionTimePoint() >= this.getStart().getExecutionTimePoint() + this.minTime;
    }
}
