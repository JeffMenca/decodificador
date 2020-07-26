//Paquete del programa
package decodificadorbiologia;
//Import de librerias utiles

import java.util.Scanner;

/**
 *
 * @author JeffMenca
 *
 */
public class DecodificadorBiologia {

    //Variables estaticas
    static Scanner teclado = new Scanner(System.in);
    static String secuencia1, secuencia2, resultadofinal = "", resultadopendiente="";
    static int contadorcoincidencias = 0, contadorcoincidencias2 = 0;

    //Metodo Main
    public static void main(String[] args) {
        System.out.println("Decodificador de ADN");
        System.out.println("Ingrese la primera secuencia de ADN");
        secuencia1 = teclado.nextLine();
        System.out.println("Ingrese la segunda secuencia de ADN");
        secuencia2 = teclado.nextLine();
        char array1[] = secuencia1.toCharArray();
        char array2[] = secuencia2.toCharArray();
        while (contadorcoincidencias2 < array1.length) {
            //Reinicio de resultado y contadores
            contadorcoincidencias = 0;
            resultadopendiente = "";
            //Inicio de ciclos
            for (int i = contadorcoincidencias2; i < array1.length; i++) {
                for (int j = contadorcoincidencias; j < array2.length; j++) {
                    //Comparacion si encuentra alguna coincidencia
                    if (array1[i] == array2[j]) {
                        resultadopendiente = resultadopendiente + String.valueOf(array1[i]);
                        contadorcoincidencias = j + 1;
                        break;
                    } else { //Comparacion si no encuentra ninguna coincidencia

                        if (resultadopendiente.length() > resultadofinal.length()) {
                            resultadofinal = resultadopendiente;
                        }
                        //Reinicio de resultado y contadores
                        resultadopendiente = "";
                        contadorcoincidencias = 0;
                    }
                }
            }
            //Comparacion para obtener el resultado mayor
            contadorcoincidencias2++;
            if (resultadopendiente.length() > resultadofinal.length()) {
                resultadofinal = resultadopendiente;
            }
        }
        limpiar();
        //Resultado
        System.out.println("El conjunto ordenado de bases adyacentes de mayor tamaño entre los ADNS es " + "'" + resultadofinal + "'");
    }

    //Metodo para limpiar pantalla
    public static void limpiar() {
        //Caracteres por imprimir
        System.out.print("\033[H\033[2J");
        //Metodo flush para imprimir los caracteres en pantalla
        System.out.flush();
    }
}
