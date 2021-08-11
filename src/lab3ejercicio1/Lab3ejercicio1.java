package lab3ejercicio1;

import java.util.Scanner;

public class Lab3ejercicio1 {
//Ejercicio 1

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        float nota, nota1, nota2;
        float suma;

        System.out.println("Ingrese tres notas:");
        nota = enter.nextFloat();
        nota1 = enter.nextFloat();
        nota2 = enter.nextFloat();

        suma = nota + nota1 + nota2;

        System.out.println("La sumatoria de todas las notas es: " + suma);
    }
    
}
