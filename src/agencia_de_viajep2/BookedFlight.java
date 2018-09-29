
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia_de_viajep2;

/**
 *
 * @author emlad
 */
public class BookedFlight {
    private int flightNumber;
    private String departure;
    private String arrival;
    private Airport from;
    private Airport to;
    public BookedFlight(int flightNumber, String departure, String arrival, Airport from, Airport to) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.from = from;
        this.to = to;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public Airport getFrom() {
        return from;
    }
}
