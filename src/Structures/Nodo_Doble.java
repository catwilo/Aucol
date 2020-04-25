/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structures;

/**
 *
 * @author crist
 */
public class Nodo_Doble<T> {
    private T data;
    private Nodo_Doble<T> back, next;

    public Nodo_Doble(T data) {
        this.data = data;
        next = null;
        back = null;
    }

    public Nodo_Doble(){this(null);}

    public void setNext(Nodo_Doble<T> next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setBack(Nodo_Doble<T> back) {
        this.back = back;
    }

    public T getData() {
        return data;
    }

    public Nodo_Doble<T> getBack() {
        return back;
    }

    public Nodo_Doble<T> getNext() {
        return next;
    }
}
