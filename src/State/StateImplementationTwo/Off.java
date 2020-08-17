package State.StateImplementationTwo;

public class Off extends State {

    public Off(CelingFanPullChain celingFanPullChain) {
        this.celingFanPullChain=celingFanPullChain;
    }

    @Override
    protected void pull() {
        this.celingFanPullChain.setCurrentState(this.celingFanPullChain.getLow());

    }
}
