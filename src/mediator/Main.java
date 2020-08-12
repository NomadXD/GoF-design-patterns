package mediator;

public class Main {

    public static void main(String[] args) {
        ATCMediator atcMediator = new ATCMediator();
        Runway mainRunway = new Runway(atcMediator);
        Flight sparrowOne = new Flight(atcMediator);
        atcMediator.registerRunway(mainRunway);
        atcMediator.registerFlight(sparrowOne);
        atcMediator.setLandingStatus(true);
        sparrowOne.getReady();
        mainRunway.land();
        sparrowOne.land();
    }


}
