package mediator;

public interface IATCMediator {

    void registerRunway(Runway runway);
    void registerFlight(Flight flight);
    void setLandingStatus(boolean status);
    boolean isLandingOk();


}
