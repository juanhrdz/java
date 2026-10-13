package Personaje;

public class Mago extends Personaje{
    private int mana;
    private int poderMagico;

    public Mago(String nombre, int nivel, int puntoDeVida, int mana, int poderMagico) {
        super(nombre, nivel, puntoDeVida);
        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    public int getMana() {
        return mana;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    @Override 
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza un hechizo causando " + getPoderMagico() + " puntos de daño.");
    }

    @Override 
    public void defender() {
        super.defender();
        System.out.println(getNombre() + " se protege con un escudo mágico.");
    }   

    @Override 
    public String toString() {
        return super.toString() + 
                "\nMana: " + mana + 
                "\nPoder Mágico: " + poderMagico;
    }  

}
