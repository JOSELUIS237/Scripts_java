/*Uso del operador || (OR),

"El portero digital"

Escribe un programa en java que determine si una persona puede entrar
al club, las reglas:

1.-Debe de tener mas de 18 años.
2.-Debe de estar en la lista de invitados VIP

si cumple cualquiera debe de imprimir "Bienvenido a la fiesta"
en caso de no cumplir alguno, imprimir "Lo siento, no puedes pasar".
*/

public class Operador_Or{
    public static void main(String[] args) {

        var Edad = 15;
        var EsVIP = true;

        //Escribir la condicion
        if (Edad >= 18 || EsVIP){
            System.out.println("Bienvenido a la fiesta");
        } else {
            System.out.println("Lo siento, no puedes pasar");
        }

    }

}
