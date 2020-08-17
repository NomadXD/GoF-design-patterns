package State.StateImplementationTwo;

public class Low extends State {

    public Low(CelingFanPullChain celingFanPullChain) {
        this.celingFanPullChain=celingFanPullChain;
    }

    @Override
    protected void pull() {

        this.celingFanPullChain.setCurrentState(this.celingFanPullChain.getMedium());

    }
}
