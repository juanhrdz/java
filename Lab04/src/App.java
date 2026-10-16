import Personaje.Arquero;
import Personaje.GestorBatalla;
import Personaje.Guerrero;
import Personaje.Mago;
import Personaje.Personaje;

public class App {
    public static void main(String[] args) throws Exception {
        Personaje guerrero = new Guerrero("Aragorn", 10, 100, 20, "Cota de malla");
        Personaje mago = new Mago("Gandalf", 15, 80, 50, 30);
        Personaje arquero = new Arquero("Legolas", 12, 90, "Arco largo", 80, 10);
        
        Personaje [] equipo = {guerrero, mago, arquero};
        
        //Personaje p = new Guerrero("Boromir", 8, 120, 25, "Cota de malla");
        GestorBatalla gestor = new GestorBatalla();

        for (Personaje p : equipo) {
            System.out.println(p.getNombre() + " daño: " + p.calcularDanio());
        }

        System.out.println("--- PRIMER TURNO---");
        gestor.ejecutarAtaque(arquero);

        System.out.println("\n--- SEGUNDO TURNO---");
        gestor.ejecutarAtaque(guerrero, arquero);
        
        System.out.println("\n--- TERCER TURNO---");
        gestor.ejecutarAtaque(equipo);

        gestor.mostrarHistorial();
        System.out.println("\nTipo de Combatiente");
        for (Personaje p : equipo) {
            
            if (p instanceof Guerrero) {
                System.out.println(p.getNombre() + " es un Guerrero.");
            } else if (p instanceof Mago) {
                System.out.println(p.getNombre() + " es un Mago.");
            } else if (p instanceof Arquero) {
                System.out.println(p.getNombre() + " es un Arquero.");
            }
        }

        System.out.println("\n--- ESTADO INICIAL ---");

        /*guerrero.recibirDanio(30);
        mago.recibirDanio(20);
        mago.recibirDanio(20);
        mago.recibirDanio(20);
        mago.recibirDanio(40);*/

        System.out.println("\n--- ESTADO FINAL ---");

        System.out.println(guerrero);
        System.out.println(mago);
        System.out.println(arquero);
    }
}
