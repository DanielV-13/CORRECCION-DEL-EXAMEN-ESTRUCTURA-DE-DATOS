// Clase NodeDE (Nodo Doblemente Enlazado) - TDA GENERICO

public class NodeDE<E> {

    //Atributos
    private E data;
    private NodeDE<E> previous;
    private NodeDE<E> next;

    // Constructor
    public NodeDE(E data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    // Getters y Setters
    public E getData() {return data; }
    public void setData(E data) {this.data = data; }

    public NodeDE<E> getNext() {return next; }
    public void setNext(NodeDE<E> next) {this.next = next;}

    public NodeDE<E> getPrevious() { return previous; }
    public void setPrevious(NodeDE<E> previous) {this.previous = previous; }

}