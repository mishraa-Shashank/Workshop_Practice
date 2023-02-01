package com.practice1.regex;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Shashank
 */
public class UserRegistrationTest {
    UserRegistration validator = new UserRegistration();

    /**
     * created test method to test the first name is valid or not
     */
    @Test
    public void givenFirstName_ShouldReturnTrue() {

//        boolean res = UserRegistration.validateFirstName();
        boolean res = validator.validateFirstName();
        Assert.assertTrue(res);
    }

    /**
     * created test method to test the last name is valid or not
     */
    @Test
    public void givenLastName_ShouldReturnTrue() {
//        boolean res = UserRegistration.validateLastName();
        boolean res = validator.validateLastName();
        Assert.assertTrue(res);
    }

    /**
     * created test method to test the email address is valid or not
     */
    @Test
    public void givenEmailId_ShouldReturnTrue() {
        boolean res = validator.validateEmailAddress();
//        Assert.assertFalse(res);
        Assert.assertTrue(res);
    }

    /**
     * created test method to test the mobile number is valid or not
     */
    @Test
    public void givenMobileNumber_ShouldReturnTrue() {
        boolean res = validator.validateMobileNumber();
        Assert.assertTrue(res);
    }
}