/**
 *
 * @author Rodrigo
 */
public class Jogo {

    private String timeCasa, timeVisitante;
    private Integer placarCasa, placarVisitante;
    
    public Jogo(Integer placarCasa, Integer placarVisitante, 
            String timeCasa, String timeVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.placarCasa = placarCasa;
        this.placarVisitante = placarVisitante;
    }
   
    public String vencedor() {
        if (placarCasa > placarVisitante) {
            return timeCasa;
        } else if (placarCasa < placarVisitante) {
            return timeVisitante;
        } else { 
            return "Empate";
        }
    }
    
    public boolean empate() {
        return "Empate".equals(vencedor());
    }

    public String getTimeCasa() {
        return timeCasa;
    }

    public String getTimeVisitante() {
        return timeVisitante;
    }

    public Integer getPlacarCasa() {
        return placarCasa;
    }

    public Integer getPlacarVisitante() {
        return placarVisitante;
    }
    
    
}
