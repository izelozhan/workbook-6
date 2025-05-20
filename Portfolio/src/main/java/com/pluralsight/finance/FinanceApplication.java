package com.pluralsight.finance;
import java.util.Scanner;

public class FinanceApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account1 = new BankAccount("Pam", "checking", 0);
        Portfolio portfolio = new Portfolio();

        account1.deposit(100);
        account1.withdraw(50);

        //add portfolio
        portfolio.add(new BankAccount("Visa", "123", 1000));
        portfolio.add(new BankAccount("CapitalOne", "123", 500));
        portfolio.add(new Gold("antique gold of mine", 1000, 1));
        portfolio.add(new Jewelry("grandma's pearl", 2000, 0));

        //print out total/most/least value
        System.out.println("Total value: " + portfolio.getValue());
        System.out.println("Most valuable: " + portfolio.getMostValuable().getValue());
        System.out.println("Least valuable: " + portfolio.getLeastValuable().getValue());

        //bonus
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an asset to add your portfolio! :");
            System.out.println("1. Bank Account");
            System.out.println("2. Credit Card");
            System.out.println("3. Fixed Asset");
            System.out.println("4. Exit");
            System.out.print("Enter choice (1-4): ");

            int input = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case 1:
                    System.out.println("=== Add Bank Account ===");
                    System.out.println("Enter bank name: ");
                    String bankName = scanner.nextLine();
                    System.out.println("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.println("Enter balance: ");
                    double balance = Double.parseDouble(scanner.nextLine());
                    portfolio.add(new BankAccount(bankName, accountNumber, balance));
                    System.out.println("Added!");
                    break;
                case 2:
                    System.out.println("=== Add Credit Card ===");
                    System.out.println("Enter bank name: ");
                    String cardName = scanner.nextLine();
                    System.out.println("Enter balance: ");
                    double creditBalance = Double.parseDouble(scanner.nextLine());
                    portfolio.add(new CreditCard(cardName, creditBalance));
                    System.out.println("Added!");
                    break;
                case 3:
                    printAssets(scanner, portfolio);
                    break;
                case 4:
                    exit = true;
                    System.out.println("BYE!!!");
                    break;
                default:
                    System.out.println("Invalid choice.");

            }


        }

    }

    private static void printAssets(Scanner scanner, Portfolio portfolio) {

        System.out.println("=== Add Fixed Asset ===");
        System.out.println("Choose an asset type:");
        System.out.println("1. Gold");
        System.out.println("2. Jewelry");
        System.out.println("3. House");

        int type = Integer.parseInt(scanner.nextLine());

        switch (type) {
            case 1:
                System.out.println("Enter asset name: ");
                String gName = scanner.nextLine();
                System.out.println("Enter a value: ");
                double gValue = Double.parseDouble(scanner.nextLine());
                System.out.println("Add weight: ");
                double weight = Double.parseDouble(scanner.nextLine());
                portfolio.add(new Gold(gName, gValue, weight));
                System.out.println("Added!");
                break;
            case 2:
                System.out.println("Enter asset name: ");
                String jName = scanner.nextLine();
                System.out.println("Enter a value: ");
                double jValue = Double.parseDouble(scanner.nextLine());
                System.out.println("Add karat: ");
                double karat = Double.parseDouble(scanner.nextLine());
                portfolio.add(new Jewelry(jName, jValue, karat));
                System.out.println("Added!");
                break;
            case 3:
                System.out.println("Enter asset name: ");
                String hName = scanner.nextLine();
                System.out.println("Enter a value: ");
                double hValue = Double.parseDouble(scanner.nextLine());
                System.out.println("Add bedrooms: ");
                int bedrooms = Integer.parseInt(scanner.nextLine());
                System.out.println("Add built year: ");
                int yearBuilt = Integer.parseInt(scanner.nextLine());
                System.out.println("Add square feet : ");
                int squareFeet = Integer.parseInt(scanner.nextLine());
                portfolio.add(new House(yearBuilt, squareFeet, bedrooms, hName, hValue));
                System.out.println("Added!");
                break;
        }
    }

}

