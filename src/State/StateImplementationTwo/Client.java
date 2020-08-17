package State.StateImplementationTwo;

public class Client {
    public static void main(String[] args) {
        CelingFanPullChain celingFanPullChain = new CelingFanPullChain();
        celingFanPullChain.pullChain();
        System.out.println(celingFanPullChain.toString());
        celingFanPullChain.pullChain();
        System.out.println(celingFanPullChain.toString());
    }
}
