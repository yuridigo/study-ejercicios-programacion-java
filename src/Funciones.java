package estructurascontrol;

public class Funciones {
    /* son muy utiles para evitar la duplicidad de tareas.
    la logica se mete dentro de una funcion y asi se puede usar de nuevo.
    semantica: solo con el nombre y las operaciones sé lo que hay.
     existen 3 tipos de funciones segun el valor
     del modificador de acceso, puede tener 3 valores: public, private, protected
    private: solo dentro de la funcion. no queremos que se use fuera
    public:usar en cualquier otra clase de la aplicaición
    protected: la funcion se usa solo dentro del paquete
por defecto una funcion es protected.
diferencias:
public: el mundo puede usarlo
protected: solo herencia o mismo paquete
void: la funcion no devuelve nada.
     */

    public static void main(String[] args) {

        String nombrePersona = "Yuri";
        int edadPersona = 37;


        datosPersona(nombrePersona, edadPersona);
    }

        public static void datosPersona (String nombrePersona, int edadPersona) {

            System.out.println("hola me llamo "
                    + nombrePersona
                    + " y tengo "
                    + edadPersona);
        }

    }








