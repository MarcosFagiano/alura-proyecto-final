package com.marcosfagiano.challenge.models;

public class CreditCard extends Menu{
    private Float balance;
    private Float limit;

    // setters y getters



    public void setBalance(Float balance) {
        this.balance = balance;
    }
    public void setLimit(Float limit) {
        this.limit = limit;
    }
    public Float getBalance() {
        return balance;
    }

    public Float getLimit() {
        return limit;
    }


}
