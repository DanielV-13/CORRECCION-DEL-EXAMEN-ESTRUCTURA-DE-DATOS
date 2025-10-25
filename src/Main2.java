public class Main2 {
    public static String decodificar(String cadena){
        int indicador=0;
        Pila<Character> P= new Pila<>();
        String respuesta="";

        for(int i=0; i< cadena.length(); i++){
            while(! (cadena.charAt(i).equals("]")) ){
                indicador=i;

                P.push(cadena.charAt(i));

                while(P.size()>1){
                    respuesta= respuesta+P.pop();

                    for (int j=1; j<P.peek();j++){
                        respuesta=respuesta+respuesta;
                    }
                }

            }
        }
        return respuesta;

    }

    public static void main(String[] args) {


    }
}