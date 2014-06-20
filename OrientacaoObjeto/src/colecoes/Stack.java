/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colecoes;

/**
 *
 * @author Rodrigo
 */
public interface Stack<T> {
    public void push(T object);
    public T pop();
    public boolean isEmpty();
}
