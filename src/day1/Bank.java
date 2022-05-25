package day1;

public class Bank {

    public static void main(String[] args) {

        Account account1 = new Account();

        // account1.accountNumber = "123456789";
        account1.setAccountNumber( "123456789");

        // account1.accountHolderName = "Badri Adhikari";
        account1.setAccountHolderName( "Badri Adhikari");

        //account1.accountType = AccountType.SALARY;
        account1.setAccountType( AccountType.SALARY);

        //account1.accountBalance = 500f;
        account1.setAccountBalance(500f);

        //account1.branchName = "GBIME"

        //account1.branch="Baneshwor";
        account1.setBranch("Baneshwor");

        //account1.ssn = "111111111";
        account1.setSsn("111111111");


        Account account2 = new Account ();

       // account2.accountNumber = "987654321";
        account2.setAccountNumber("987654321");

       // account2.ssn = "222222222";
        account2.setSsn("222222222");

        //account2.accountBalance = 200f;
        account2.setAccountBalance(200f);

//        // System.out.println(account1.accountNumber);
//        System.out.println(account1.getAccountNumber());
//
//        //System.out.println(account2.accountNumber);
//        System.out.println(account2.getAccountNumber());

        //Transfer balance 200 from account1 to account2
        float balanceToBeTransferred = 200;
//        account1.setAccountBalance( account1.getAccountBalance()-balanceToBeTransferred);
//        account2.setAccountBalance( account2.getAccountBalance()+balanceToBeTransferred);
        account1.transferBalance(account1,account2, balanceToBeTransferred);

    }
}
