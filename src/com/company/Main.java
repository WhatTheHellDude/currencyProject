package com.company;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Hashtable<String, Double> currencyPesos = new Hashtable<>();
        Hashtable<String, Double> currencyDollars = new Hashtable<>();
        Hashtable<String, Double> currencyDogeCoin = new Hashtable<>();


        currencyPesos.put("Dollars", 0.050);
        currencyPesos.put("DogeCoin", 0.397);
        currencyPesos.put("Pesos", 1.00);

        currencyDollars.put("Dollars", 1.00);
        currencyDollars.put("Pesos", 19.92);
        currencyDollars.put("DogeCoin", 3.00);

        currencyDogeCoin.put("DogeCoin", 1.00);
        currencyDogeCoin.put("Pesos", 13.58);
        currencyDogeCoin.put("Dollars", 0.143032);

//        int pesosToDollars = Double.parseDouble(currencyPesos.get("Dollars"));
//        int pesosToDogeCoin = Double.parseDouble(currencyPesos.get("DogeCoin"));
//        int dollarsToPesos = Double.parseDouble()


        while (true) {
            System.out.println("Please type out the type of currency  \n 1. Pesos \n 2. Dollars \n 3. DogeCoin");
            String convertFrom = scanner.nextLine();
            String convertTo;
            Integer cashInserted = 0;

            if (convertFrom.equals("1")) {
                System.out.println("How many Pesos do you have?");
                cashInserted = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Would you like to convert your Pesos to \n A. Pesos \n B. Dollars \n C. DogeCoin");
                convertTo = scanner.nextLine();
                if (convertTo.equals("A")) {
                    System.out.println(cashInserted);
                } else if (convertTo.equals("B")) {
                    System.out.print(currencyPesos.get("Dollars") * cashInserted);
                } else if (convertTo.equals("C")) {
                    System.out.print(currencyPesos.get("DogeCoin") * cashInserted);
                }
            } else if (convertFrom.equals("2")) {
                System.out.println("How many Dollars do you have?");
                cashInserted = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Would you like to convert your Dollars to \n A Pesos \n B Dollars \n C DogeCoin");
                convertTo = scanner.nextLine();
                if (convertTo.equals("B")) {
                    System.out.println(cashInserted);
                } else if (convertTo.equals("A")) {
                    System.out.print(currencyDollars.get("Pesos") * cashInserted);
                } else if (convertTo.equals("C")) {
                    System.out.print(currencyDollars.get("Dollars"));
                }
            } else if (convertFrom.equals("3")) {
                System.out.println("How many DogeCoins do you have?");
                cashInserted = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Would you like to convert your DogeCoins to \n A Pesos \n B Dollars \n C DogeCoin");
                convertTo = scanner.nextLine();
                if (convertTo.equals("C")) {
                    System.out.println(cashInserted);
                } else if (convertTo.equals("A")) {
                    System.out.print(currencyDogeCoin.get("Pesos") * cashInserted);
                } else if (convertTo.equals("B")) {
                    System.out.print(currencyDogeCoin.get("Dollars"));
                }
            } else {
                System.out.println("Please type in one of the currencies we are able to convert");
            }
        System.out.println("\n \n \n \n \n \n \n");
        }
    }
}
