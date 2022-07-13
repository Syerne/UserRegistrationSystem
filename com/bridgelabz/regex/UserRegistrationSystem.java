package com.bridgelabz.regex;

import com.bridgelabz.regex.exception.InvalidUserInformationException;
import com.bridgelabz.regex.utils.Input;

import java.util.regex.Pattern;

public class UserRegistrationSystem {

    final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

    public static void main(String[] args) {
        System.out.println("User Registration System program");

        UserRegistrationSystem userRegistrationSystem = new UserRegistrationSystem();
        System.out.println("Enter First Name");
        userRegistrationSystem.isValidName(Input.inputStringValue());
    }

    private static boolean isValidInput(String regex, String UserInput) {

        boolean b = Pattern.matches(regex, UserInput);

        /*Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(UserInput);
        boolean b = m.matches();*/

        return b;
    }

    private void isValidName(String name) {

        try {
            if (isValidInput(FIRST_NAME_PATTERN, name)) {
                System.out.println("Valid Name : " + name);
            } else {
                throw new InvalidUserInformationException("Invalid Name : " + name);
            }
        } catch (InvalidUserInformationException e) {
            System.out.println(e);
        }
    }
}
