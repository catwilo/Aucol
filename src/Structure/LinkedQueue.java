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
public class LinkedQueue<T> implements Queue<T> {

    protected ChainNode<T> front;
    protected ChainNode<T> rear;

    public LinkedQueue() {
        front = rear = null;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public T getFrontElement() {
        return isEmpty() ? null : front.element;
    }

    @Override
    public T getRearElement() {
        return isEmpty() ? null : rear.element;
    }

    @Override
    public void put(T theElement) {
        ChainNode<T> p = new ChainNode<>(theElement, null);
        if (front == null) {
            front = p;
        } else {
            rear.next = p;
        }
        rear = p;
    }

    @Override
    public T remove() {
        if (isEmpty()) {
            return null;
        }
        T frontElement = front.element;
        front = front.next;
        if (isEmpty()) {
            rear = null;
        }
        return frontElement;
    }

}
