import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;

public class Recuperativa {
    public static void main(String[] args) {
        /*Ejercicio 1
         * Don José todos los martes y jueves realiza un 20% de descuento en el total de las
        compras, crea una función la cual debe recibir un parámetro del día y el arreglo de
        valores de los productos a comprar, esta debe retornar el total final de la compra según
        corresponda o no descuento.
         */


        Console console = System.console();
        System.out.println("*****Bienvenido/a*****");
        String dia = (console.readLine("ingrese el dia de hoy: "));
        String compra = (console.readLine("ingrese el valor de su compra: "));

        //esta parte de los string fue lo que alcance a intentar, ya que no recuerdo como hacer que el usuario vaya dando los datos y que el arreglo de valores de productos se vaya armando
        String [] compras = new String[3];
        compras[0]="producto1";
        compras[1]="producto2";
        compras[2]="producto3";

// aqui trate de hacer la interfaz del cajero para que saque los descuentos segun el dia con bucles, pero me da ese error en la operacion aritmetica que no tengo idea como fixear
            if (dia == "martes"){
            System.out.println("Su comisión es de: " + (compra * 0.2) + ", correspondiente al 20% del total de su compra");

            }else if (dia == "jueves"){
                System.out.println("Su comisión es de: " + (compra * 0.2) + ", correspondiente al 20% del total de su compra");

            }else{
                System.out.println("No hay descuento hoy :D");
            }
    }
}

//observaciones: el hecho de ver errores, me consume mucho tiempo el querer arreglarlos y me olvido de seguir la logica de la situacion. debido a eso solo alcance a plantear el primer ejercicio...
//autorecomendaciones: seguir y seguir codificando para soltar las manitas y la mente, seguir aprendiendo y no rendirme.
