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
public class Main {
    public static void main(String[] args) {
        TravelAgency aviatur = new TravelAgency("Aviatur");
        aviatur.addHotel("Fontanar","Cra. 21a #159a-28");
        aviatur.addAirport("Jose Maria Cordoba");
        aviatur.addAirport("El Dorado");
        aviatur.addTravel("22/03/2017", 30, aviatur.getKnowHotels()[0], 1345, "22/03/2017", "22/03/2017", aviatur.getAirports()[0], aviatur.getAirports()[1]);
        aviatur.getOfferedTravels()[0].addRetorno(1109, "departure", "arrival", aviatur.getAirports()[1], aviatur.getAirports()[0]);
        aviatur.listarViajes();
    }
}
