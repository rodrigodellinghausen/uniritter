package geometria;

/**
 *
 * @author Rodrigo
 */
public class Circulo extends Figura {
    protected double raio;
    public static final double PI = 3.1415;
    public double calculaArea(){ return PI * raio * raio; }
    public double calculaPerimetro(){return 2 * PI * raio;}
}
