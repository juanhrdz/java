import Vehiculos.Automovil;
import Vehiculos.Avion;
import Vehiculos.Barco;


public class App {
    public static void main(String[] args) throws Exception {
        Automovil auto = new Automovil("Nissan","Versa", 2017, 160.5, 4, false);
        Avion avion = new Avion("Boeing","747", 2010, 900.0, 4, "American Airlines", 416);
        Barco barco = new Barco("Yamaha","WaveRunner", 2020, 80.0, "Lancha", 2);

        auto.describir();
        System.out.println("\n");
        avion.describir();
        System.out.println("\n");
        barco.describir();
    }
}