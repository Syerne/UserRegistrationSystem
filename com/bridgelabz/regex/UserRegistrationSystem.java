package com.bridgelabz.regex;

import com.bridgelabz.regex.exception.InvalidUserInformationException;
import com.bridgelabz.regex.utils.Input;

import java.util.regex.Pattern;

public class UserRegistrationSystem {

    static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

    static final String EMAIL_ID_PATTERN = "^[a-zA-Z0-9]+?([.])*[?a-zA-Z0-9]*[@][b][l][.][c][o]?([.])?([a-z]{2})$";
    static final String MOBILE_NUMBER_PATTERN = "^[91]{2}[ ][6789]{1}[0-9]{9}$";
    static final String PASSWORD_PATTERN = "(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}";

    public static void main(String[] args) {
        System.out.println("User Registration System program");

        UserRegistrationSystem userRegistrationSystem = new UserRegistrationSystem();

        System.out.println("Enter Mobile Number With Country Code");
        userRegistrationSystem.isValidMobileNumber(Input.inputStringLineValue());
        System.out.println("Enter First Name");
        userRegistrationSystem.isValidFirstName(Input.inputStringValue());
        System.out.println("Enter Last Name");
        userRegistrationSystem.isValidLastName(Input.inputStringValue());
        System.out.println("Enter Given Email Id");
        userRegistrationSystem.isValidEmailId(Input.inputStringValue());
        System.out.println("Enter Your Password");
        userRegistrationSystem.isValidPassword(Input.inputStringValue());
    }

    private static boolean isValidInput(String regex, String UserInput) {

        boolean b = Pattern.matches(regex, UserInput);

        /*Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(UserInput);
        boolean b = m.matches();*/

        return b;
    }

    private void isValidPassword(String password) {
        try {
            if (isValidInput(PASSWORD_PATTERN, password)) {
                System.out.println("Valid Password");
            } else {
                throw new InvalidUserInformationException("Invalid Password : " + password);
            }
        } catch (InvalidUserInformationException e) {
            System.out.println(e);
        }
    }

    private void isValidEmailId(String emailId) {
        try {
            if (isValidInput(EMAIL_ID_PATTERN, emailId)) {
                System.out.println("Valid Email Id");
            } else {
                throw new InvalidUserInformationException("Invalid EmailId : " + emailId);
            }
        } catch (InvalidUserInformationException e) {
            System.out.println(e);

        }
    }

    private void isValidMobileNumber(String mobileNumber) {
        try {
            if (isValidInput(MOBILE_NUMBER_PATTERN, mobileNumber)) {
                System.out.println("Valid Mobile Number");
            } else {
                throw new InvalidUserInformationException("Invalid Mobile Number");
            }
        } catch (InvalidUserInformationException e) {
            System.out.println(e);
        }
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
