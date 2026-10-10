package animales;

public class Gato extends Animal {
    private boolean esDomestico;
    private String color;
    private boolean tienePelajeLargo;

    public Gato(String nombre, int edad, double peso, boolean esDomestico, String color, boolean tienePelajeLargo) {
        super(nombre, edad, peso);
        this.esDomestico = esDomestico;
        this.color = color;
        this.tienePelajeLargo = tienePelajeLargo;
    }

    public void maullar() {
        System.out.println("El gato está maullando");
    }   

    public void saltar() {
        System.out.println("El gato está saltando");
    }

    @Override 
    public String toString() {
        return super.toString() +
                "\nDomestico: " + (esDomestico ? "Sí" : "No") +
                "\nColor: " + color +
                "\nPelaje Largo: " + (tienePelajeLargo ? "Sí" : "No");
    }

}
