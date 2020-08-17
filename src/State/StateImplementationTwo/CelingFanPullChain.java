package State.StateImplementationTwo;

public class CelingFanPullChain {
    private Off off;
    private Low low;
    private Medium medium;
    private High high;
    private State currentState;

    public CelingFanPullChain() {
        off = new Off(this);
        low = new Low(this);
        medium = new Medium(this);
        high = new High(this);
        currentState = off;
    }

    public Off getOff() {
        return off;
    }

    public Low getLow() {
        return low;
    }

    public Medium getMedium() {
        return medium;
    }

    public High getHigh() {
        return high;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void pullChain(){
        this.currentState.pull();

    }

    @Override
    public String toString() {
        return "CelingFanPullChain{" +
                "currentState=" + currentState +
                '}';
    }
}
