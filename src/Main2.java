//-------Resolucion del TEMA 2: Decodifica una cadena usando una Pila--------

public class Main2 {
    /// Parametro del metodo : La cadena codificada
    public static String decodificar(String cadena) {
        Pila<Character> P = new Pila<>();

        // Recorremos cada caracter de la cadena de entrada
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            // Si el caracter NO es ']', simplemente lo pusheamos a la Pila
            if (c != ']') {
                P.push(c);
            } else {   // Cuando se encuentra un ']'

                // 1) Construir la subcadena
                String subcadena = "";
                // Sacamos caracteres de la pila hasta encontrar el '['
                while (P.peek() != '[') {
                    //Ir armando la subcadena
                    subcadena = P.pop() + subcadena;
                }

                // 2) Ignorar el '['
                P.pop(); // Saca el '[' de la pila

                // 3) Obtener el número de repeticiones de la subcadena
                //Se asume que es UN SOLO DIGITO

                char numChar = P.pop(); // Saca el numero
                int n = Character.getNumericValue(numChar);  //Transformar el numero de CHAR a ENTERO(int)

                // 4) Volver a apilar la subcadena 'n' veces
                for (int j = 0; j < n; j++) { //Determina cuantas veces vamos a repetir el SUBSTRING
                    for (int k = 0; k < subcadena.length(); k++) {
                        P.push(subcadena.charAt(k));  //Pusheamos todos los caracteres del SUBSTRING
                    }
                }
            }   //SALE DEL ELSE
            //Regresa al inicio del FOR, para continuar analizando la cadena

        } //Sale del FOR

        // 5) Construir la cadena final
        String resultado = "";
        while (!P.isEmpty()) {  //Vamos sacando todos los elementos guardados dentro de la PILA
            resultado = P.pop() + resultado;
        }

        return resultado;
    }


    //--------------------------------------------------------------
    // --- Main para probar la solución ---
    public static void main(String[] args) {

        // Prueba con el ejemplo del examen
        String codificada1 = "2[ba]3[na]";
        String decodificada1 = decodificar(codificada1);
        System.out.println("Prueba 1: " + codificada1);
        System.out.println("Resultado 1: " + decodificada1); // Debería ser "babananana"

        System.out.println("----------");
    }
}

