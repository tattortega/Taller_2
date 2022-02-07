package spacecraft;

import java.util.Scanner;

/**
 * Representa la clase principal para crear naves espaciales
 *
 * @author Luis Ricardo Ortega
 */
public class SpacecraftWorkshop {

    public static void main(String[] args) {
        /**
          * Clase para obtener la entrada de datos
        */
        Scanner consola = new Scanner(System.in);
        /**
         * Atributo para elegir la opcion al construir naves
         */
        int option;
        int typeSpacecraft;
        
        System.out.println("BIENVENIDO AL TALLER DE NAVES ESPACIALES");
        
        do {
            System.out.println("""
                              \n  ¿Quieres construir una nave espacial? 
                                1.Si 
                                2.No""");
            option = consola.nextInt();
            if (option == 1) {
                System.out.println("""
                                   \n Elige el tipo de nave que desea construir: 
                                    1.Nave lanzadera 
                                    2.Nave no tripulada 
                                    3.Nave tripulada de EE.UU.
                                    4.Nave tripulada de Rusia """);
                typeSpacecraft = consola.nextInt();
                switch(typeSpacecraft){
                    case 1 -> {
                        System.out.println("""
                                        \n La nave lanzadera sirve para lanzar 
                                           una carga útil al espacio como un 
                                           satélite artificial, una sonda o 
                                           una nave tripulada. \n """);
                        ShuttleSpacecraft falcon = new  ShuttleSpacecraft();
                        falcon.nameSpacecraft();
                        falcon.weight();
                        falcon.height();
                        falcon.fuel();
                        falcon.transport();
                        falcon.launchDate();
                        falcon.spacecraftCharacteristics();
                        falcon.takeOff();
                        
                        break;
                    }
                    case 2 -> {
                        System.out.println("""
                                        \n La nave no tripulada sirve para 
                                           estudiar cuerpos celestes. \n """);
                        UnmannedSpacecraft galileo = new UnmannedSpacecraft();
                        galileo.nameSpacecraft();
                        galileo.weight();
                        galileo.height();
                        galileo.fuel();
                        galileo.launchDate();
                        galileo.orbit();
                        galileo.spacecraftCharacteristics();
                        galileo.takeOff();
                        galileo.isActive();
                        break;
                    }
                    case 3 -> {
                        System.out.println("""
                                        \n La nave tripulada de EE.UU. sirve 
                                           para misiones lunares y estudio del 
                                           comportamiento humano en condiciones 
                                           ingrávidas.\n """);
                        MannedSpacecraftEEUU apolo = new MannedSpacecraftEEUU();
                        apolo.nameSpacecraft();
                        apolo.weight();
                        apolo.height();
                        apolo.fuel();
                        apolo.typeMission();
                        apolo.crew();
                        apolo.launchDate();
                        apolo.orbit();
                        apolo.spacecraftCharacteristics();
                        apolo.takeOff();                        
                        break;
                    }
                    case 4 -> {
                        System.out.println("""
                                        \n La nave tripulada de Rusia sirve 
                                           para mantenimiento de satelites y 
                                           probar acoplamientos con otras naves""");
                        MannedSpacecraftRussia soyuz = new MannedSpacecraftRussia();
                        soyuz.nameSpacecraft();
                        soyuz.weight();
                        soyuz.height();
                        soyuz.fuel();
                        soyuz.typeMission();
                        soyuz.crew();
                        soyuz.launchDate();
                        soyuz.orbit();
                        soyuz.spacecraftCharacteristics();
                        soyuz.takeOff();                        
                        break;
                    }
                }
            } else if (option == 2) {
                System.out.println("Programa terminado");
            }
        } while (option !=2);
    }
}
