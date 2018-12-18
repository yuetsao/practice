package gof23.builder;

public class Client {
    public static void main(String[] args) {

        AirShipDirector director = new MyAirShipDirector(new MyAirShipBuilder());
        AirShip airShip = director.directAirShip();


    }
}
