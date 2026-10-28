import Personaje.*;

public class App {
    public static void main(String[] args) throws Exception {
        GestionGremio gremio = new GestionGremio();
        gremio.agregarMiembro(new Druida("Gustavo", 10, 120, true, 100, 100, 10, 10));
        gremio.agregarMiembro(new Nigromante("felipe", 10, 100, true, 100, 100, 100));
        gremio.agregarMiembro(new Arquero("Legolas", 6, 150, true,"Arco", 20, 95));
        gremio.agregarMiembro(new Guerrero("Shakur", 15, 150, true,   100, "LIngote Astronomico"));
        gremio.mostrarRoster();

        gremio.eliminarMiembro("Shakur");

        gremio.mostrarRoster();

        gremio.buscarPorNombre("Legolas");

        gremio.encolarSolicitante("felipe");
        gremio.encolarSolicitante("Gustavo");
        gremio.encolarSolicitante("Legolas");

        gremio.mostrarCola();

        gremio.atenderSiguiente();

        gremio.mostrarCola();

        gremio.agregarItem("Corona Total", 1);
        gremio.agregarItem("Pocion de Vida", 7);
        gremio.agregarItem("Bomba Luminosa", 2);

        gremio.mostrarInventario();
        
        gremio.usarItem("Pocion de Vida", 1);
        gremio.usarItem("Pocion de Escudo", 1);


        gremio.registrarHabilidad("Curacion");
        gremio.registrarHabilidad("Super Salto");
        gremio.registrarHabilidad("Curacion");

        gremio.mostrarHabilidades();

        gremio.tieneHabilidad("Curacion");
        gremio.tieneHabilidad("Super Rapidez");
    
    }
}
