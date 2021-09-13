/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        double priceitem1 = input.nextDouble(); //stores price of item 1
        System.out.print("Enter the quantity of item 1 ");
        int quantityitem1 = input.nextInt();    //stores quantity of item 1
        System.out.print("Enter the price of item 2: ");
        double priceitem2 = input.nextDouble(); //stores price of item 2
        System.out.print("Enter the quantity of item 2: ");
        int quantityitem2 = input.nextInt();    //stores quantity of item 2
        System.out.print("Enter the price of item 3: ");
        double priceitem3 = input.nextDouble(); //stores price of item 3
        System.out.print("Enter the quantity of item 3: ");
        int quantityitem3 = input.nextInt();    //stores quantity of item 3
        double subTotal = (priceitem1*quantityitem1)+(priceitem2*quantityitem2)+(priceitem3+quantityitem3);
        double tax = (subTotal*5.5)/100;    //calculate tax
        double total = subTotal+tax;    //calculate total
        System.out.println("Subtotal: $"+subTotal);
        System.out.println("Tax: $"+tax);
        System.out.println("Total: $"+total);



    }
}
