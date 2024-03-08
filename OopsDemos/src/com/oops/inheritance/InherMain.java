package com.oops.inheritance;

public class InherMain {
    public static void main(String[] args) {
        InEmployee inEmployee = new InEmployee("A",101);
        inEmployee.getDetails();

        InManager inManager = new InManager("B",102,30000);
        inManager.getDetails();
        inManager.printBonus(1000);

    }
}
