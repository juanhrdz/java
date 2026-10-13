import Personaje.Arquero;
import Personaje.Guerrero;
import Personaje.Mago;
import Personaje.Personaje;

public class App {
    public static void main(String[] args) throws Exception {
        Guerrero guerrero = new Guerrero("Aragorn", 10, 100, 20, "Cota de malla");
        Mago mago = new Mago("Gandalf", 15, 80, 50, 30);
        Arquero arquero = new Arquero("Legolas", 12, 90, "Arco largo", 80, 10);
        Personaje p = new Guerrero("Boromir", 8, 120, 25, "Cota de malla");

        System.out.println("--- PRIMER TURNO---");
        guerrero.atacar();
        guerrero.defender();

        System.out.println("\n--- SEGUNDO TURNO---");
        mago.atacar();
        mago.defender();

        System.out.println("\n--- TERCER TURNO---");
        arquero.atacar();
        arquero.defender();

        System.out.println("\n--- ESTADO INICIAL ---");
        p.atacar();

        guerrero.recibirDanio(30);
        mago.recibirDanio(20);
        mago.recibirDanio(20);
        mago.recibirDanio(20);
        mago.recibirDanio(40);

        System.out.println("\n--- ESTADO FINAL ---");

        System.out.println(guerrero);
        System.out.println(mago);
        System.out.println(arquero);
    }
}
