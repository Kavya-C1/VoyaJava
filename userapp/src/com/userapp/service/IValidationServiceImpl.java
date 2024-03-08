package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class IValidationServiceImpl implements IValidationService {
    @Override
    public boolean validatePassword(String password) throws TooShortException, TooLongException {
        if (password.length() < 6) {
            throw new TooShortException("Password should be greater than 6");
        }
        if (password.length() > 15) {
            throw new TooLongException("Password should be less than 15");
        }

        return true;
    }

    @Override
    public boolean validateUser(String username) throws NameExistsException {
        String[] usernames = {"sri","priya","joe","kathy"};

            for (String name : usernames) {
                if (name.equals(username))
                    throw new NameExistsException("Name already exists");
            }
                return true;

    }
}
