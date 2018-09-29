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
public class Travel {
    private String start;
    private int duration;
    private Hotel hotel;
    private BookedFlight outbound;
    private BookedFlight retorno;

    public Travel(String start, int duration, Hotel hotel,int flightNumber, String departure, String arrival, Airport from, Airport to) {
        this.start = start;
        this.duration = duration;
        this.hotel = hotel;
        this.outbound = new BookedFlight(flightNumber, departure, arrival, from, to);
    }
    
    public void addRetorno(int flightNumber, String departure, String arrival, Airport from, Airport to){
        retorno = new BookedFlight(flightNumber, departure, arrival, from, to);
    }
    
    public BookedFlight getOutbound() {
        return outbound;
    }

    public BookedFlight getRetorno() {
        return retorno;
    }
}
