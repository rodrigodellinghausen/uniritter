
package conta;

/**
 *
 * @author Rodrigo
 */
public class Conta {
    
    private Long saldo = 0L;

    public Long getSaldo() {
        return saldo;
    }
    
    public void saque(Long valor) {
        if (saldo < valor) {
            throw new IllegalStateException("Saldo inferior ao valor de saque.");
        }
        
        this.saldo -= valor;
    }
    
    public void deposito(Long valor) {
        if (valor == null || valor < 1L) {
            throw new IllegalArgumentException("Valor do depósito deve ser maior ou igual a 1.");
        }
        saldo += valor;
    }

}
