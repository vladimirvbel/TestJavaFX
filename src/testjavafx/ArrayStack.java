
package testjavafx;

/**
 *
 * @author danie
 */

//public interface Stack<E>{
//int size();
//
//boolean isEmpty();
//void push(E e);
//
// E top();
//
// E pop();
//}
//public class Stack  {
//    public static void main(String[] args) {
//        ArrayStack pipipi = new ArrayStack();
//    }
//}
public class ArrayStack<E> implements Stack<E> {
    public static final int CAPACITY = 1000;
    private E[] data;
    private int t= -1;

    public ArrayStack() {
        this(CAPACITY);
    }
    
    public ArrayStack(int capacity){
        data = (E[]) new Object [capacity];
    }
    
    public int size(){
        return t+1;
    };
    
    public boolean isEmpty(){
        return( t==-1);
    }
    
    public void push (E e) throws IllegalStateException{
        if (size() ==data.length) throw new IllegalStateException("Stack is full");
        
        data[++t] = e;
    }
    
    
    
    public E top(){  //Muestra el dato que este en la posicion top sin quitarlo
        if(isEmpty()) return null;
        return data[t];
    }
    
    public E pop(){       //Elimina el dato que este en la posicion top
        if(isEmpty()) return null;
        E answer =  data[t];
        data[t] = null;
        t --;
        return answer;
    }
}