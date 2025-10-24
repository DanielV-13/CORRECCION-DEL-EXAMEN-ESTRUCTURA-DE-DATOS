public class NodeDE <E>{
    //Atributos
    private E data;
    private NodeDE previous;
    private NodeDE next;

    //Constructor
    public NodeDE(E data){
        this.data =data;
        this.next= null;
        this.previous=null;
    }

    //Metodos
    public E getData(){ return this.data;}
    public void setData(E data){this.data = data;}

    //Para recuperar y setear nodo de despues (next)
    public NodeDE getNext(){ return this.next;}
    public void setNext(NodeDE next){this.next=next;}

    public NodeDE getPrevious(){ return this.previous;}
    public void setPrevious(NodeDE next){this.previous=previous;}

}













}
