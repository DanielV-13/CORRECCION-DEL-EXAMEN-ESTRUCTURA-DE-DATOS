//--------EJEMPLO DE MAIN TEMA 1--------
public class Main {
    public static void main(String[] args) {
        ListDE<Integer> lista= new ListDE<>();
        lista.add(lista.getTail(),new NodeDE<Integer>(1));
        lista.add(lista.getTail(),new NodeDE<Integer>(3));
        lista.add(lista.getTail(),new NodeDE<Integer>(5));
        lista.add(lista.getTail(),new NodeDE<Integer>(9));
        lista.add(lista.getTail(),new NodeDE<Integer>(2));
        lista.add(lista.getTail(),new NodeDE<Integer>(34));
        lista.add(lista.getTail(),new NodeDE<Integer>(2));
        lista.add(lista.getTail(),new NodeDE<Integer>(19));
        lista.add(lista.getTail(),new NodeDE<Integer>(23));
        lista.add(lista.getTail(),new NodeDE<Integer>(8));
        lista.add(lista.getTail(),new NodeDE<Integer>(4));


        //Comparator que se va a usar
        Comparador<Integer> c = new Comparador<>();

        //------METODO QUE RESUELVE EL TEMA 1-----
        System.out.println(lista.UnionEsp(5,23,3,c)) ;

    }
}