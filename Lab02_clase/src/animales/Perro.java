package animales;

public class Perro extends Animal {

    private String raza;
    private boolean estaVacunado;

    public Perro(String nombre, int edad, double  peso, String raza, boolean estaVacunado) {
        super(nombre, edad, peso);
        this.raza = raza;
        this.estaVacunado = estaVacunado; 
    }

    public void ladrar() {
        System.out.println("El perro está ladrando");
    }

    public void aullar() {
        System.out.println("El perro está aullando");
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nRaza: " + raza +
                "\nVacunado: " + (estaVacunado ? "Sí" : "No");
    }
}

