
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
class Classificacao {

    private List<Jogo> jogos;
    private Map<String, ItemClassificacao> timesPontos = new HashMap<String, ItemClassificacao>();
    
    public Classificacao(List<Jogo> jogos) {
        this.jogos = jogos;
        geraClassificacao();
    }

    private void geraClassificacao() {
        for (Jogo jogo : jogos) {
            if (jogo.empate()) {
                somaPontos(jogo.getTimeCasa(), 1);
                somaPontos(jogo.getTimeVisitante(), 1);
            } else {
                somaPontos(jogo.vencedor(), 3);
            }
        }
    }
    
    private void somaPontos(String time, Integer pontos) {
        ItemClassificacao item = timesPontos.get(time);
        if (item == null) {
            item = new ItemClassificacao(time, 0);
            timesPontos.put(time, item);
        }
        
        item.addPontos(pontos);
    }
    
   private List<ItemClassificacao> getTimesClassificacao() {
       List<ItemClassificacao> itensClassificacao = new ArrayList<>(timesPontos.values());
       
       Collections.sort(itensClassificacao);
       return itensClassificacao;
    }
   
   public ItemClassificacao primeiroLugar() {
       return getTimesClassificacao().get(0);
   }
   
   public ItemClassificacao segundoLugar() {
       return getTimesClassificacao().get(1);
   }
}
