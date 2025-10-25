// Clase ListDE (Lista Doblemente Enlazada)
public class ListDE<E> {

    //Atributos
    private NodeDE<E> header, tail;
    private int size;

    // Constructor
    public ListDE() {
        this.header = null;
        this.tail = null;
        this.size = 0;
    }

    // Getters
    public NodeDE<E> getTail() {return tail; }
    public NodeDE<E> getHeader() {return header;}
    public int getSize() {return size; }


    // Métod0 para añadir un nodo despues de un Nodo de la lista
    public void add(NodeDE<E> p, NodeDE<E> nuevo) {

        // Caso 1: Lista vacía
        if (header == null  && tail == null) {
            header = nuevo;
            tail = nuevo;
        }
        // Caso 2: Añadir después del tail (p es el tail)
        else if (p == tail) {
            nuevo.setPrevious(p);
            p.setNext(nuevo);
            tail = nuevo; // Definimos el nuevo tail
        }
        // Caso 3: El caso Normal
        else {
            NodeDE<E> q = p.getNext(); // El nodo que va después de p

            // Conexiones del nuevo nodo
            nuevo.setNext(q);
            nuevo.setPrevious(p);

            // Cambiar conexciones de los nodos antes y despues
            p.setNext(nuevo);
            q.setPrevious(nuevo);
        }
        size++; // Incrementar el tamaño
    }


    // ---Métod0 toString-----
    @Override
    public String toString(){
        String s=""; //Variable local para almacenar

        for(NodeDE <E> i=header; i!=null; i=i.getNext() ) {
            s= s+" - "+ i.getData();
        }
        return s;
    }

    // --- NUEVO METODO DEL TEMA 1 ---


}