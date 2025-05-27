package com.mycompany.grupo.progra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Clase principal para verificar si un número es primo.
 * Todo el código está en esta clase.
 */
public class Grupo2Progra {

    public static void main(String[] args) {
        // Usamos BufferedReader para manejar mejor la entrada desde la consola
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Pedir al usuario que ingrese un número
            System.out.print("Ingrese un número para verificar si es primo: ");
            String input = reader.readLine(); // Leemos la entrada como String
            int numero = Integer.parseInt(input); // Convertimos la entrada a un número entero

            // Verificar si el número es primo usando el método esPrimo
            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " NO es un número primo.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer la entrada.");
        } catch (NumberFormatException e) {
            System.out.println("Por favor ingrese un número válido.");
        }
    }

    /**
     * Método que verifica si un número entero es primo.
     * 
     * @param numero Número a evaluar.
     * @return true si es primo, false si no lo es.
     */
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false; // Números menores o iguales a 1 no son primos
        if (numero == 2) return true;  // 2 es primo
        if (numero % 2 == 0) return false; // Si es par y mayor que 2, no es primo

        // Solo verificar hasta la raíz cuadrada del número
        int limite = (int) Math.sqrt(numero);
        for (int i = 3; i <= limite; i += 2) {
            if (numero % i == 0) return false; // Si es divisible, no es primo
        }

        return true; // Si no es divisible, es primo
    }
}

