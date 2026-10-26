package Personaje;

public class Mago extends Personaje implements Hechicero {
    private int mana;
    private int poderMagico;

    public Mago(String nombre, int nivel, int puntoDeVida, int mana, int poderMagico) {
        super(nombre, nivel, puntoDeVida);
        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    @Override 
    public int getMana() {
        return mana;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    @Override 
    public void atacar(Personaje victima) {
        System.out.println(getNombre() + " lanza un hechizo causando " + getPoderMagico() + " puntos de daño a " + victima.getNombre());
        mana -= 10;
        victima.recibirDanio(calcularDanio());
    }

    @Override 
    public void defender() {
        super.defender();
        System.out.println(getNombre() + " se protege con un escudo mágico.");
    }   

    @Override 
    public void lanzarHechizo(Personaje victimPersonaje){
        System.out.println(getNombre() + " lanza un hechizo a " + victimPersonaje.getNombre() + ".");
    }

    @Override 
    public int calcularDanio(){
        return mana * getNivel();
    }

    @Override 
    public String toString() {
        return super.toString() + 
                "\nMana: " + mana + 
                "\nPoder Mágico: " + poderMagico;
    }  

}
