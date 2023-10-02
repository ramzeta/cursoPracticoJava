package org.example;

public class javaLang {
    public static void main(String[] args) {

        // Uso de java.lang.Object
        Object obj = new Object();
        System.out.println("Objeto creado: " + obj.toString());

        // Uso de java.lang.String
        String str1 = "Hola ";
        String str2 = "Mundo!";
        String strConcatenado = str1.concat(str2);
        System.out.println("String concatenado: " + strConcatenado);

        // Uso de java.lang.Math
        double raizCuadrada = Math.sqrt(16);
        System.out.println("Raíz cuadrada de 16: " + raizCuadrada);

        // Uso de java.lang.System
        long tiempoInicio = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            // Simulando alguna operación
        }
        long tiempoFin = System.currentTimeMillis();
        System.out.println("Tiempo transcurrido: " + (tiempoFin - tiempoInicio) + " milisegundos");
    }
}