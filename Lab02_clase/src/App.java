import animales.Canario;
import animales.Gato;
import animales.Perro;

public class App {
    public static void main(String[] args) throws Exception {
        Perro perro = new Perro("Firulais", 3, 15.5, "Labrador", true);
        Gato gato = new Gato("Michi", 3, 5.2, true, "Naranja", false);
        Canario canario = new Canario("Feliciano", 2, 0.3, "Verde", true);

        //Seccion de perro
        System.out.println(perro.toString());
        perro.comer();
        perro.ladrar();
        perro.aullar();
        System.out.println("\n");

        //Seccion de gato
        System.out.println(gato.toString());
        gato.dormir();
        gato.maullar();
        gato.saltar();
        System.out.println("\n");

        //Seccion de canario
        System.out.println(canario.toString());
        canario.comer();   
        canario.cantar();
        canario.volar();
        System.out.println("\n");    }
}
