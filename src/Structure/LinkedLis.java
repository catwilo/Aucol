/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structure;

/**
 *
 * @author causugamo
 */
public class LinkedLis<T> {

    private ChainNode head;
    private ChainNode tail;

    public LinkedLis() {
        this.head = null;
        this.tail = null;
    }

    public void PushFront(T key) {
        ChainNode node = new ChainNode(key, this.head);
        this.head = node;
        if (this.tail == null) {
            this.tail = this.head;
        }

    }

    /*
    public void Printlist() {
        if (this.head == null) {
            System.out.println("ERROR: empty list");
            return;
        }
        ChainNode p = this.head;
        while (p != null) {
            System.out.println(p.getData());
            p = p.getNext();
        }
    }
     */
    public void PopFront() {
        if (this.head == null) {
            System.out.println("ERROR: empty list");
        }
        this.head = head.getNext();
        if (this.head == null) {
            this.tail = null;
        }
    }
}
