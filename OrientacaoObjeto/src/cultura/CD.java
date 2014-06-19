package cultura;

/**
 *
 * @author Rodrigo
 */
public class CD {
    
    private String titulo;
    private Cancao[] faixas;
    private Artista artista;

    public CD(String titulo, Cancao[] faixas, Artista artista) {
        this.titulo = titulo;
        this.faixas = faixas;
        this.artista = artista;
    }

    public Cancao devolveFaixa(String nomeFaixa) {
        return null;
    }
    
    public Cancao devolveFaixa(int faixa) {
        return null;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Cancao[] getFaixas() {
        return faixas;
    }

    public void setFaixas(Cancao[] faixas) {
        this.faixas = faixas;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
   
}
