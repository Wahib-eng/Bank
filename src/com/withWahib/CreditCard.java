package com.withWahib;

public class CreditCard extends Customer{
    int CardNo,limit,availableLimit,currentDebt;
    CreditCard( int customerNo, String accounts, String creditCards, int cardNo, int limit, int availableLimit, int currentDebt){
        super(customerNo,accounts,creditCards);
        this.CardNo=cardNo;
        this.limit=limit;
        this.availableLimit=availableLimit;
        this.currentDebt=currentDebt;
    }

    public void setCardNo(int cardNo) {
        CardNo = cardNo;
    }

    public int getCardNo() {
        return CardNo;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setAvailableLimit(int availableLimit) {
        this.availableLimit = availableLimit;
    }

    public int getAvailableLimit() {
        return availableLimit;
    }

    public void setCurrentDebt(int currentDebt) {
        this.currentDebt = currentDebt;
    }

    public int getCurrentDebt() {
        return currentDebt;
    }

    @Override
    public String toString() {
        return (super.toString()+"CreditCard{" +
                "CardNo=" + CardNo +
                ", limit=" + limit +
                ", availableLimit=" + availableLimit +
                ", currentDebt=" + currentDebt +
                '}');
    }
}
