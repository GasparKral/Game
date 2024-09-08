package utils;

import java.util.Scanner;

public class Utils {

    public static String idGenetarator() {

        String resString = "";

        for (int i = 0; i < 5; i++) {

            int digit = (int) (Math.random() * Math.pow(10, i));

            resString += digit;
        }

        return resString;

    }

    public static Scanner scanner = new Scanner(System.in);

}
