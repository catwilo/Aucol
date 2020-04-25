/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structure;

import java.util.*;

/**
 *
 * @author causugamo
 */
public class LinkedStack<T> implements Stack<T> {

    protected ChainNode<T> topNode;

    public LinkedStack() {

    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return topNode.element;
    }

    @Override
    public void push(T theElement) {
        topNode = new ChainNode<>(theElement, topNode);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T topElement = topNode.element;
        topNode = topNode.next;
        return topElement;
    }
}
