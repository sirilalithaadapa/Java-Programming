package Converter;

import java.util.Scanner;

public class TimeConverter extends Converter{

    private static final String ENTER_TIME_IN_HOURS = "Enter time in Hours : ";
    private static final int ONE_HOUR_IN_MIN = 60;
    private static final int ONE_MIN_IN_SEC = 60;
    private static final int ONE_HOUR_IN_SEC = 3600;

    double convertHoursToMins (double hours) {
        return hours * ONE_HOUR_IN_MIN;
    }

    double convertMinToHours (double mins) {
        return mins / ONE_HOUR_IN_MIN;
    }

    double convertHoursToSecs (double hours) {
        return hours * ONE_HOUR_IN_SEC;
    } 

    double convertSecsToHours (double secs) {
        return secs / ONE_HOUR_IN_SEC;
    }

    double convertMinsToSecs (double mins) {
        return mins * ONE_MIN_IN_SEC;
    } 

    double convertSecsToMins (double secs) {
        return secs / ONE_MIN_IN_SEC;
    }

    void converter () {
        System.out.println("*********TIME CONVERTER********");
        System.out.println("1. Hours to Minutes\n2. Minutes To Hours");
        System.out.println("3. Hours to Seconds\n4. Seconds To Hours");
        System.out.println("5. Minutes to Seconds\n6. Seconds to Minutes\n7. Exit");
        System.out.println("Enter your chocie: ");

        Scanner input = new Scanner(System.in); 
        int choice = input.nextInt();

        switch (choice) {
            case 1 : {
                System.out.println("Enter time in Hours: ");
                double hours = input.nextDouble();
                System.out.printf(hours + " hours = %.4f mins", convertHoursToMins(hours));
                break;
            }

            case 2 : {
                System.out.println("Enter time in Minutes: ");
                double mins = input.nextDouble();
                System.out.printf(mins + " mins = %.4f hours", convertMinToHours(mins) );
                break;
            }

            case 3 : {
                System.out.println(ENTER_TIME_IN_HOURS);
                double hours = input.nextDouble();
                System.out.printf(hours + " hours = %.4f secs", convertHoursToSecs(hours));
                break;
            }

            case 4 : {
                System.out.println("Enter time in seconds: ");
                double secs = input.nextDouble();
                System.out.printf(secs + " secs = %.4f euros\n", convertSecsToHours(secs));
                break;
            }

            case 5 : {
                System.out.println("Enter time in minutes : ");
                double mins = input.nextDouble();
                System.out.printf(mins + " mins = %.4f secs\n", convertMinsToSecs(mins) );
                break;
            }

            case 6 : {
                System.out.println("Enter time in seconds: ");
                double secs = input.nextDouble();
                System.out.printf(secs + " secs = %.4f mins\n", convertSecsToMins(secs));
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
        TimeConverter myTimeConverter = new TimeConverter();
        myTimeConverter.converter();
    }

}
