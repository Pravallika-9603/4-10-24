package com.neoteric.java.atm;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class AccountService {
    public Account createAccount(User user){
        Account account=new Account();
        account.accountnumber=String.valueOf(Math.random());
        account.user=user;
        return account;
    }
    public DebitCard issueDebitCard(Account account){
        DebitCard debitCard=new DebitCard();

        debitCard.cardno= UUID.randomUUID().toString();
        debitCard.cvv="4567890";
        debitCard.name=account.user.name;
        debitCard.fromdate=new Date();

        Calendar calendar=Calendar.getInstance();

        Date date=new Date();

        calendar.setTime(date);

        calendar.add(Calendar.YEAR,1);
        calendar.add(Calendar.MONTH,12);

        debitCard.todate=calendar.getTime();

        return debitCard;
    }
}
