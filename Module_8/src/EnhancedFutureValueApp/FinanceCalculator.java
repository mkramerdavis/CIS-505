// Package declaration for the FinanceCalculator class. //
package EnhancedFutureValueApp;

/*
 * FinanceCalculator.java
 * This class provides a method to calculate the future value of an investment based on monthly payments, 
 * interest rate, and years.
 */
public class FinanceCalculator {

    // constant for the number of months in a year. //
    private static int MONTHS_IN_YEAR = 12;

    // Method to calculate the future value of an investment. //
    public static double calculateFutureValue(double monthlyPayment, double rate, int years) {

        int months = years * MONTHS_IN_YEAR;

        double interestRate = 1 + (rate / 100);

        double presentValue = monthlyPayment * months;

        double futureValue = presentValue * Math.pow(interestRate, months);

        return futureValue;
    }
} // End of FinanceCalculator.java //
