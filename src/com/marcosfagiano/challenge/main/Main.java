package com.marcosfagiano.challenge.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.marcosfagiano.challenge.models.CreditCard;
import com.marcosfagiano.challenge.models.Menu;
import com.marcosfagiano.challenge.models.Product;

/**
 * Main
 */
public class Main extends Menu {

    public static void main(String[] args) {
        var creditCard = new CreditCard();
        ArrayList<Product> productList = new ArrayList<>();

        var kScanner = new Scanner(System.in);
        int option = 0;
        System.out.println("---Bienvenidos a la tienda virtual de alura---");
        do {
            option = showMenu(kScanner);
            kScanner.nextLine();
            switch (option) {
                case 1:
                    System.out.print("\nIngrese el balance de la tarjeta: ");
                    var balance = kScanner.nextFloat();
                    kScanner.nextLine();
                    if (balance <= 0) {
                        System.out.println("Saldo insuficiente\n");
                    } else {
                        creditCard.setBalance(balance);
                        System.out.println("Nuevo balance: %.2f".formatted(creditCard.getBalance()) + '\n');
                    }
                    break;
                case 2:
                    System.out.println("Saldo actual: %.2f".formatted(creditCard.getBalance()) + '\n');
                    break;
                case 3:
                    System.out.print("""
                            ---agregar producto al carro---

                            Nombre del producto: """);

                    var productName = kScanner.nextLine();

                    System.out.print("""
                            Precio del producto: """);
                    var productPrice = kScanner.nextFloat();
                    kScanner.nextLine();
                    var product = new Product(productName, productPrice);
                    productList.add(product);
                    break;

                case 4:
                    // TODO: quitar item
                    break;
                case 5:
                    if (!productList.isEmpty()) {
                        System.out.println("Carro vacio");
                        break;
                    }
                    System.out.println(productList);
                    break;
                case 6:
                    break;
                case 7:
                    // vaciar carro
                    productList.clear();
                    break;
                case 0:
                    System.out.println("""
                            Gracias por utilizar nuestros servicios.
                            Saliendo...
                            """);
                    break;
                default:
                    System.out.println("Ninguna opcion ingresada es correcta, ingrese nuevamente.");
                    break;
            }
        } while (option != 0);
        kScanner.close();
    }

}