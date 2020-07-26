package decodificadorbiologia;

import java.util.Scanner;

/**
 *
 * @author JeffMenca
 *
 */
public class DecodificadorBiologia {

    static Scanner teclado = new Scanner(System.in);
    static String secuencia1, secuencia2, resultadofinal = "";
    static StringBuffer respuesta = new StringBuffer();
    static int contadorcoincidencias = 0, tamanio = 0, contadorcoincidencias2 = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Decodificador de ADN");
        System.out.println("Ingrese la primera secuencia de ADN");
        secuencia1 = teclado.nextLine();
        System.out.println("Ingrese la segunda secuencia de ADN");
        secuencia2 = teclado.nextLine();
        char array1[] = secuencia1.toCharArray();
        char array2[] = secuencia2.toCharArray();
        while (contadorcoincidencias2 < array1.length) {
            contadorcoincidencias = 0;
            respuesta.delete(0, respuesta.length());
            for (int i = contadorcoincidencias2; i < array1.length; i++) {
                for (int j = contadorcoincidencias; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        respuesta = respuesta.append(array1[i]);
                        contadorcoincidencias = j + 1;
                        break;
                    } else {

                        if (respuesta.length() > resultadofinal.length()) {
                            resultadofinal = respuesta.toString();
                        }
                        respuesta.delete(0, respuesta.length());
                        contadorcoincidencias = 0;
                    }
                }
            }
            contadorcoincidencias2++;
            if (respuesta.length() > resultadofinal.length()) {
                resultadofinal = respuesta.toString();
            }
        }
        System.out.println("La respuesta es " + resultadofinal);
    }
}
