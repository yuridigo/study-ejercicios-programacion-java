import java.util.Scanner;

public class Main {

    /*
      las estructuras repetitivas sirven para repetir un trozo de codigo
      imprimir algo 5 veces: habrá una funcion que se dedica a enviar a imprimir
      esa función depende del programa estará dentro de un bucle, que puede que:
      mande 5 copias o una copia y un parametro para que repita

      la variable que se declara dentro de una funcion solo se puede llamar ahí,
      vive dentro de esa funcion
      i++ incrementa en 1, es como si haces i + 1
      i--

      for anidados:
       */
            public static void main(String[] args) {

                Scanner sc =  new Scanner(System.in);
                int nI, nF;


                System.out.println("--Programa pares entre números--");
                System.out.println("Entroduce número inical: ");
                nI = sc.nextInt();
                System.out.println("Entroduce número final: ");
                nF = sc.nextInt();

                calcularParesEntreNumeros(nI, nF);



            }

            public static void contarConFor(){

                System.out.println("\n\tContando del 1 al 10");



                for ( int i = 10; i >= 1; i--  ){
                    System.out.print(i + " ");
                }
                System.out.println();
                System.out.println("\n\tPares del 1 al 100:");
                for ( int i = 0; i <=100; i += 2 ){
                    System.out.print(i + " ");
                }
                System.out.println("\n\tPares del 1 al 100:");
                for ( int i = 0; i <=100; i++ ){
                    if(i % 2 == 0) {
                        System.out.print("Par: " + i + " ");
                    } else {
                        System.out.print("Impar: " + i + " ");
                    }
                }
            }

            public static void calcularParesEntreNumeros( int inicio, int finnal ){

                if (inicio < finnal){
                    for ( int i = inicio ; i <= finnal; i++   ){
                        if ( i % 2 == 0){
                            System.out.print(i + " ");
                        }
                    }

                } else {
                    System.out.println("El número inicial no puede ser mayor o igual que el último");
                }

            }

        }
