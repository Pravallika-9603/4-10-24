package com.neoteric.java.atm;

import java.util.Locale;

public class AccountValidationTest {
    public static void main(String[] args) {
        AccountService accountService=new AccountService();

        User churi=new User();
        churi.name="Pravallika";
        churi.adharnumber="89396345603";
        churi.pan="GUPPP603";

        Account churiacc=accountService.createAccount(churi);

        System.out.println("accNo="+churiacc.accountnumber+" name="+churiacc.user.name);

        User vijay=new User();
        vijay.name="VijayBareddy";
        vijay.adharnumber="345678";
        vijay.pan="dfgh987654";

        Account vijayacc=accountService.createAccount(vijay);

        System.out.println("accNo="+vijayacc.accountnumber+" name="+vijayacc.user.name);

        System.out.println(accountService.issueDebitCard(vijayacc).cardno);

        System.out.println(Locale.getDefault());
    }
}
