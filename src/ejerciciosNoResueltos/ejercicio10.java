
package repasoejer;
import java.util.Random;
/* porque creo aqui arriba el random y no en otra parte?

 */

public class ejercicio10 {



        public static void main(String[] args) {
            Random random = new Random();

            // Genera un número entero entre 1 y 100
            int numero = random.nextInt(100) + 1;

            System.out.println("Número aleatorio: " + numero);
        }
    }

