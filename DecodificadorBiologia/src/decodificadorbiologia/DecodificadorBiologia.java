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
    public static String secuencia1, secuencia2, resultadofinal = "", resultadopendiente="";
    static int contadorcoincidencias = 0, contadorcoincidencias2 = 0;

    //Metodo Main
    public static void main(String[] args) {
        InterfazGrafica interfaz=new InterfazGrafica();
        interfaz.setLocationRelativeTo(null);
        interfaz.setVisible(true);
  
    }
    public static void generarrespuesta() {
        resultadofinal = "";
        resultadopendiente="";
        contadorcoincidencias = 0;
        contadorcoincidencias2 = 0;
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
         if (resultadopendiente.length() > resultadofinal.length()) {
                resultadofinal = resultadopendiente;
            }
    }
}
