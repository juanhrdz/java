package Personaje;

public class Personaje implements Combatiente {
    private String nombre;
    private int nivel;
    private int puntoDeVida;
    private boolean estaVivo = true;


    public Personaje(String nombre, int nivel, int puntoDeVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntoDeVida = puntoDeVida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntoDeVida() {
        return puntoDeVida;
    }

    public boolean getEstaVivo() {
        return estaVivo;
    }

    public void recibirDanio(int danio) {
        this.puntoDeVida -= danio;
        if (this.puntoDeVida <= 0) {
            this.puntoDeVida = 0;
            this.estaVivo = false;
        }
        System.out.println(nombre + " recibe " + danio + " puntos de daño. Puntos de vida restantes: " + (puntoDeVida > 0 ? puntoDeVida : 0));
    }

    @Override 
    public void atacar(){System.out.println(nombre + " ataca con un ataque básico.");}

    @Override 
    public void defender(){System.out.println(nombre + " se defiende del ataque.");}

    @Override 
    public String toString(){
        return "=====" + this.getClass().getSimpleName() + "=====" + 
                "\nNombre: " + nombre + 
                "\nNivel: " + nivel + 
                "\nPuntos de Vida: " + puntoDeVida;
    }
}
