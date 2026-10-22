package Personaje;

public abstract class Personaje implements Combatiente {
    protected  String nombre;
    protected  int nivel;
    protected  int puntoDeVida;
    protected  boolean estaVivo = true;
    


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

    public abstract int calcularDanio();

    @Override 
    public abstract void atacar();

    @Override 
    public void defender(){System.out.println(nombre + " se defiende del ataque.");}

    @Override 
    public String toString(){
        return "=====" + getClass().getSimpleName() + "=====" + 
                "\nNombre: " + nombre + 
                "\nNivel: " + nivel + 
                "\nPuntos de Vida: " + puntoDeVida;
    }

    public void mostrarEstado(){
        System.out.println("Estado de " + this.nombre + 
                            " | Puntos de Vida: "+ this.puntoDeVida);
    }  

    public void mostrarEstado(boolean detallado){
        if(detallado){
            System.out.println("Estado de " + this.nombre + 
                                " | Puntos de Vida: "+ this.puntoDeVida +
                                " | Nivel: "+ this.nivel);
        }
    } 
     
    public void mostrarEstado(String prefijo){
        System.out.println(prefijo + "Estado de " + this.nombre + 
                                    " | Puntos de Vida: "+ this.puntoDeVida);    
    }   
}
