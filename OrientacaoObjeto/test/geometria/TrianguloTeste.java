/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geometria;

import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo
 */
public class TrianguloTeste {
    
    
    @Before
    public void setUp() {
    }
    
     @Test
    public void deveRetornarPerimetro12EArea6QuandoLados345() {
        Triangulo triangulo = new Triangulo(3.0, 4.0, 5.0);
        
        assertEquals("Perímetro", 12.0, triangulo.calculaPerimetro(), 0.001);
        
        assertEquals("Área", 6.0, triangulo.calculaArea(), 0.001);
    }
    
    @Test
    public void trianguloEhEscaleno() {
        Triangulo triangulo = new Triangulo(3.0, 4.0, 5.0);
        assertEquals("Escaleno", triangulo.devolveTipo() );
    }
    
    @Test
    public void trianguloEhIsoceles() {
        Triangulo triangulo = new Triangulo(3.0, 2.0, 2.0);
        assertEquals("Isóceles", triangulo.devolveTipo() );
    }
    
    @Test
    public void trianguloEhEquilatero() {
        Triangulo triangulo = new Triangulo(3.0, 3.0, 3.0);
        assertEquals("Equilátero", triangulo.devolveTipo() );
    }
}
