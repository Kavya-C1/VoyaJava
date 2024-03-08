package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIdException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {
    @Override
    public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException {
        try{
            checkAge(age);
            checkLocality(locality);
            checkVoter(vid);
            return true;
        }catch (NotEligibleException e){
            throw e;
        }
    }

    private void checkVoter(int vid) throws  InvalidVoterIdException {
        if(vid<1000 || vid>9999)
            throw new InvalidVoterIdException("Invalid voter id");
    }

    private void checkLocality(String locality) throws LocalityNotFoundException {
String[] localities = {"beereshwara nagar","konankunte","btm"};
boolean found = false;
for(String loc:localities){
    if (loc.equals(localities)){
        found = true;
        break;
    }
}
if (!found)
    throw new LocalityNotFoundException("your locality is not eligible for voting");
    }

    private void checkAge(int age) throws UnderAgeException {
        if(age<18)
            throw new UnderAgeException("you are underage for voting");

    }
}
