/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class ItemClassificacao implements Comparable<ItemClassificacao>{
    private String time;
    private Integer pontos;

    public ItemClassificacao(String time, Integer pontos) {
        this.time = time;
        this.pontos = pontos;
    }

    public Integer getPontos() {
        return pontos;
    }

    public String getTime() {
        return time;
    }
    
    public void addPontos(Integer pontos) {
        this.pontos += pontos;
    }

    @Override
    public int compareTo(ItemClassificacao o) {
        return o.getPontos().compareTo( this.pontos );
    }
    
    
}
