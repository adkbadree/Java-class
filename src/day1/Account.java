package day1;

public class Account {

    // States

    // account number (String)
   private String accountNumber;

    // account holder name (String)
    private String accountHolderName;

    //account type (enumerated)
    private AccountType  accountType;

    // account balance (float)
    private float accountBalance;

    // bank name (String)
    private final String bankName = "RBB";

    // branch (String)
    private String branch;

    //Social Security Number
    private String ssn;

 public String getAccountNumber() {
  return accountNumber;
 }

 public void setAccountNumber(String accountNumber) {
  this.accountNumber = accountNumber;
 }

 public String getAccountHolderName() {
  return accountHolderName;
 }

 public void setAccountHolderName(String accountHolderName) {
  this.accountHolderName = accountHolderName;
 }

 public AccountType getAccountType() {
  return accountType;
 }

 public void setAccountType(AccountType accountType) {
  this.accountType = accountType;
 }

 public float getAccountBalance() {
  return accountBalance;
 }

 public void setAccountBalance(float accountBalance) {
  this.accountBalance = accountBalance;
 }


 public String getBranch() {
  return branch;
 }

 public void setBranch(String branch) {
  this.branch = branch;
 }

 /*public String getSsn() {
  return ssn;
 }*/

 public void setSsn(String ssn) {
  this.ssn = ssn;
 }

    // Behaviour

    // create account
    // delete account
    // withdraw
    // balance transfer
 public void transferBalance(Account from, Account to, float balanceToBeTransferred){
  from.setAccountBalance(from.getAccountBalance() - balanceToBeTransferred);
  to.setAccountBalance(to.getAccountBalance()+balanceToBeTransferred);

  System.out.println("================== New Balance =====================");
  System.out.println(from.getAccountBalance());
  System.out.println(to.getAccountBalance());

 }


    // deposit

}

