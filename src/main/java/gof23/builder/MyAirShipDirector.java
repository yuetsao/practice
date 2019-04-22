package gof23.builder;

public class MyAirShipDirector implements AirShipDirector {
    private AirShipBuilder builder;

    public MyAirShipDirector(AirShipBuilder airShipBuilder) {
        this.builder = airShipBuilder;
    }

    @Override
    public AirShip directAirShip() {
        Engine e = builder.builderEngine();
        OrbitalModule o = builder.builderOrbitalModule();
        EscapeTower es = builder.builderEscapeTower();

        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setEscapeTower(es);
        ship.setOrbitalModule(o);
        return ship;
    }
}
