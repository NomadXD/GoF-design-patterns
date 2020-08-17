package State.StateImplementationTwo;

public class Medium extends State {

    public Medium(CelingFanPullChain celingFanPullChain) {
        this.celingFanPullChain=celingFanPullChain;
    }

    @Override
    protected void pull() {
        this.celingFanPullChain.setCurrentState(this.celingFanPullChain.getHigh());

    }
}

