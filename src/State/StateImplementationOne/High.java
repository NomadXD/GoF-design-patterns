package State.StateImplementationOne;

public class High implements State {
    @Override
    public void pull(CeilingFanPullChain ceilingFanPullChain) {
        ceilingFanPullChain.setCurrentState(new Off());
    }
}
