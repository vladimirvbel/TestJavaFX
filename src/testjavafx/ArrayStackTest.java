package testjavafx;

/**
 *
 * @author danie
 */
public class ArrayStackTest {

    public static void main(String[] args) {
        SinglyLinkedListStack<Integer> S = new SinglyLinkedListStack();
        //Stack<Integer> S = new ArrayStack<>();
        S.push(5);
        // contents: (5)
        S.push(3);
        System.out.println(S.size());
        System.out.println(S.pop());
        System.out.println(S.isEmpty());
        System.out.println(S.pop());
        System.out.println(S.isEmpty());
        System.out.println(S.pop());
        S.push(7);
        S.push(9);
        System.out.println(S.top());
        S.push(4);
        System.out.println(S.size());
        System.out.println(S.pop());
        S.push(6);
        S.push(8);
        System.out.println(S.pop());

    }
}
