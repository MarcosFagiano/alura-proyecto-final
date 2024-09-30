package com.marcosfagiano.challenge.models;

import java.util.Scanner;


public class Menu {
    public static Integer showMenu(Scanner kScanner) {
        System.out.print("""
                [1] Agregar limite de la tarjeta.
                [2] Mostrar saldo disponible.
                [3] Agregar item al carro de compras.
                [4] Quitar item del carro de compras.
                [5] Mostar carro de compras.
                [6] Comprar carro.
                [7] Vaciar carro.
                [0] Salir.

                Opcion:  """);

        return kScanner.nextInt();
    }

}
