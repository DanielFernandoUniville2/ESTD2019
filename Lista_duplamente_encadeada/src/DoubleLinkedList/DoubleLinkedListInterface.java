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
public interface DoubleLinkedListInterface<T>{
    
    /*
        complexity O(1)
    */
    public boolean isEmpty();
    
    
    
    /*
        complexity O(1)
    */
    public int size();
    
    
    
    
    /*
        complexity O(1)
    */
    public void addFirst(T value);
    
    
    
    /*
        complexity O(1)
    */
    public void addLast(T value);
    
    
    /*
        complexity O(1)
    */
    public void clear();
    
    
    
    /*
        complexity O(1)
    */
    public T getFirst();
    
    
    
    /*
        complexity O(1)
    */
    public T getLast();
    
    
    
    /*
        complexity O(1)
    */
    public T removeFirst();
    
    
    
    /*
        complexity O(1)
    */
    public T removeLast();
    
    
    
    
    /*
        complexity O(n)
    */
    public T[] toArray();
    
    
    
    /*
        complexity O(n)
    */
    public T get(int index);
    
    
    
    /*
        complexity O(n)
    */
    public T remove(int index);
    
    
    
    /*
        complexity O(n)
    */
    public void add(int index, T value);
    
    
    
    /*
        complexity O(n)
    */
    public void set(int index, T value);
    
    /*
        complexity O(n)
    */
    public boolean contains(T value);
    
}
