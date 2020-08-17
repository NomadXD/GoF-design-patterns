package State.StateImplementationOne;

public class Off implements State {
    @Override
    public void pull(CeilingFanPullChain ceilingFanPullChain) {
        ceilingFanPullChain.setCurrentState(new Low());
    }
}
