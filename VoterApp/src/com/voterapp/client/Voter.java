package com.voterapp.client;

import com.voterapp.exception.NotEligibleException;
import com.voterapp.service.ElectionBoothServiceImpl;
import com.voterapp.service.IElectionBoothService;

import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your locality");
        String locality = scanner.next();
        System.out.println("Enter your Voter ID: ");
        int voterId = scanner.nextInt();

        IElectionBoothService boothService = new ElectionBoothServiceImpl();
        try {
            if (boothService.checkEligibility(age, locality, voterId)) {
                System.out.println("You are eligible to vote");
            }
        }catch (NotEligibleException e) {
            e.printStackTrace();
        }
    }
}
