package com.mycompany.grupo_2;

/**
 * Programa que convierte un número decimal a binario sin usar métodos internos.
 */
public class Grupo_2 {

    public static void main(String[] args) {
        int numeroDecimal = 25;  // Cambia este número para probar otros valores
        String binario = convertirABinario(numeroDecimal);

        System.out.println("El número " + numeroDecimal + " en binario es: " + binario);
    }

    // Método para convertir decimal a binario sin usar Integer.toBinaryString()
    public static String convertirABinario(int numero) {
        if (numero == 0) {
            return "0";
        }

        String binario = "";
        while (numero > 0) {
            int residuo = numero % 2;
            binario = residuo + binario;  // Concatenamos el bit al principio
            numero = numero / 2;
        }

        return binario;
    }
}
