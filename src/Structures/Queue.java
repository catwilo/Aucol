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
public class Queue<T extends Comparable> {
    
    private Node<T> front, rear;

    public Queue(){
        front = null;
        rear = null;
    }

    public void enqueue(T item){
        Node<T> newp= new Node<T>(item);
        if(rear != null){
            rear.setNext(newp);
        }
        else{
            front = newp;
        }
        rear = newp;
    }

    public boolean empty() { return (front == null); }

    public T dequeue(){
        T item = null;
        if(!empty()){
           item = front.getData();
           front = front.getNext();
        }
        return item;

    }
}
