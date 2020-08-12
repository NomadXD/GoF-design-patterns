package mediator;

public class Runway implements Command {

    private ATCMediator atcMediator;

    public Runway(ATCMediator atcMediator) {
        this.atcMediator = atcMediator;
    }

    @Override
    public void land() {
        if(atcMediator.isLandingOk()){
            System.out.println("Landing Permission Granted");
        }

    }


}
