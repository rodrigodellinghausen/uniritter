package geometria;

/**
 *
 * @author Rodrigo
 */
public class Retangulo extends Figura {
    protected double base, altura;
    public double calculaArea() { return base * altura; }
    public double calculaPerimetro() { 
        return 2 * ( base + altura ); 
    }
}
