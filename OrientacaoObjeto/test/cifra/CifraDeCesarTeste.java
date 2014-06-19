/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cifra;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo
 */
public class CifraDeCesarTeste {
    
    @Before
    public void setUp() {
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarExcecaoQuandoDeslocamentoMaiorQue25() {
        CifraDeCesar cifra = new CifraDeCesar(26);
    }
    
    @Test
    public void deveRetornarTextoCodificadoComDeslocamento2() {
        CifraDeCesar cifra = new CifraDeCesar(2);
        assertEquals("Jgnnq dtcukn ", cifra.codifica("Hello brasil "));
    }
    
    @Test
    public void deveRetornarTextoCodificadoQuandoCaracteresMaiusculosPassamDe_Z() {
        CifraDeCesar cifra = new CifraDeCesar(1);
        assertEquals("ZA ", cifra.codifica("YZ "));
    }
    
    @Test
    public void deveRetornarTextoCodificadoQuandoCaracteresMinusculosPassamDe_z() {
        CifraDeCesar cifra = new CifraDeCesar(1);
        assertEquals("za ", cifra.codifica("yz "));
    }
}
