package com.yuhaowin.design.structure.bridge;

public class Test {
    public static void main(String[] args) {
        Bank abcBank = new ABCBank(new DepositAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccount();

        Bank icbcBank = new ICBCBank(new SavingAccount());
        Account icbcAccount = abcBank.openAccount();
        icbcAccount.showAccount();
    }
}
