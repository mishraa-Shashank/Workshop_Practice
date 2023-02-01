package com.practice1.regex;

import java.util.regex.Pattern;

/**
 * @author Shashank
 */
public class UserRegistration {
    /**
     * created a separate method to check the user detail & return in true & false
     * This method can be use for every validation
     * It will reduce the number of line of code
     *
     * @param pattern - take the regex pattern
     * @param input   - take user detail as input to match with the regex pattern
     * @return - return the output as true or false
     */
    boolean validate(String pattern, String input) {
        return Pattern.compile(pattern).matcher(input).matches();
    }

    /**
     * method to validate the first name of the user
     * 1) declaring the regex pattern to the variable
     * 2) giving input to check the detail is correct or not
     *
     * @return - true or false whether the user detail is valid or not
     */
    public boolean validateFirstName() {
        String firstNameRegex = "^[A-Z]{1}[a-z]{3,}$";
        String firstName = "Shashank";
        return validate(firstNameRegex, firstName);
    }

    /**
     * method to validate the last name of the user
     * 1) declaring the regex pattern to the variable
     * 2) giving input to check the detail is correct or not
     *
     * @return - true or false whether the user detail is valid or not
     */
    public boolean validateLastName() {
        String lastNameRegex = "^[A-Z]{1}[a-z]{3,}$";
        String lastName = "Mishra";
        return validate(lastNameRegex, lastName);
    }

    /**
     * method to validate the email address of the user
     * 1) declaring the regex pattern to the variable
     * 2) giving input to check the detail is correct or not
     *
     * @return - true or false whether the user detail is valid or not
     */
    public boolean validateEmailAddress() {
        String emailRegex = "^[A-Za-z\\d]{3,}[.]?[A-Za-z\\d]+[@][A-Za-z\\d]+[.][a-z]{3,}([_+-.][A-Za-z\\d])*$";
        String email = "abc100@yahoo.com";
        return validate(emailRegex, email);
    }

    /**
     * method to validate the mobile number of the user
     * 1) declaring the regex pattern to the variable
     * 2) giving input to check the detail is correct or not
     *
     * @return - true or false whether the user detail is valid or not
     */
    public boolean validateMobileNumber() {
        String mobileRegex = "^[+91 | 0]+[-]?[6-9]{1}[\\d]{9}$";
        String mobileNumber = "+91-8081176945";
        return validate(mobileRegex, mobileNumber);
    }
}