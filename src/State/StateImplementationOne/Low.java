package State.StateImplementationOne;

public class Low implements State {
    @Override
    public void pull(CeilingFanPullChain ceilingFanPullChain) {
        ceilingFanPullChain.setCurrentState(new Medium());
    }
}
