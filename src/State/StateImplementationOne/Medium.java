package State.StateImplementationOne;

public class Medium implements State {
    @Override
    public void pull(CeilingFanPullChain ceilingFanPullChain) {
        ceilingFanPullChain.setCurrentState(new High());
    }
}
