package Vehiculos;

public class Vehiculos {
    private String marca;
    private String modelo;
    private int anio;
    protected double velocidadMaxima;

    public Vehiculos(String marca, String modelo, int anio, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public int getAnio() {
        return anio;
    }
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        if(anio >= 1885 && anio <= 2100) {
            this.anio = anio;
        }else{
            throw new IllegalArgumentException("El año no puede ser menor a 1885 ni mayor a 2100");
        }
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        if(velocidadMaxima > 0) {
            this.velocidadMaxima = velocidadMaxima;
        }else{
            throw new IllegalArgumentException("La velocidad máxima debe ser un valor positivo");
        }
    }

    @Override 
    public String toString() {
        return "===== " + this.getClass().getSimpleName()+ " =====" + 
        "\nMarca:" + marca + 
        "\nModelo:" + modelo + 
        "\nAño:" + anio + 
        "\nVelocidadMaxima:" + velocidadMaxima;
    }

    public void describir(){
        System.out.println(this.toString());
    }
}
