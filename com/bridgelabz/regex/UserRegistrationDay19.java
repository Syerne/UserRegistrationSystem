package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationDay19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstNameRegex = "[A-Z][a-z]{2,}";
        String userFirstName = sc.nextLine();
        System.out.println(isValidInput(firstNameRegex, userFirstName));
        System.out.println(isValidUserInfo(firstNameRegex, userFirstName));
        System.out.println(isValidateUserInfo(firstNameRegex, userFirstName));
    }

    /*
    * All three methods purpose same
    * */
    private static boolean isValidInput(String regex, String userInput) {
        boolean flag = Pattern.matches(regex, userInput);
        return flag;
    }

    private static boolean isValidUserInfo(String regex, String userInput) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(userInput).matches();
    }

    private static boolean isValidateUserInfo(String regex, String userInput) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userInput);
        boolean result = matcher.matches();
        return result;
    }
}
