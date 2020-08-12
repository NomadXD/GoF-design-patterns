package mediator;

public class ATCMediator implements IATCMediator {

    private Runway runway;
    private Flight flight;
    private boolean landingStatus;

    @Override
    public void registerRunway(Runway runway) {
        this.runway=runway;

    }

    @Override
    public void registerFlight(Flight flight) {
        this.flight=flight;
    }

    @Override
    public void setLandingStatus(boolean status) {
        this.landingStatus=status;

    }

    @Override
    public boolean isLandingOk() {
        return landingStatus;

    }
}
