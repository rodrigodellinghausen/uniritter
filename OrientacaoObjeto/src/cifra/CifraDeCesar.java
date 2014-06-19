package cifra;

/**
 *
 * @author Rodrigo
 */
class CifraDeCesar {

    private final int deslocamento;
    
    public CifraDeCesar(int deslocamento) {
        if (deslocamento > 25 || deslocamento < 1) {
            throw new IllegalArgumentException("Deslocamento tem que ser entre 1 e 25.");
        }
        this.deslocamento = deslocamento;
    }
    
    public String codifica(String texto) {
        String retorno = new String();
        char[] chars = texto.toCharArray();
        
        for (char c : chars) {
            if (ehCaracterMaiusculo(c)){
                retorno += calculaNovoChar(c, 'A', 'Z');
            } else if (ehCaracterMinusculo(c)) {
                retorno += calculaNovoChar(c, 'a', 'z');
            } else {
                retorno += c;
            }
        }
        
        return retorno;
    }
    
    private char calculaNovoChar(char _char, int inicio, int fim) {
        int novoChar = _char + deslocamento;
        if (novoChar > fim) {
            novoChar = novoChar - fim + inicio - 1;
        }
        return (char) novoChar;
    }
    
    private boolean ehCaracterMaiusculo(char _char) {
        //A-Z 65-90
         return (_char >= 'A' && _char <= 'Z');
    }
    
    private boolean ehCaracterMinusculo(char _char) {
        //a-z 97-122
         return (_char >= 'a' && _char <= 'z');
    }

}
