package com.oops.abstraction;

public class AbsMain {
    public static void main(String[] args) {
        Bank bank = new Branch1();
        bank.carLoan();
        bank.housingLoan();
        bank.eduLoan();
        bank.admin();

        Branch1 branch1 = (Branch1) bank;
        branch1.staffDetails();

        bank = new SubBranch();
        bank.carLoan();;
        bank.housingLoan();
        bank.eduLoan();
        bank.admin();

        SubBranch subBranch = new SubBranch();
        subBranch.subPay();

//        (SubBranch sb = ()bank;
//        sb.subPay())

        Branch2 branch2 = new SubBranch();
    }
}
