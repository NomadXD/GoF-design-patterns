package mediator;

public class Flight implements Command {

    private ATCMediator atcMediator;

    public Flight(ATCMediator atcMediator) {
        this.atcMediator = atcMediator;
    }

    @Override
    public void land() {

        if(atcMediator.isLandingOk()){
            System.out.println("Succesfully landed");
            atcMediator.setLandingStatus(true);
        }

    }

    public void getReady(){
        System.out.println("Getting ready for landing");
    }
}
