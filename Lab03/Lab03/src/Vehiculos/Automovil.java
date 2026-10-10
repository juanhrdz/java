package Vehiculos;

public class Automovil extends Vehiculos{
    private int numPuertas;
    private boolean esElectrico;

    public Automovil(String marca, String modelo, int anio, double velocidadMaxima, int numPuertas, boolean esElectrico) {
        super(marca, modelo, anio, velocidadMaxima);
        this.numPuertas = numPuertas;
        this.esElectrico = esElectrico;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public boolean isEsElectrico() {
        return esElectrico;
    }

    public void setNumPuertas(int numPuertas) {
        if(numPuertas >= 2 && numPuertas <= 6) {
            this.numPuertas = numPuertas;
        }else{
            throw new IllegalArgumentException("El automóvil debe tener entre 2 y 6 puertas");
        }
    }

    @Override 
    public String toString() {
        return super.toString() + 
        "\nNumPuertas:" + numPuertas + 
        "\nEsElectrico:" + (esElectrico ? "Sí" : "No");
    }
}
