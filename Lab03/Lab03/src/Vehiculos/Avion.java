package Vehiculos;

public class Avion extends Vehiculos{
    private int numMotores;
    private String Aerolinea;
    private int numAsientos;

    public Avion(String marca, String modelo, int anio, double velocidadMaxima, int numMotores, String Aerolinea, int numAsientos) {
        super(marca, modelo, anio, velocidadMaxima);
        this.numMotores = numMotores;
        this.Aerolinea = Aerolinea;
        this.numAsientos = numAsientos;
    }

    public int getNumMotores() {
        return numMotores;
    }

    public String getAerolinea() {
        return Aerolinea;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumMotores(int numMotores) {
        if(numMotores > 2) {//todos los aviones minimo tiene dos motores
            this.numMotores = numMotores;
        }else{
            throw new IllegalArgumentException("El avión debe tener al menos dos motores");
        }
    }

    public void setAerolinea(String Aerolinea) {
        this.Aerolinea = Aerolinea;
    }

    public void setNumAsientos(int numAsientos) {
        if(numAsientos > 0) {
            this.numAsientos = numAsientos;
        }else{
            throw new IllegalArgumentException("El avión debe tener al menos un asiento");
        }
    }

    @Override 
    public String toString() {
        return super.toString() + 
        "\nNumMotores:" + numMotores + 
        "\nAerolinea:" + Aerolinea + 
        "\nNumAsientos:" + numAsientos;
    }
}
