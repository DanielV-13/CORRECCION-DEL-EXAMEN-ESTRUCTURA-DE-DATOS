//----------LOGICA DEL COMPARATOR----------
//retorna 0 si los datos son iguales
//retorna 1 si los datos son diferentes

//------DESCRIPCION DE LA CLASE-----
// Es genérica <E> y usa .equals().
// Sirve para String, Integer, Double,para cualquier objeto

import java.util.*;

// Clase que implementa la interfaz Comparator
public class Comparador <E> implements Comparator<E> {

    @Override
    public int compare(E valor1, E valor2) {

        if (valor1.equals(valor2)) {
            return 0; //  0 si  son iguales
        } else {
            return 1; //  1 si  son diferentes
        }
    }
}
