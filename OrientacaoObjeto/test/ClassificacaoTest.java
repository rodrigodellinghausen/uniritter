/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo
 */
public class ClassificacaoTest {
    
    private List<Jogo> jogos;
    private Classificacao classificacao;
    
    @Before
    public void setUp() {
        jogos = new ArrayList<>();
        jogos.add(new Jogo(1, 0, "Brasil", "Croácia"));
        jogos.add(new Jogo(1, 1, "Camarões", "México"));

        jogos.add(new Jogo(1, 0, "Brasil", "Camarões"));
        jogos.add(new Jogo(1, 1, "Croácia", "México"));

        jogos.add(new Jogo(1, 0, "Brasil", "México"));
        jogos.add(new Jogo(1, 1, "Camarões", "Croácia"));

        classificacao = new Classificacao(jogos);
       
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void deveRetornarBrasilQuandoBrasilFicaEmPrimeiro() {
        assertEquals("Brasil", classificacao.primeiroLugar().getTime());
    }
    
    @Test
    public void deveRetornarMexicoQuandoMexicolFicaEmSegundo() {
        
        assertEquals("México", classificacao.segundoLugar().getTime());
    }
    
}
