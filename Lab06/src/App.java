import Personaje.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Personaje guerrero = new Guerrero("Aragorn", 10, 100, 20, "Cota de malla");
        //Personaje mago = new Mago("Gandalf", 15, 80, 50, 30);
        //Personaje arquero = new Arquero("Legolas", 12, 90, "Arco largo", 80, 10);
        

        Personaje bardo = new Bardo("Migeulo", 10, 100, 10, 10,"Flauta");
        Personaje nigromante = new Nigromante("Madafaker", 10, 100, 10, 10, 10);
        Personaje druida = new Druida("Josefal", 10, 100, 10, 10, 10, 10);
        Personaje [] equipo = {bardo, nigromante, druida};
        
        Personaje enemigo = new Guerrero("Boromir", 8, 120, 25, "Cota de malla");
        
        //GestorBatalla gestor = new GestorBatalla();

        for (Personaje p : equipo) {
            p.atacar();
            System.out.println(p.getNombre() + " daño: " + p.calcularDanio());
        }
        
        
/*      
        System.out.println("--- PRIMER TURNO---");
        gestor.ejecutarAtaque(arquero);

        System.out.println("\n--- SEGUNDO TURNO---");
        gestor.ejecutarAtaque(guerrero, arquero);
        
        System.out.println("\n--- TERCER TURNO---");
        gestor.ejecutarAtaque(equipo);

        gestor.mostrarHistorial();
        System.out.println("\nTipo de Combatiente");
*/
        for (Personaje p : equipo) { 
            if (p instanceof Hechicero h) {
                h.lanzarHechizo(nigromante);
            } else if (p instanceof Sanador s) {
                s.curarAliado(nigromante);
            }
        }

        System.out.println("\n--- ESTADO INICIAL ---");

        /*guerrero.recibirDanio(30);
        mago.recibirDanio(20);
        mago.recibirDanio(20);
        mago.recibirDanio(20);
        mago.recibirDanio(40);*/

        System.out.println("\n--- ESTADO FINAL ---");

        druida.mostrarEstado();
        nigromante.mostrarEstado();
        bardo.mostrarEstado();
    }
}
