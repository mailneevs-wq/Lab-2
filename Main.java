package labs.lab2;

import java.util.Scanner;

public class Main {

    public static String problem1_militaryTimeDifference(int time1, int time2) {
        int h1 = time1 / 100;
        int m1 = time1 % 100;
        int h2 = time2 / 100;
        int m2 = time2 % 100;

        int t1 = h1 * 60 + m1;
        int t2 = h2 * 60 + m2;

        int diff = t2 - t1;
        if (diff < 0) diff += 24 * 60;

        return (diff / 60) + " hours " + (diff % 60) + " minutes";
    }

    public static String problem2_printDigits(int num) {
        String s = String.valueOf(num);
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(i);
            if (i < s.length() - 1) result += " ";
        }
        return result;
    }

    public static void problem4_giveChange() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount due in cents: ");
        int due = sc.nextInt();

        System.out.print("Enter amount received in cents: ");
        int received = sc.nextInt();

        int change = received - due;

        int dollars = change / 100;
        change %= 100;
        int quarters = change / 25;
        change %= 25;
        int dimes = change / 10;
        change %= 10;
        int nickels = change / 5;
        int pennies = change % 5;

        System.out.print("Change: " + dollars + " dollars, " + quarters + " quarters, " +
                dimes + " dimes, " + nickels + " nickels, " + pennies + " pennies");
    }

    public static void problem6_validateInput() {
        Scanner sc = new Scanner(System.in);
        String errors = "";

        System.out.print("Enter the first name: ");
        String first = sc.nextLine();

        System.out.print("Enter the last name: ");
        String last = sc.nextLine();

        System.out.print("Enter the zip code: ");
        String zip = sc.nextLine();

        System.out.print("Enter the student ID: ");
        String id = sc.nextLine();

        if (first.length() == 0)
            errors += "First name must be filled in. ";
        else if (first.length() == 1)
            errors += "\"" + first + "\" is not a valid first name. It is too short. ";

        if (last.length() == 0)
            errors += "Last name must be filled in. ";
        else if (last.length() == 1)
            errors += "\"" + last + "\" is not a valid last name. It is too short. ";

        if (zip.length() != 5) {
            errors += "Zip code must be a 5-digit integer. ";
        } else {
            for (char c : zip.toCharArray()) {
                if (!Character.isDigit(c)) {
                    errors += "Zip code must be a 5-digit integer. ";
                    break;
                }
            }
        }

        if (!id.matches("[A-Z]{2}-\\d{4}")) {
            errors += id + " is not a valid ID. ";
        }

        if (errors.length() == 0)
            System.out.print("There were no errors found.");
        else
            System.out.print(errors.trim());
    }

    public static boolean problem8_nearAndFar(int a, int b, int c) {
        boolean nearB = Math.abs(a - b) <= 1;
        boolean nearC = Math.abs(a - c) <= 1;

        boolean farB = Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2;
        boolean farC = Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2;

        return (nearB && farC) || (nearC && farB);
    }

    public static int problem9_playBlackjack(int a, int b) {
        if (a > 21 && b > 21) return 0;
        if (a > 21) return b;
        if (b > 21) return a;
        return Math.max(a, b);
    }

}
