package estructurascontrol;

public class Operadores {
/* &&(and) operadortodo verdadero
|| or nos permite determinar si alguna cosa es verdadera
tambien está la negacion ! nos cambia el valor de algo
== es de comparacion o equals
!= no es igual, not equals
< menor, > mayor, <= >=

ejercicio de un simulador de un prestamo
si el salario anual del usuario es mayor a 100.000 -> le damos el préstamo
si el salario anual del usuario es mayor a 50.000 y su edad
es menor que 30 años -> le damos la mitad
else if, cuando hay mas de 2 resultados posibles para una decision
hay una convencion, es que cuando se declara una variable lleva
en el nombre is o are
salarioAnual > 100.000 le damos la hipoteca

sino la mitad,

declarar variable hipoteca??

 */


    public static void main(String[] args) {

       double salario = 15.000;
       int edad = 35;
       boolean isVip = false;
       boolean hasDebts = false;

               if (salario >= 100.000 || isVip) {
                   System.out.println("le damos la hipoteca completa");
               } else if (salario >= 50.000 && edad < 30) {
                   System.out.println(" le damos la mitad de la hipoteca");
               } else if (salario >= 30.000 && edad < 40) {
                   System.out.println("te damos un tercio");
               }else if (!hasDebts) {
                   System.out.println("le damos el minimo");
               } else {
                   System.out.println("no te damos el prestamo");
               }

    }

}
