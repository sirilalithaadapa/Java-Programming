package Converter;

import java.util.Scanner;

public class CurrencyConverter extends Converter{

    private static final double ONE_YEN_IN_INR = 0.707;
    private static final double ONE_DOLLAR_TO_INR = 73.368;
    private static final double ONE_EURO_IN_INR = 89.790;

    double convertDollarToINR (double dollars) {
        return dollars * ONE_DOLLAR_TO_INR;
    }

    double convertINRToDollars (double rupees) {
        return rupees / ONE_DOLLAR_TO_INR;
    }

    double convertEuroToINR (double euros) {
        return euros * ONE_EURO_IN_INR;
    }

    double convertINRToEuro (double rupees) {
        return rupees / ONE_EURO_IN_INR;
    }

    double convertYenToINR (double yen) {
        return yen * ONE_YEN_IN_INR;
    }

    double convertINRToYen (double rupees) {
        return rupees / ONE_YEN_IN_INR;
    }

    void converter () {
        System.out.println("*********CURRENCY CONVERTER********");
        System.out.println("1. Dollar To INR\n2. INR To Dollar");
        System.out.println("3. Euro to INR\n4. INR To Euro");
        System.out.println("5. Yen to INR\n6. INR to Yen\n7. Exit");
        System.out.println("Enter your chocie: ");

        Scanner input = new Scanner(System.in); 
        int choice = input.nextInt();

        switch (choice) {
            case 1 : {
                System.out.println("Enter currency in Dollars: ");
                double dollars = input.nextDouble();
                System.out.printf(dollars + " Dollars = %.4f rupees", convertDollarToINR(dollars));
                break;
            }

            case 2 : {
                System.out.println("Enter currency in INR: ");
                double rupees = input.nextDouble();
                System.out.printf(rupees + " rupees = %.4f dollars", convertINRToDollars(rupees) );
                break;
            }

            case 3 : {
                System.out.println("Enter currency in Euros : ");
                double euros = input.nextDouble();
                System.out.printf(euros + " euros = %.4f rupees", convertEuroToINR(euros));
                break;
            }

            case 4 : {
                System.out.println("Enter currency in Dollars: ");
                double rupees = input.nextDouble();
                System.out.printf(rupees + " rupees = %.4f euros\n", convertINRToEuro(rupees));
                break;
            }

            case 5 : {
                System.out.println("Enter currency in Yen : ");
                double yens = input.nextDouble();
                System.out.printf(yens + " yens = %.4f rupees\n", convertYenToINR(yens) );
                break;
            }

            case 6 : {
                System.out.println("Enter currency in rupees: ");
                double rupees = input.nextDouble();
                System.out.printf(rupees + " rupees = %.4f yens\n", convertINRToYen(rupees));
                break;
            }
             case 7: {
                 break;
             }
              
             default: {
                 System.out.println("Choose a interger between 1 & 7");
             }
        }

        input.close();
    }
    
    public static void main(String[] args) {
        CurrencyConverter myConverter = new CurrencyConverter();
        myConverter.converter();
    }
}
