package Personaje;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class GestionGremio{

    private ArrayList<Personaje> roster;
    private java.util.LinkedList<String> colaTurnos;
    private java.util.HashMap<String, Integer> inventario;
    private java.util.HashSet<String> habilidades;

    public GestionGremio() {
        roster      = new ArrayList<>();
        colaTurnos  = new java.util.LinkedList<>();
        inventario  = new java.util.HashMap<>();
        habilidades = new java.util.HashSet<>();
    }

    // ──────────────────────────────────────────
    // SECCIÓN 1 — ArrayList: roster de personajes
    // ──────────────────────────────────────────

    public void agregarMiembro(Personaje p) {
        roster.add(p);
        System.out.println("[Gremio] " + p.getNombre() + " se unió al gremio.");
    }

    public void eliminarMiembro(String nombre) {
        Iterator<Personaje> it = roster.iterator();
        while (it.hasNext()) {
            Personaje p = it.next();
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                it.remove();   // forma segura de eliminar durante iteración
                System.out.println("[Gremio] " + nombre + " abandonó el gremio.");
                return;
            }
        }
        System.out.println("[Gremio] No se encontró: " + nombre);
    }

    public Personaje buscarPorNombre(String nombre) {
        for (Personaje p : roster) {       // for-each
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    public void mostrarRoster() {
        System.out.println("\n=== Roster del Gremio (" + roster.size() + " miembros) ===");
        for (int i = 0; i < roster.size(); i++) {
            Personaje p = roster.get(i);
            System.out.println((i + 1) + ". " + p.getNombre() +
                               " | Nivel: " + p.getNivel() +
                               " | Vida: " + p.getPuntoDeVida());
        }
    }

    // ──────────────────────────────────────────
    // SECCIÓN 2 — LinkedList: cola de turnos
    // ──────────────────────────────────────────

    public void encolarSolicitante(String nombre) {
        colaTurnos.addLast(nombre);    // agrega al final
        System.out.println("[Cola] " + nombre +
                        " en posición " + colaTurnos.size());
    }

    public String atenderSiguiente() {
        if (colaTurnos.isEmpty()) {
            System.out.println("[Cola] No hay solicitantes en espera.");
            return null;
        }
        String atendido = colaTurnos.removeFirst();   // saca del frente
        System.out.println("[Cola] Atendiendo a: " + atendido);
        return atendido;
    }

    public void mostrarCola() {
        System.out.println("\n=== Cola de Espera (" + colaTurnos.size() + ") ===");
        int pos = 1;
        for (String nombre : colaTurnos) {    // for-each sobre LinkedList
            System.out.println(pos++ + ". " + nombre);
        }
    }

    public void agregarItem(String item, int cantidad){
        if(item != null){
            inventario.put(item, cantidad);
            System.out.println("\nSe agregaron " + cantidad +" "+ item);        

        }
    }

    public void usarItem(String item, int cantidad){
        if(inventario.containsKey(item)){
            inventario.put(item, inventario.get(item) - 1);
            System.out.println(item +" usada . Restante " + inventario.get(item));
            if(cantidad <= 0){
                inventario.remove(item);
            }
        }else{
           System.out.println("No existe en el inventario: " + item); 
        }

    }

    public void mostrarInventario(){
        System.out.println("\nInventario \n \t\tItem\t\tCantidad");
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            System.out.println("[Inventario] \t"+ entry.getKey() + " -> \t" + entry.getValue());            
        }
    }

    public boolean  registrarHabilidad(String habilidad){
        if(!tieneHabilidad(habilidad)){
            habilidades.add(habilidad);
            System.out.println("Se registro habilidad " + habilidad);
            return true;
        }
        else{
            System.out.println("Ya tienes esta habiidad");
            return false;
        }
    }

    public boolean tieneHabilidad(String habilidad){
            System.out.print("Tiene " + habilidad + "?");
         if(habilidades.contains(habilidad)){
            System.out.print("  true\n");
            return true;
         }else{
            System.out.print("  false\n");
            return false;
         }
    }

    public void mostrarHabilidades(){
        System.out.println("\n====Habilidades Gremio====");
        for (String habilidad : habilidades) {
            System.out.println("[Habilidades] -"+habilidad);
        }
    }
}