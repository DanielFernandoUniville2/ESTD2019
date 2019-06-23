/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleLinkedList;

/**
 *
 * @author Daniel
 */
class DoubleNode<T> {
    private DoubleNode<T> next;
    private DoubleNode<T> previous;
    private T value;
    
    public DoubleNode(){
        
    }
    
    public DoubleNode(T value, DoubleNode<T> previous, DoubleNode<T> next){
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
    
    public boolean isNil(){
        return this.value == null;
    }
    
    public T getData(){
        return this.value;
    }
    
    public DoubleNode<T> getNext(){
        return this.next;
    }
    
    public DoubleNode<T> getPrevious(){
        return this.previous;
    }
    
    public void setData(T element){
        this.value = element;
    }
    
    public void setNext(DoubleNode<T> next){
        this.next = next;
    }
    
    public void setPrevious(DoubleNode<T> previous){
        this.previous = previous;
    }
    
}
