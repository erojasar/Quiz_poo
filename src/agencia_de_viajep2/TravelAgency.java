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
public class TravelAgency {
    private String name;
    private Airport[] airports;
    private Travel[] offeredTravels;
    private Hotel[] knowHotels;

    public TravelAgency(String name) {
        this.name = name;
        this. airports = new Airport[4];
        this.offeredTravels = new Travel[10];
        this.knowHotels = new Hotel[5];
    }
    
    public boolean addAirport(String description){
        for (int i = 0; i < 4; i++) {
            if(airports[i]==null){
                airports[i] = new Airport(description);
                return true;
            }
        }
        return false;
    }
    
    public boolean addTravel(String start, int duration, Hotel hotel,int flightNumber, String departure, String arrival, Airport from, Airport to){
        for (int i = 0; i < 10; i++) {
            if(offeredTravels[i]==null){
                offeredTravels[i] = new Travel(start, duration, hotel, flightNumber, departure, arrival, from, to);
                return true;
            }
        }
        return false;
    }
    
    public boolean addHotel(String name, String address){
        for (int i = 0; i < 5; i++){
            if(knowHotels[i]==null){
                knowHotels[i] = new Hotel(name, address);
                return true;
            }
        }
        return false;
    }

    public Airport[] getAirports() {
        return airports;
    }

    public Travel[] getOfferedTravels() {
        return offeredTravels;
    }

    public Hotel[] getKnowHotels() {
        return knowHotels;
    }
    
    public void listarViajes(){
        for (int i = 0; i < 10; i++) {
            if(offeredTravels[i]!=null){
                System.out.println("La oferta de viaje #" + (i+1) + " es: ");
                System.out.println("El numero de vuelo de la reserva de salida es: " + offeredTravels[i].getOutbound().getFlightNumber());
                System.out.println("La descripción del aeropuerto de salida es: " + offeredTravels[i].getOutbound().getFrom().getDescription());
                System.out.println("El numero de reserva del vuelo de retorno: " + offeredTravels[i].getRetorno().getFlightNumber());
                System.out.println("La descripción del aeropuerto de retorno es: " + offeredTravels[i].getRetorno().getFrom().getDescription());
            }
        }
    }
}
