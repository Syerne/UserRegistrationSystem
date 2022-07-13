package com.bridgelabz.regex;

import com.bridgelabz.regex.exception.InvalidUserInformationException;
import com.bridgelabz.regex.utils.Input;

import java.util.regex.Pattern;

public class UserRegistrationSystem {

    final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

    public static void main(String[] args) {
        System.out.println("User Registration System program");

        UserRegistrationSystem userRegistrationSystem = new UserRegistrationSystem();
        System.out.println("Enter First Name");
        userRegistrationSystem.isValidFirstName(Input.inputStringValue());
        System.out.println("Enter Last Name");
        userRegistrationSystem.isValidLastName(Input.inputStringValue());
    }

    private static boolean isValidInput(String regex, String UserInput) {

        boolean b = Pattern.matches(regex, UserInput);

        /*Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(UserInput);
        boolean b = m.matches();*/

        return b;
    }

    private void isValidFirstName(String firstName) {

        try {
            if (isValidInput(FIRST_NAME_PATTERN, firstName)) {
                System.out.println("Valid First Name : " + firstName);
            } else {
                throw new InvalidUserInformationException("Invalid First Name : " + firstName);
            }
        } catch (InvalidUserInformationException e) {
            System.out.println(e);
        }
    }

    private void isValidLastName(String lastName) {
        try {
            if (isValidInput(LAST_NAME_PATTERN, lastName)) {
                System.out.println("Valid Last Name : " + lastName);
            } else {
                throw new InvalidUserInformationException("Invalid Last Name : " + lastName);
            }
        } catch (InvalidUserInformationException e) {
            System.out.println(e);
        }
    }
}
