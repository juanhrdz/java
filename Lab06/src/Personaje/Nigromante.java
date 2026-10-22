package Personaje;

public class Nigromante extends Personaje implements Hechicero {
    private int mana; 
    private int almasAbsorbidas;
    private int poderOscuro;

    public Nigromante(String nombre, int nivel, int puntoDeVida, int mana, int almasAbsorbidas, int poderOscuro) {
        super(nombre, nivel, puntoDeVida);
        this.mana = mana;
        this.almasAbsorbidas = almasAbsorbidas;
        this.poderOscuro = poderOscuro;
    }

    @Override 
    public int getMana() {
        return mana;
    }
    
    public int getAlmasAbsorbidas(){
        return almasAbsorbidas;

    }

    public int getPoderOscuro(){
        return poderOscuro;
    }

    @Override
    public int  calcularDanio() {
        return (int)(mana*poderOscuro*0.8*nivel);
    }

    

    @Override
    public void atacar() {
        System.out.println(this.getNombre() + " hace " );
        System.out.print("Ataque de almas");
    }

    public void atacar(Personaje victima) {
        atacar();
        almasAbsorbidas -= 10;
        victima.recibirDanio(this.calcularDanio());
    }

    @Override
    public void defender() {
        super.defender();
        System.out.print(" con magia oscura. ");
    }

    @Override
    public void lanzarHechizo(Personaje victimPersonaje) {
        atacar(victimPersonaje);
        System.out.print(" de maldicion oscura");
        almasAbsorbidas -=5;
        victimPersonaje.recibirDanio(calcularDanio());
    }
}
