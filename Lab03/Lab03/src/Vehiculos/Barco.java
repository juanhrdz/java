package Vehiculos;

public class Barco extends Vehiculos{
    private String tipo;
    private int numTripulantes;

    public Barco(String marca, String modelo, int anio, double velocidadMaxima, String tipo, int numTripulantes) {
        super(marca, modelo, anio, velocidadMaxima);
        this.tipo = tipo;
        this.numTripulantes = numTripulantes;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumTripulantes() {
        return numTripulantes;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumTripulantes(int numTripulantes) {
        if(numTripulantes > 0) {
            this.numTripulantes = numTripulantes;
        }else{
            throw new IllegalArgumentException("El barco debe tener al menos un tripulante");
        }
    }

    @Override 
    public String toString() {
        return super.toString() + 
        "\nTipo:" + tipo + 
        "\nNumTripulantes:" + numTripulantes;
    }
}
