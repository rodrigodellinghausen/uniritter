package colecoes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
class Pilha<T> implements Stack<T>{

    private List<T> values = new ArrayList<T>();
    
    @Override
    public void push(T t) {
        values.add(0,t);
    }

    @Override
    public T pop() {
        if (values.isEmpty()) {
            return null;
        }
        return values.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return values.isEmpty();
    }

    
}
