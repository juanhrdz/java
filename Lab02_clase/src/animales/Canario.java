package animales;

public class Canario extends Animal{

    private String colorPlumaje;
    private boolean canta;

    public Canario(String nombre, int edad, double peso, String colorPlumaje, boolean canta) {
        super(nombre, edad, peso);
        this.colorPlumaje = colorPlumaje;
        this.canta = canta;
    }

    public void cantar() {
        System.out.println("El canario está cantando");
    }

    public void volar() {
        System.out.println("El canario está volando");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nColor de Plumaje: " + colorPlumaje + 
                "\nCanta: " + (canta ? "Sí" : "No");
    }
}
