import java.util.Comparator;

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
    // --- RESOLUCION DEL TEMA 1---
    public ListDE<E> UnionEsp (E val1, E val2, int n, Comparator<E> c){

        //Generar la primera sublista
        ListDE<E> lista1= new ListDE<>();

        //For para recorrer la instancia actual (this)
        for(NodeDE<E> i=this.getHeader(); i!=null; i = i.getNext()){
            if(c.compare(i.getData(),val1) ==0){
                NodeDE<E> añadir= new NodeDE<> (i.getData());
                lista1.add(lista1.getHeader(),añadir);

                for(int j=1; j<n; j++){
                    i= i.getNext();
                    NodeDE<E> añadir2= new NodeDE<>(i.getData());
                    lista1.add(lista1.getTail(),añadir2);
                }
            }
        }
        //Generar la segunda Sublista
        ListDE<E> lista2= new ListDE<>();

        //For para recorrer la instancia actual (this)
        for(NodeDE<E> i=this.getHeader(); i!=null; i = i.getNext()){
            if(c.compare(i.getData(),val2) ==0){
                NodeDE<E> añadir= new NodeDE<> (i.getData());
                lista2.add(lista2.getHeader(),añadir);

                for(int j=1; j<n; j++){
                    i= i.getNext();
                    NodeDE<E> añadir2= new NodeDE<>(i.getData());
                    lista2.add(lista2.getTail(),añadir2);
                }
            }
        }

        //-----Unir las 2 sublistas-- en lista 1-----

        //Recorremos la sublista2
        for(NodeDE<E> j=lista2.getHeader(); j !=null; j=j.getNext()){
            NodeDE<E> union= new NodeDE<>(j.getData());
            lista1.add(lista1.getTail(), union);
        }

        return lista1;  //  RETORNO DEL METODO
    }

}