package spacecraft;

/**
 * Representa la clase nave espacial tripulada de Estados Unidos
 * @author Luis Ricardo Ortega
 */
public class MannedSpacecraftEEUU extends Spacecraft implements ISpacecraftOrbit{

    int transport;
    int option;
    String orbit;
    int crew;
    String mission;
    
    /**
     * Sobrescritura para elegir el tipo de combustible
     * @return Devuelve el nombre del combustible elegido
     */
    @Override
    protected String fuel() {
        System.out.println("""
                           Elige el tipo de combustible para la nave: 
                           1.Queroseno + Hidrogeno liquido
                           2.Oxido de nitrogeno + Dimetilhidrazina
                           3.Aerozina50 + Oxido de nitrogeno
                           4.Combustible solido""");
        option = consola.nextInt();
                switch(option){
            case 1 -> {
                fuel = "Queroseno + Hidrogeno liquido";
            }
            case 2 -> {
                fuel = "Oxido de nitrogeno + Dimetilhidrazina";
            }
            case 3 -> {
                fuel = "Aerozina50 + Oxido de nitrogeno";
            }
            case 4 -> {
                fuel = "Combustible solido";
            }             
        }
        return fuel;
    }

    /**
     * Metodo para mostrar las caracteristicas de la nave construida
     */
    @Override
    protected void spacecraftCharacteristics() {
        System.out.println("\n Caracteristicas de su nave"
                + " \n Tipo de nave: Nave tripulada de EE.UU"
                + " \n Nombre: " + this.getName()
                + " \n Destino: " + this.getDestination()
                + " \n Peso: " + this.getWeight() + " toneladas"
                + " \n Altura: " + this.getHeight() + " metros"
                + " \n Combustible: " + this.fuel
                + " \n Tripulantes: " + this.transport
                + " \n Órbita: " + this.orbit
                + " \n Misión: " + this.mission
                + " \n Fecha de despegue: " + this.getLaunchDate());
    }

    /**
     * Metodo para elegir la cantidad de tripulantes en la nave
     * @return Deveuelve la cantidad de tripulantes
     */    
    public int crew() {
        System.out.println("Digite el numero de tripulantes que irán en la nave");
        crew = consola.nextInt();
        return crew;
    }

    /**
     * Metodo para elegie el tipo de mision de la nave
     * @return Devuelve la mision elegida
     */
    protected String typeMission(){
        System.out.println("""
                           Elige el tipo de mision de la nave
                           1.Mision lunar
                           2.Estudio del comportamiento humano en condiciones ingrávidas""");
        option = consola.nextInt();
        switch(option){
            case 1 -> {
                mission = "Mision lunar";
            }
            case 2 -> {
                mission = "Estudio del comportamiento humano en condiciones ingrávidas";
            }
        }
        return mission;
    }
    
    /**
     * Sobrescritura del metodo para elegir la órbita donde estara la nave
     * @return Devuelve el tipo de órbita elegido
     */    
    @Override
    public String orbit() {
        System.out.println("""
                           Eliga el tipo de órbita alrededor de la Tierra donde
                           estara la nave espacial 
                           1.Órbita terrestre baja (150 - 2000 km)
                           2.Órbita terrestre media (2000 - 350000 km)""");
        option = consola.nextInt();
        switch(option){
            case 1 -> {
                orbit = "Órbita terrestre baja";
            }
            case 2 -> {
                orbit = "Órbita terrestre media";
            }
        }
        return orbit;
    }   
}
