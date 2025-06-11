package com.ligadefutbol.Utils;

import java.util.Scanner;

public class InputUtils {

    public static long leerEnteroPositivo(Scanner scanner){
        while(true){
            String input = scanner.nextLine();
            scanner.nextLine();
            try {
                int entero = Integer.parseInt(input);
                if (entero < 0) {
                    System.out.println("Debe ingresar un numero positivo");
                    continue;
                }
                return entero;
            } catch (NumberFormatException e) {
                System.out.println("No ha ingresado un valor entero valido");
            }
        }
    }
}
