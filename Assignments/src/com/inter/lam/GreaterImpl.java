package com.inter.lam;

public class GreaterImpl implements IGreater {
    //using a class
    @Override
    public void greetMessage(String message) {
        System.out.println(message);
//anano
        IGreater greater1 = new IGreater() {
            @Override
            public void greetMessage(String message) {
                System.out.println(message);
            }
        };

        //call the method
        greater1.greetMessage("Great day");
    }
}
