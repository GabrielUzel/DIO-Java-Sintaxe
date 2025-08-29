import model.BankAccount;
import java.util.Scanner;

public class BankTerminal {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Terminal de banco");
      System.out.println("----------------");
      
      System.out.println("Digite o número da conta:");
      int number = scanner.nextInt();
      scanner.nextLine();

      System.out.println("Digite a agência:");
      String agency = scanner.nextLine();

      System.out.println("Digite o nome do titular:");
      String accountHolder = scanner.nextLine();

      System.out.println("Digite o saldo inicial:");
      double balance = scanner.nextDouble();

      BankAccount account = new BankAccount(number, agency, accountHolder, balance);
      System.out.println(account.getAccount());
    }
  }
}
