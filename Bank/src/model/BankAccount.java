package model;

public class BankAccount {
  private int number;
  private String agency;
  private String accountHolder;
  private double balance;

  public BankAccount(int number, String agency, String accountHolder, double initialBalance) {
    this.number = number;
    this.agency = agency;
    this.accountHolder = accountHolder;
    this.balance = initialBalance;
  }

  public String getAccount() {
    return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", accountHolder, agency, number, balance);
  }
}
