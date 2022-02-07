package spacecraft;

import java.util.Scanner;

/**
 * Representa la clase nave espacial lanzadera
 * @author Luis Ricardo Ortega
 */
public class ShuttleSpacecraft extends Spacecraft implements ISpacecraftTransport{
 
    /**
     * Atributos de la clase 
     */    
    String transport;
    int option;
       
    /**
     * Sobrescritura del metodo para elegir el tipo de carga de la nave
     * @return Devuelve el nombre de la carga
     */
    @Override
    public String transport(){
        System.out.println("""
                           Elige el tipo de carga que llevara su nave:
                           1.Satélite artificial
                           2.Sonda
                           3.Nave tripulada""");
        option = consola.nextInt();
        switch(option){
            case 1 -> {
                transport = "Satélite artificial";
            }
            case 2 -> {
                transport = "Sonda";
            }
            case 3 -> {
                transport = "Nave tripulada";
            }            
        }
        return transport;       
    }

    /**
     * Sobrescritura para elegir el tipo de combustible
     * @return Devuelve el nombre del combustible elegido
     */
    @Override
    protected String fuel() {
        System.out.println("""
                           Elige el tipo de combustible para la nave: 
                           1.Oxigeno liquido
                           2.Oxido de nitrogeno
                           3.Petroleo refinado
                           4.Dimetilhidracina""");
        option = consola.nextInt();
                switch(option){
            case 1 -> {
                fuel = "Oxigeno liquido";
            }
            case 2 -> {
                fuel = "Oxido de nitrogeno";
            }
            case 3 -> {
                fuel = "Petroleo refinado";
            }
            case 4 -> {
                fuel = "Dimetilhidracina";
            }             
        }
        return fuel;
    }

    /**
     * Metodo para mostrar las caracteristicas de la nave construida
     */
    @Override
    protected void spacecraftCharacteristics() {
        System.out.println(" \n Caracteristicas de su nave"
                + " \n Tipo de nave: Nave lanzadera"
                + " \n Nombre: " + this.getName()
                + " \n Destino: " + this.getDestination()
                + " \n Peso: " + this.getWeight() + " toneladas"
                + " \n Altura: " + this.getHeight() + " metros"
                + " \n Combustible: " + this.fuel
                + " \n Carga: " + this.transport 
                + " \n Fecha de despegue: " + this.getLaunchDate());
    }
  
}
