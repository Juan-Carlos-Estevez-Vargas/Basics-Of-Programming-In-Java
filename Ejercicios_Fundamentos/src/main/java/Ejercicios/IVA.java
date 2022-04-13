package Ejercicios;


import java.util.Scanner;

/*
    Lee un número por teclado que pida el precio de un producto (puede tener decimales)
    y calcule el precio final con IVA. El IVA será una constante que será del 21%
 */
public class IVA {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int IVA = 21;
        float precio_producto = 0, precio_final;

        System.out.println("Introduzca el precio del producto por favor");
        precio_producto = teclado.nextFloat();

        precio_final = precio_producto + ((precio_producto * IVA) / 100);

        System.out.println("El precio final a pagar es de: $" + precio_final);
    }
}
