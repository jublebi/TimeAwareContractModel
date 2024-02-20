public class DurationConstraint extends Constraint{
    private int maxTime;
    private int minTime;
    public DurationConstraint(Party controllingParty, ContigencyIndicator i, Node start, Node end, int maxTime, int minTime) {
        super(controllingParty, i, start, end);
        this.maxTime = maxTime;
        this.minTime = minTime;
    }

    @Override
    public boolean checkConstraint() {
        return (this.getStart().getExecutionTimePoint() + minTime <= this.getEnd().getExecutionTimePoint())
                && (this.getEnd().getExecutionTimePoint() <= this.getStart().getExecutionTimePoint() + maxTime);
    }
}
