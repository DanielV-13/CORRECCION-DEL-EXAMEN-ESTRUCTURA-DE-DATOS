import java.util.ArrayDeque;
import java.util.Deque;

public class Pila<T> {
    private Deque<T> elementos;

    //---CONSTRUCTOR---
    public Pila() {
        elementos = new ArrayDeque<>();
    }

    public void push(T elemento) {
        elementos.push(elemento);
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacía");
        }
        return elementos.pop();
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacía");
        }
        return elementos.peek();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public int size() {
        return elementos.size();
    }

}

