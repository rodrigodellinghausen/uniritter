/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conta;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo
 */
public class ContaTest {
    
    public ContaTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void devePossuirSaldo100QuandoCriaContaPoupanca() {
        
        Conta conta = new Poupanca();
        assertEquals(new Long(100), conta.getSaldo());
    }
    
    @Test
    public void deveRealizarDepositoQuandoAbreContaCorrente() {
        Long depositoInicial = 40L;
        
        Conta conta = new ContaCorrente(depositoInicial);
        
        assertEquals(depositoInicial, conta.getSaldo());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void esperaErroQuandoValorDeDepositoInicialEhMenorQueUm() {
        Conta conta = new ContaCorrente(0L);
    }
    
    @Test(expected = IllegalStateException.class)
    public void esperaErroQuandoNaoTemSaldoParaSaque() {
        Conta conta = new ContaCorrente(500L);
        
        conta.saque(1000L);
    }
    
}
