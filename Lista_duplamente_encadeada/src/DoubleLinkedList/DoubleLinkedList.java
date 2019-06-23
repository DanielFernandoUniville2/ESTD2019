package DoubleLinkedList;


/**
 *
 * @author Daniel
 */
public class DoubleLinkedList<T> implements DoubleLinkedListInterface<T>{
    
    private DoubleNode<T> head;
    private DoubleNode<T> tail;
    private int size;
    
    public DoubleLinkedList(){
        this.head = new DoubleNode<>();
        this.tail = new DoubleNode<>();
        this.head.setNext(this.tail);
        this.tail.setPrevious(this.head);
        this.size = 0;
    }

    /*
        Complexity: O(1)
    */
    @Override
    public boolean isEmpty() {
        return this.head.isNil();
    }

    /*
        Complexity: O(1)
    */
    @Override
    public int size() {
        return this.size;
    }
    /*
        Complexity: O(n)
    */
    @Override
    public boolean contains(T value) {
        if(value != null){
            DoubleNode<T> aux = this.head;
            while(!aux.isNil()){
                if(aux.getData().equals(value)){
                    return true;
                }
                
                aux = aux.getNext();
            }   
            
                return false;
        }else{
                return false;
        }
    }
    /*
        Complexity: O(1)
    */
    @Override
    public void addFirst(T value) {
        if(value != null){
            if(this.isEmpty()){
                DoubleNode<T> newHead = new DoubleNode<T>(value, new DoubleNode<T>(), new DoubleNode<T>());
                this.head = newHead;
                this.tail = newHead;
            }else{
                DoubleNode<T> newHead = new DoubleNode<T>(value, new DoubleNode<T>(), this.head);
                this.head.setPrevious(newHead);
                this.head = newHead;
            }
                this.size++;
        }
    }
    
    /*
        Complexity: O(1)
    */
    @Override
    public void addLast(T value) {
        if(value != null){
            if(this.isEmpty()){
                this.addFirst(value);
            }else{
                DoubleNode<T> node = new DoubleNode<T>(value, this.tail, new DoubleNode<T>());
                this.tail.setNext(node);
                this.tail = node;
                this.size++;
            }
        }
    }
    /*
        Complexity: O(1)
    */
    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    /*
        Complexity: O(1)
    */
    @Override
    public T getFirst() {
        if(this.head.isNil()){
            return null;
        }else{
            return this.head.getData();
        }
    }
    
    /*
        Complexity: O(1)
    */
    @Override
    public T getLast() {
        if(this.tail.isNil()){
            return null;
        }else{
            return this.tail.getData();
        }
    }
    
    /*
        Complexity: O(1)
    */
    
    @Override
    public T removeFirst() {
        if(this.isEmpty()){
            return null;
        }else{
            T aux;
            this.head.getNext().setPrevious(new DoubleNode<T>());
            if(this.size() == 1){
                this.tail = this.head.getNext();
            }
            aux = this.head.getData();
            this.head = this.head.getNext();
            this.size--;
            return aux;
        }
    }
    
    /*
        Complexity: O(1)
    */
    @Override
    public T removeLast() {
        if(!this.isEmpty()){
            this.tail.getPrevious().setNext(new DoubleNode<T>());
            if(this.size() == 1){
                this.head = this.tail.getPrevious();
            }
                T aux = this.tail.getData();
                this.tail = this.tail.getPrevious();
                this.size--;
                return aux;
                
        }
                return null;
    }
    
    /*
        Complexity: O(n)
    */
    @Override
    public T[] toArray() {
        T[] result = (T[]) new Object[this.size()];
        if(!this.isEmpty()){
            DoubleNode<T> aux = this.head;
            int index = 0;
            while(!aux.isNil()){
                result[index++] = aux.getData();
                aux = aux.getNext();
            }
                return result;
        }
                return null;
    }
    /*
        Complexity: O(n)
    */
    @Override
    public T get(int index) {
        if(index == 0){
            return this.head.getData();
        }else{
            int pos = 0;
            DoubleNode<T> aux = this.head;
            while(pos < index){
                aux = aux.getNext();
                pos++;
            }
                return aux.getData();
        }
    }
    /*
        Complexity: O(n)
    */
    @Override
    public T remove(int index) {
        if(!this.isEmpty() && index >= 0 && index < this.size()){
            if(index == 0){
                T aux = this.head.getData();
                this.removeFirst();
                return aux;
            }else{
                DoubleNode<T> aux = this.head;
                int count = 0;
                while(count < index){
                    aux = aux.getNext();
                    count++;
                }
                T auxT = aux.getData();
                aux.getPrevious().setNext(aux.getNext());
                aux.getNext().setPrevious(aux.getPrevious());
                if(aux.getNext().isNil()){
                    this.tail = aux;
                }
                this.size--;
                return auxT;
            }
        }else{
            return null;
        }
    }
    
    /*
        Complexity: O(n)
    */
    @Override
    public void add(int index, T value) {
        if(!this.isEmpty() && index >= 0 && index <= this.size()){
            if(index == 0){
                addFirst(value);
            }else if(index == this.size()){
                    addLast(value);
            }else{
                int count = 0;
                DoubleNode<T> aux = this.head;
                while(count+1 < index){
                    aux = aux.getNext();
                    count++;
                }
                    DoubleNode<T> newNode = new DoubleNode<T>();
                    newNode.setNext(aux.getNext());
                    newNode.setPrevious(aux);
                    newNode.setData(value);
                    aux.setNext(newNode);
                    this.size++;
            }
            
        }
    }
    
    /*
        Complexity: O(n)
    */
    @Override
    public void set(int index, T value) {
        if(index >= 0 && index < this.size() && !this.isEmpty()){
            DoubleNode<T> aux = this.head;
            int count = 0;
            while(count < index){
                count++;
                aux = aux.getNext();
            }
                aux.setData(value);
        }
    }
    
    
    
    

}
