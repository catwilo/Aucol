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
public class Stack<T extends Comparable> {
    private Nodo_Doble<T> top;

    public Stack() {
        top = null;
    }

    public boolean empty() {
        return (top == null);
    }

    public void push(T data){
        Nodo_Doble next = new Nodo_Doble<T>(data);
        if (top != null) {
            top.setNext(next);
            next.setBack(top);
        }
        top = next;

    }
    public T pop(){
        if(empty()) throw new RuntimeException("Stack is empty");
        T data = top.getData();
        top = top.getBack();
        return data;
    }
}
