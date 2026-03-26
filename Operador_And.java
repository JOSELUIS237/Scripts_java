/*Ejemplo de un pase a montaña rusa usando el operador &&,
la condicion es: para que una persona pueda entrar a la montaña
debe de tener minimo 12 años de edad, debe de medir igual o mas
de 1.50 de estatura y su pase debe de ser VIP */

public class Operador_And {
    public static void main(String[] args) {
//Datos de la persona
        var edad = 14;
        var estatura = 1.65;
        var tienePaseVip = true;

//Condicion
        if (edad >= 12 && estatura >= 1.50 && tienePaseVip == true) {
            System.out.println("¡Bienvenido a la Montaña Rusa X-TREME!");
        } else {
            System.out.println("Lo siento, no cumples con los requisitos.");
        }
