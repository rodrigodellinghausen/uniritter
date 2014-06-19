package cultura;

/**
 *
 * @author Rodrigo
 */
public class Banda extends Artista {

    private Artista[] componentes;
    private EstiloMusical[] estilosMusicais;

    public Artista[] getComponentes() {
        return componentes;
    }

    public void setComponentes(Artista[] componentes) {
        this.componentes = componentes;
    }

    public EstiloMusical[] getEstilosMusicais() {
        return estilosMusicais;
    }

    public void setEstilosMusicais(EstiloMusical[] estilosMusicais) {
        this.estilosMusicais = estilosMusicais;
    }
    
    
    
}
