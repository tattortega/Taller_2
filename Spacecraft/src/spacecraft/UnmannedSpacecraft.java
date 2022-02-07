package spacecraft;

/**
 * Representa la clase nave espacial no tripulada 
 * @author Luis Ricardo Ortega
 */
public class UnmannedSpacecraft extends Spacecraft implements ISpacecraftOrbit{
   
    /**
     * Atributos de la clase
     */
    String active;
    int option;
    String orbit;

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
    
    
    /**
     * Metodo para indicar que la nave sigue activa en su mision
     */
    protected void isActive(){
        if(this.isTakeOff() == true){
            System.out.println("La nave esta activa para la mision");
        }
        else{
            System.out.println("La nave ha sido desactivada para la mision");
        }     
    }

    @Override
    protected String fuel() {
        System.out.println("""
                           Elige el tipo de combustible para la nave: 
                           1.Monometilhidracina
                           2.Oxido nitrico
                           3.Metilhidracina
                           4.Hidracina""");
        option = consola.nextInt();
                switch(option){
            case 1 -> {
                fuel = "Monometilhidracina";
            }
            case 2 -> {
                fuel = "Oxido nitrico";
            }
            case 3 -> {
                fuel = "Metilhidracina";
            }
            case 4 -> {
                fuel = "Hidracina";
            }             
        }
        return fuel;
    }

    @Override
    protected void spacecraftCharacteristics() {
        System.out.println(" \n Caracteristicas de su nave"
                + " \n Tipo de nave: Nave no tripulada"
                + " \n Nombre: " + this.getName()
                + " \n Destino: " + this.getDestination()
                + " \n Peso: " + this.getWeight() + " toneladas"
                + " \n Altura: " + this.getHeight() + " metros"
                + " \n Combustible: " + this.fuel
                + " \n Órbita: " + this.orbit
                + " \n Fecha de despegue: " + this.getLaunchDate());
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
                           2.Órbita terrestre media (2000 - 350000 km)
                           3.Órbita geoestacionaria (mayor a 35000 km)""");
        option = consola.nextInt();
        switch(option){
            case 1 -> {
                orbit = "Órbita terrestre baja";
            }
            case 2 -> {
                orbit = "Órbita terrestre media";
            }
            case 3 -> {
                orbit = "Órbita geoestacionaria";
            }
        }
        return orbit;
    }

}
