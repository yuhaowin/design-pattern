package com.yuhaowin.design.structure.bridge;

public abstract class Bank  {
    protected  Account account;

    public Bank(Account account) {
        this.account = account;
    }

    public abstract Account openAccount();
}
