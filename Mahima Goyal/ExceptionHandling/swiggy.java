package com.company;

import java.util.Scanner;

class nonDeliverable extends Exception{
    public nonDeliverable(String message) {
        super(message);
    }
}

public class swiggy {
    public static void zipCode(int zip) throws nonDeliverable {
        if ((zip == 123) || (zip == 456) || (zip == 789)) {
            throw new nonDeliverable("Sorry, delivery is unavailable in your area.");
        } else {
            System.out.println("Delivery is available in your area!");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your zip code: ");
        int n = sc.nextInt();
        try {
            zipCode(n);
        } catch (nonDeliverable e) {
            System.out.println(e.getMessage());
        }
    }
}
