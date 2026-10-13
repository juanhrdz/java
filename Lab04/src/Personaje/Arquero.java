package Personaje;

public class Arquero extends Personaje{
    private String tipoDeArco;
    private int precision;
    private int numeroDeFlechas;

    public Arquero(String nombre, int nivel, int puntoDeVida, String tipoDeArco, int precision, int numeroDeFlechas) {
        super(nombre, nivel, puntoDeVida);
        this.tipoDeArco = tipoDeArco;
        this.precision = precision;
        this.numeroDeFlechas = numeroDeFlechas;
    }

    public String getTipoDeArco() {
        return tipoDeArco;
    }

    public int getPrecision() {
        return precision;
    }

    public int getNumeroDeFlechas() {
        return numeroDeFlechas;
    }

    @Override 
    public void atacar() {
        super.atacar();
        if(numeroDeFlechas > 0){
            System.out.println(getNombre() + "ha atacado con su arco.");
        }else{
            System.out.println(getNombre() + "ya no tiene flechas");
        }
    }

    @Override 
    public void defender() {
        super.defender();
        System.out.println(getNombre() + " esquiva el ataque. ");
    }  

    @Override 
    public String toString() {
        return super.toString() + 
                "\nYipo de Arco: " + tipoDeArco + 
                "\nNumero de Flechas: " + numeroDeFlechas +
                "\n Presicion: " + precision;
    }  
}
`