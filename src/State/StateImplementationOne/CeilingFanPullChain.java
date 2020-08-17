package State.StateImplementationOne;

public class CeilingFanPullChain {

    private State currentState;

    public CeilingFanPullChain() {
        this.currentState = new Off();
    }

    public void pullChain(){
        currentState.pull(this);
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "CeilingFanPullChain{" +
                "currentState=" + currentState +
                '}';
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
