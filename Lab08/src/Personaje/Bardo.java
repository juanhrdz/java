package Personaje;

public class Bardo extends Personaje implements Sanador{
    private int poderDeCuracion;
    private int poderMusical;
    private String instrumento;

    public Bardo(String nombre, int nivel, int puntoDeVida, int poderMusical, int poderDeCuracion, String instrumento){
        super(nombre, nivel, puntoDeVida);
        this.poderDeCuracion = poderDeCuracion;
        this.poderMusical = poderMusical;
        this.instrumento = instrumento;
    }
    
    @Override
    public int getPoderDeCuracion() {
        return poderDeCuracion;
        
    }

    public String getInstrumento(){
        return instrumento;
    }

    public int getPoderMusical(){
        return poderMusical;
    }

    @Override
    public void atacar() {
        System.out.println(this.getNombre() + " hace " );
        System.out.print("Ataque Musical");
    }

    public void atacar(Personaje victima) {
        atacar();
        victima.recibirDanio(this.calcularDanio());
    }
    
    @Override
    public int calcularDanio() {
        return nivel * poderMusical;
    }

    @Override
    public void curarAliado(Personaje aliado) {
        System.out.println(getNombre() + " curando a " + aliado.getNombre());
        aliado.puntoDeVida += poderDeCuracion;
    
    }

   

    

}
