//----------RESOLUCION DEL TEMA 3- JOSEPHUS -----------
import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class Main3 {

    //Parametros : La cola, int pasos que avanza, int pasos que retrocede
    //Retorno: Una LinkedList de los asesinados
    public static LinkedList<Integer> Josephus(Deque<Integer> cola, int avanza, int retroc) {

        // 1) Crear la lista que almacenará a los soldados eliminados.
        LinkedList<Integer> eliminados = new LinkedList<>();

        // 2) Crear una variable 'bandera' para saber qué turno toca.
        boolean esTurnoHorario = true;   //Empieza yendo en sentido horario

        // 3) Iniciar el bucle principal del juego.
      //Tiene que haber mas de una persona en la cola
        //Si solo hay 1 persona, ese es el sobreviviente y se detiene el bucle
        while (cola.size() > 1) {

            // 4) Comprobar qué turno es.
            if (esTurnoHorario) {
                //AVANZA

                // ('avanza - 1' personas) del frente hacia el final.
                for (int i = 0; i < avanza - 1; i++) {
                    //Sacamos personas del inicio ---- (pollFirst)
                    //las que sacamos las ponemos al final de la cola ----- (offerLast)
                    cola.offerLast(cola.pollFirst());
                }
                // Después de mover a las personas, el soldado en la posicion (avanza) es asesinado
                // Lo sacamos de la cola (pollFirst) y lo añadimos a la lista de eliminados.
                eliminados.add(cola.pollFirst());

            } else if(esTurnoHorario==false) {
                // --- TURNO ANTIHORARIO (RETROCEDE) ---


                // ('retroc - 1' personas) del final hacia el frente.
                for (int i = 0; i < retroc - 1; i++) {
                    //Sacamos personas del final ---- (pollLast)
                    //las que sacamos las ponemos al inicio de la cola --- (offerFirst)
                    cola.offerFirst(cola.pollLast());
                }

                // Después de mover a las personas, el soldado en la posicion (retroc) es asesinado
                // Lo sacamos de la cola (pollLast) y lo añadimos a la lista de eliminados.
                eliminados.add(cola.pollLast());
            }

            //----------CAMBIAR EL VALOR DE LA VARIABLE BANDERA-------------
           //tRUE = FALSE ------- FALSE = True
            esTurnoHorario = !esTurnoHorario;

        } // Fin del bucle while --- Significa que solo queda 1 sobreviviente

        // RETORNO DEL METODO --- LA LISTA DE ELIMINADOS
        return eliminados;
    }

    //-------------------MAIN------------------------------
    public static void main(String[] args) {

        //Crear la cola
        Deque<Integer> circulo = new ArrayDeque<>();

        //Añado a los 10 soldados
        for(int i=1; i<11;i++) {
            circulo.offerLast(i);

        }

            // Definimos los saltos del ejemplo
            int avanza = 3;
            int retroc = 4;

            System.out.println("Cola inicial ");
            System.out.println(circulo);

            // Llamamos al métod0
            System.out.println(Josephus(circulo, avanza, retroc));

        }
    }


