package Personaje;


public class Druida extends Personaje implements Hechicero, Sanador {
    private int mana;
    private int poderCuracion;
    private int inteligencia;
    private int fe;

    public Druida(String nombre, int nivel, int puntoDeVida, int mana, int poderCuracion, int inteligencia, int fe) {
        super(nombre, nivel, puntoDeVida);
        this.mana = mana;
        this.poderCuracion = poderCuracion;
        this.inteligencia = inteligencia;
        this.fe = fe;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public int getPoderDeCuracion() {
        return poderCuracion;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getFe() {
        return fe;
    }

    
    @Override
    public int calcularDanio() {
        return (int)(inteligencia * fe * nivel* 0.33);
    }

    @Override
    public void atacar() {
        System.out.println(this.getNombre() + " hace " );
        System.out.print("Ataque de almas");
    }

    public void atacar(Personaje victima) {
        this.atacar();
        mana -= 10;
        victima.recibirDanio(this.calcularDanio());
    }

    @Override
    public void lanzarHechizo(Personaje victimPersonaje) {
        this.atacar(victimPersonaje);
        System.out.println("con de ramas magicas");
        this.mana  = this.mana - 5;
        victimPersonaje.recibirDanio(this.calcularDanio());
    
    }

    @Override
    public void curarAliado(Personaje aliadPersonaje) {
        System.out.println(this.getNombre() + " curando a " + aliadPersonaje.getNombre());
        aliadPersonaje.puntoDeVida = aliadPersonaje.puntoDeVida + poderCuracion;
    }
}