import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo
 */
public class JogoTest {
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void deveRetornarVencedorGremioQuandoGremioVenceEmCasa() {
        Jogo marelli = new Jogo(1,0,"Grêmio", "Inter");
        assertEquals("Grêmio", marelli.vencedor());
    }
    
    @Test
    public void deveRetornarGremioQuandoGremioVenceFora() {
        Jogo marelli = new Jogo(1,2,"Inter", "Grêmio");
        assertEquals("Grêmio", marelli.vencedor());
    }
    
    @Test
    public void deveRetornarEmpateQuandoPlacarIgual() {
        Jogo marelli = new Jogo(2, 2, "Atlético", "Guarani");
        assertEquals("Empate", marelli.vencedor());
    }
    
}
