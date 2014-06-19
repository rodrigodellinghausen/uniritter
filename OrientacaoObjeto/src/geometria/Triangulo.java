package geometria;

/**
 *
 * @author Rodrigo
 */
public class Triangulo extends Figura{

    private double ab;
    private double bc;
    private double ca;

    public Triangulo(double ab, double bc, double ca) {
        this.ab = ab;
        this.bc = bc;
        this.ca = ca;
    }
    
    
    @Override
    public double calculaArea() {
        double p = calculaPerimetro() / 2;
        double tmp = p*(p-ab)* (p-bc)*(p-ca);
        
        return Math.sqrt(tmp);
    }

    @Override
    public double calculaPerimetro() {
        return ab + bc + ca;
    }

    public String devolveTipo() {
        if ( ab == bc && bc == ca && ca == ab) {
            return "Equilátero";
        } else if (ab == bc || bc == ca || ca == ab) {
            return "Isóceles";
        }
        return "Escaleno";
    }

    
}
