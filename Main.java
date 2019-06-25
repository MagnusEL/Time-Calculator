package www.magnusel.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean repeatIfHM = true;
        boolean repeatIfDecPer = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter hours: ");
        int hours = Integer.parseInt(scanner.nextLine());
        System.out.print("Please enter minutes: ");
        int minutes = Integer.parseInt(scanner.nextLine());

        System.out.print("Please enter seconds: ");
        int seconds = Integer.parseInt(scanner.nextLine());

        Tid tidObj = new Tid(hours, minutes, seconds);
        System.out.println("What kind of output do you want? Hours or minutes? (h/m)");

        while(repeatIfHM) {
            String userInput = scanner.nextLine();

            if(userInput.equals("h")) {
                System.out.println("Do you want the number with decimals or percentage? (d/p)");
                repeatIfHM = false;

                while(repeatIfDecPer) {
                    userInput = scanner.nextLine().toLowerCase();

                    if(userInput.equals("d")) {
                        System.out.print("The result is: " + tidObj.calculateDecimalHours() + " hours");
                        repeatIfDecPer = false;
                    } else if(userInput.equals("p")) {
                        System.out.print("The result is: " + tidObj.calculatePerCentHours() + "% hours\n(Remember 1 hour = 100%)");
                        repeatIfDecPer = false;
                    } else {
                        System.out.println("Enter the letter 'd' or the letter 'p' to choose 'decimal' or 'percentage'.");
                    }
                }
            } else if(userInput.equals("m")) {
                System.out.println("Do you want the number with decimals or percentage? (d/p)");
                repeatIfHM = false;

                while(repeatIfDecPer) {
                    userInput = scanner.nextLine().toLowerCase();

                    if(userInput.equals("d")) {
                        System.out.print("The result is: " + tidObj.calculateDecimalMinutes() + " minutes");
                        repeatIfDecPer = false;
                    } else if(userInput.equals("p")) {
                        System.out.print("The result is: " + tidObj.calculatePerCentMinute() + "%\nminutes (Remember 1 minute = 100%)");
                        repeatIfDecPer = false;
                    } else {
                        System.out.print("Enter the letter 'd' or the letter 'p' to choose 'decimal' or 'percentage'.");
                    }
                }

            } else {
                System.out.print("Enter the letter 'h' or the letter 'm' to choose 'hour' or 'minute' as output.");
            }
        }
    }
}
