package spacecraft;

import java.util.Date;
import java.util.Scanner;

/**
 * Representa la clase abstracta de una nave espacial
 * @author Luis Ricardo Ortega
 */
public abstract class Spacecraft implements ISpacecraft{
    
    /**
     * Clase para obtener la entrada de datos
     */    
    Scanner consola = new Scanner(System.in);
    
    /**
     * Atributos de la clase nave espacial
     */
    public String name;
    protected String destination;
    protected String fuel;
    public int weight;
    public int height;  
    private String launchDate;
    boolean takeOff;

    /**
     * Constructor sin parametros para instanciar la clase
     */
    protected Spacecraft() {
    }

    /**
     * Constructor con parametros para instanciar la clase
     * @param name Nombre de la nave 
     * @param destination Destino de la nave
     * @param fuel Combustible de la nave
     * @param weight Peso de la nave
     * @param height Altura de la nave
     * @param launchDate Fecha de lanzamiento de la nave
     */
    protected Spacecraft(String name, String destination, String fuel, 
            int weight, int height, String launchDate, boolean takeOff) {
        this.name = name;
        this.destination = destination;
        this.fuel = fuel;
        this.weight = weight;
        this.height = height;
        this.launchDate = launchDate;
        this.takeOff = takeOff;
    }

    /**
     * 
     * @return 
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public boolean isTakeOff() {
        return takeOff;
    }

    public void setTakeOff(boolean takeOff) {
        this.takeOff = takeOff;
    }
    
    
    
    /**
     * Metodo para dar nombre a la nave e invocar el metodo privado de elegir 
     * el destino de la nave
     * @return Devuelve el nombre de la nave
     */
    public String nameSpacecraft(){
        System.out.println("Digite el nombre que le va a dar a su nave");
        this.name = consola.nextLine();
        destination();
        return this.name;       
    }
       
    
    /**
     * Metodo para elegir el destino de la nave
     * @return Devuelve el nombre del destino de la nave
     */
    private String destination(){
        System.out.println("Digite el destino que tendra su nave");
        this.destination = consola.nextLine();
        return this.destination;
    }

    /**
     * Metodo para elegir el peso de la nave
     * @return Devuelve la cantidad de peso elegida en toneladas
     */
    protected double weight(){
        System.out.println("Eliga el peso que tendra su nave"
                + "(minimo 100 toneladas)");
        weight = consola.nextInt();
        return weight;       
    }
    
    /**
     * Metodo para elegir la altura de la nave
     * @return Devuelve el tamaño de la nave en metros
     */
    protected double height(){
        System.out.println("Eliga la altura que tendra su nave"
                + "(minimo 100 metros)");
        height = consola.nextInt();
        return height;       
    }    

    /**
     * Metodo para elegir el tipo de combustible de la nave
     */
    protected abstract String fuel();             
    
    /**
     * Metodo para mostrar las carasteristicas de la nave creada
     */
    protected abstract void spacecraftCharacteristics();
    
    /**
     * Metodo para elegir la fecha de lanzamiento de la nave
     * @return Devuelve la fecha
     */
    public String launchDate() {
        int day;
        int month;
        int year;
        System.out.println("Seleccione la fecha de lanzamiento de la nave:");
        System.out.println("Digite el dia");
        day = consola.nextInt();
        System.out.println("""
                           Seleccione el mes
                           1.Enero
                           2.Febrero
                           3.Marzo
                           4.Abril
                           5.Mayo
                           6.Junio
                           7.Julio
                           8.Agosto
                           9.Septiembre
                           10.Octubre
                           11.Noviembre
                           12.Diciembre""");
        month = consola.nextInt();
        System.out.println("Digite el año");
        year = consola.nextInt();
        launchDate = day + "-" + month + "-" + year; 
        return launchDate;
        }

    /**
     * Metodo para despegar la nave
     */    
    @Override
    public boolean takeOff() {
        System.out.println("""
                           
                           Ha llegado la fecha de lanzamiento de la nave
                           ¿Quieres despegar la nave?
                           1.Si
                           2.No""");
        int option = consola.nextInt();
        if(option == 1){
            startEngine();            
            System.out.println("Despegue en 10,9,8,7,6,5,4,3,2,1 \n "
                    + "Despegue exitoso de la nave " + this.name 
                    + " con destino a " + this.destination 
                    + " el " + this.launchDate);
            System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»"
                                + "»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»"
                                + "»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»­");
            takeOff = true;
            land();
        }else{
            System.out.println("Despegue cancelado de la nave " + this.name);
        }
        return takeOff;
    }
    
    /**
     * Sobrescritura del metodo enceder motor
     */
    @Override
    public void startEngine() {
        System.out.println("Encendiendo motores");
    }
    
    /**
     * Sobrescritura del metodo apagar motor
     */
    @Override
    public void shutdownEngine() {
        System.out.println("Apagando motores");
    }
    
    /**
     * Metodo para aterrizar la nave
     */
    @Override
    public void land() {
        System.out.println("""
                           Iniciando aterrizaje de la nave.......
                           Aterrizaje exitoso""");
        shutdownEngine();
    }
    
    
}
