import Personaje.*;

public class App {
    public static void main(String[] args) throws Exception {

        Personaje bardo = new Bardo("Migeulo", 10, 100, 10, 10,"Flauta");
        Personaje nigromante = new Nigromante("Madafaker", 10, 100, 100, 10, 10);
        Personaje druida = new Druida("Josefal", 10, 100, 100, 10, 10, 10);
        Druida druida2 = new Druida("Terminator", 10, 100, 100, 10, 10, 10);
        //Personaje [] equipo = {bardo, nigromante, druida};
        
        Personaje enemigo = new Guerrero("Boromir", 8, 120, 25, "Cota de malla");
        
        System.out.println("Escenario 1");
        MotorCombate motor = new MotorCombate();
        motor.ejecutarTurno(nigromante, enemigo);

        System.out.println("\nEscenario 2");
        druida.recibirDanio(9999);   // primero derrota al druida
        motor.ejecutarTurno(druida, nigromante);  // captura PersonajeDerrotadoException

        System.out.println("\nEscenario 3");
        Arquero sinFlechas = new Arquero("Legolas", 6, 150, "Arco Largo", 0, 95);
        motor.ejecutarTurno(sinFlechas, nigromante);  // captura RecursoInsuficienteException

        System.out.println("Escenario 4");
        try {
            druida2.curarAliado(nigromante);
        }catch(PersonajeNuloException e){
            System.out.println(e);
        }catch(AccionInvalidaException e){
            System.out.println(e);
        }

        System.out.println("\nEscenario 5");
        try {
            nigromante.recibirDanio(-50);
        } catch (AccionInvalidaException e) {
            System.out.println("Capturado: " + e.getMessage());
        } finally {
            System.out.println("El bloque finally siempre se ejecuta.");
        }

        System.out.println("\nEscenario 6");
        motor.mostrarBitacora();
       
        druida.mostrarEstado();
        nigromante.mostrarEstado();
        bardo.mostrarEstado();
    }
}
