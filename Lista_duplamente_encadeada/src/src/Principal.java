/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import DoubleLinkedList.DoubleLinkedList;

/**
 *
 * @author Daniel
 */
public class Principal {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoubleLinkedList<Integer> lista = new DoubleLinkedList<Integer>();
        
        lista.addFirst(10);
        
        
        lista.add(1, 20);
        lista.add(2, 30);
        
        
        lista.addLast(50);
        lista.addLast(40);
        
        lista.add(3, 60);
        
        print(lista.toArray());
        lista.set(2, 300);
        print(lista.toArray());
        lista.remove(2);
        print(lista.toArray());
        lista.set(2, 300);
        print(lista.toArray());
        lista.set(1, 200);
        print(lista.toArray());
        
        
        lista.removeFirst();
        lista.removeLast();
        
        
        print(lista.toArray());
    
        System.out.println(lista.contains(20));
        System.out.println(lista.contains(50));
        
        lista.addFirst(10);
        lista.addLast(100);
        
        print(lista.toArray());
        lista.add(1, 500);
        print(lista.toArray());
        lista.add(2, 1000);
        
        print(lista.toArray());
        lista.remove(2);
        
        print(lista.toArray());
        System.out.println(lista.get(1));
        System.out.println(lista.get(0));
        System.out.println(lista.get(5));  

    }
    
    public static void print(Object[] w){
        Object[] arr = w;
        Integer[] aux = new Integer[arr.length];
        for(int i=0; i<arr.length; i++)
            aux[i] = (Integer) arr[i];
        System.out.println("---------------");

        for(int i=0; i<arr.length; i++)
            System.out.println(aux[i]);
        
        System.out.println("---------------");
    }
    
}
