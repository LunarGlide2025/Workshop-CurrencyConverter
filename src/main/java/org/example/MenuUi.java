package org.example;

import org.example.Utils.CurrencyConverterUtil;
import org.example.Utils.DateTimeUtil;

import java.util.Scanner;

/**
 * A simple UI class for the Currency Converter App.
 * It displays a menu, handles user input and validation inline,
 * Performs conversions using utility methods, and shows the result with the current date and time.
 */

public class MenuUi {
    private final Scanner scanner;

    public MenuUi(Scanner scanner) {
        this.scanner = scanner;
    }

    // Displays the menu options.
    private void displayMenu() {
        System.out.println("\nCURRENCY CONVERTER ACTIVATED!\n");
        System.out.println("1. Convert SEK to EUR");
        System.out.println("2. Convert SEK to USD");
        System.out.println("3. Convert EUR to SEK");
        System.out.println("4. Convert EUR to USD");
        System.out.println("5. Convert USD to SEK");
        System.out.println("6. Convert USD to EUR");
        System.out.println("0. Exit \n");
    }

    // Main loop handles user interaction.
    public void startMenu() {

        boolean keepRunning = true;
        while (keepRunning) {

            displayMenu();
            System.out.print("Please, do your choice: \n");
            String option = scanner.nextLine().trim();


            String fromCurrency;
            String toCurrency;

            switch (option) {
                case "1":
                    fromCurrency = "SEK";
                    toCurrency = "EUR";
                    break;
                case "2":
                    fromCurrency = "SEK";
                    toCurrency = "USD";
                    break;
                case "3":
                    fromCurrency = "EUR";
                    toCurrency = "SEK";
                    break;
                case "4":
                    fromCurrency = "EUR";
                    toCurrency = "USD";
                    break;
                case "5":
                    fromCurrency = "USD";
                    toCurrency = "SEK";
                    break;
                case "6":
                    fromCurrency = "USD";
                    toCurrency = "EUR";
                    break;
                case "0":
                    System.out.println("Exiting, bye!");
                    keepRunning = false;
                    continue;
                default:
                    System.out.println("Invalid option. Please try again.");
                    continue;
            }

            // Prompts for the amount and performs inline validation.
            System.out.printf("Enter amount in %s: ", fromCurrency);
            String inputAmount = scanner.nextLine().trim();

            double amount;

            try {
                amount = Double.parseDouble(inputAmount.replace(',', '.'));
                if (amount < 0) {
                    System.out.println("Amount cannot be negative! Please try again.\n");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("That doesn't look like a valid number. Please try again.\n");
                continue;
            }

            // Performs conversion using utility class.
            double result = 0;
            switch (option) {
                case "1":
                    result = CurrencyConverterUtil.convertSekToEuro(amount);
                    break;
                case "2":
                    result = CurrencyConverterUtil.convertSekToUsd(amount);
                    break;
                case "3":
                    result = CurrencyConverterUtil.convertEuroToSek(amount);
                    break;
                case "4":
                    result = CurrencyConverterUtil.convertEuroToUsd(amount);
                    break;
                case "5":
                    result = CurrencyConverterUtil.convertUsdToSek(amount);
                    break;
                case "6":
                    result = CurrencyConverterUtil.convertUsdToEuro(amount);
                    break;
            }

            // Displays the result.
            System.out.printf("The current date and time is: " + DateTimeUtil.getCurrentDateTime() +
                    " and your converted amount is: %.2f %s%n", result, toCurrency + "\n");


            System.out.print("Do you want to perform another conversion? (y/n): \n");
            String shutDown = scanner.nextLine().trim().toLowerCase();
            if (!shutDown.equals("y")) {
                keepRunning = false;
                System.out.println("SHUTTING DOWN CURRENCY CONVERTER.\n");
            }
        }
        scanner.close();
    }
}
