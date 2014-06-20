package colecoes;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo
 */
public class PilhaTeste {
    
    private Stack<String> pilha;
    @Before
    public void setUp() {
        pilha = new Pilha<String>();
    }
    
   @Test
   public void testaPilha() {
       
       
       pilha.push("v1");
       pilha.push("v2");
       pilha.push("v3");
       
       assertFalse(pilha.isEmpty());
       
       assertEquals("v3", pilha.pop());
       assertEquals("v2", pilha.pop());
       assertEquals("v1", pilha.pop());
       
       assertTrue(pilha.isEmpty());
       
   }
   
   @Test
   public void testaPilhaVazia() {
       assertTrue(pilha.isEmpty());
       
       assertNull(pilha.pop());
   }
}
