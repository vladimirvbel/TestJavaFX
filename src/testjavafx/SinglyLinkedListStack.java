package testjavafx;

/**
 * ITESS - TICS AGOSTO - SEPTEMBER 2024 EyOD Prof: Montecillo
 *
 * @author Daniel Salas Flores Description: 2 - Septiembre - 2024
 
 */
public class SinglyLinkedListStack<E> {

    private static class node<E> {

        private E element;
        private node<E> next;

        public node(E element, node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public node<E> getNext() {
            return next;
        }

        public void setNext(node<E> next) {
            this.next = next;
        }

    }
    private node<E> head;
    private node<E> tail;
    private int size;

    public SinglyLinkedListStack() {

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        }
        return head.element;
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }
        return tail.element;
    }

//    public void addFirst(E e) {
//        node<E> newest = new node<E>(e, null);
//        newest.next = head;
//        head = newest;
//        if (size == 0) {
//            tail = head;
//        }
//        size = size + 1;
//    }
    
    public void push(E e) {
        node<E> newest = new node<E>(e, null);
        newest.next = head;
        head = newest;
        if (size == 0) {
            tail = head;
        }
        size = size + 1;
    }
    
    public E top(){
        if(isEmpty()) return null;
        //E answer = head.element;
        return head.element;
    }
            
            
            
            
            
            
            
            
            
            
            
            

//    public void addFirstOp(E e) {  //Version optimizada
//        node<E> newest = new node<E>(e, head);
//        if (size == 0) {
//            tail = head;
//        }
//        size++;
//    }

//    public void addLast(E e) {
//        node<E> newest = new node<E>(e, null);
//        if (isEmpty()) {
//            head = newest;
//        } else {
//            tail.setNext(newest);
//        }
//        tail = newest;
//        size++;
//    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E answer = head.getElement();
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
        return answer;
    }
}
