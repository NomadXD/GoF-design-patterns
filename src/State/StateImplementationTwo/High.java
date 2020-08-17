package State.StateImplementationTwo;

public class High extends State {


    public High(CelingFanPullChain celingFanPullChain) {
        this.celingFanPullChain = celingFanPullChain;
    }

    @Override
    public void pull() {
        this.celingFanPullChain.setCurrentState(this.celingFanPullChain.getOff());

    }
}
