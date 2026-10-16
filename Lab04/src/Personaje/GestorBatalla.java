package Personaje;
import java.util.ArrayList;


public class GestorBatalla  {
    // Versión 1: un solo atacante
    public ArrayList<String>  historial = new ArrayList<>();

    public void ejecutarAtaque(Personaje atacante){
        atacante.atacar();
        atacante.calcularDanio();
        historial.add(atacante.getNombre() + " ataco");
    }

    
    // Versión 2: atacante vs defensor
    public void ejecutarAtaque(Personaje atacante, Personaje defensor){
        atacante.atacar();
        defensor.recibirDanio(atacante.calcularDanio());
        defensor.defender();
        historial.add(atacante.getNombre() + " ataco a " + defensor.getNombre());
        
    }
    // Versión 3: todo un equipo ataca
    public void ejecutarAtaque(Personaje[] equipo){
        for (Personaje personaje : equipo) {
            personaje.atacar();
            personaje.calcularDanio();
            historial.add(personaje.getNombre() + " ataco");
        }
    }

    public void mostrarHistorial(){
        System.out.println("\nHistorial: ");
        for (String string : historial) {
            System.out.println(string);
        }
    }

    public void limpiarHistorial(){
        historial.clear();
    }
}
