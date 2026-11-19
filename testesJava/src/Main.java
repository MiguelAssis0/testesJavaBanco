import java.util.Arrays;

import static java.util.Locale.US;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        BankAccount account = null;

        int option;

        do {
            option = Selection(scanner);

            switch (option) {
                case 1:
                    account = RegisterData(scanner);
                    break;

                case 2:
                    if (account == null) {
                        System.out.println("Cadastre uma conta primeiro!");
                        break;
                    }

                    System.out.println("Digite o valor para sacar:");
                    double withdrawValue = scanner.nextDouble();

                    try {
                        account.sacar(withdrawValue);
                        System.out.println("Saque realizado com sucesso!");
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 3:
                    if (account == null) {
                        System.out.println("Cadastre uma conta primeiro!");
                        break;
                    }

                    System.out.println("Digite o valor para depositar:");
                    double depositValue = scanner.nextDouble();

                    try {
                        account.depositar(depositValue);
                        System.out.println("Depósito realizado com sucesso!");
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 4:
                    ViewData(account);
                    break;

                case 5:
                    System.out.println("Encerrando sistema...");
                    break;
            }

        } while (option != 5);

        scanner.close();
    }

    public static int Selection(Scanner scanner) {
        int option;

        do {
            System.out.println("""
            
            ===== SISTEMA BANCÁRIO =====
            1 - Cadastrar Dados
            2 - Sacar
            3 - Depositar
            4 - Visualizar Dados
            5 - Sair
            
            Escolha uma opção:
            """);

            if (!scanner.hasNextInt()) {
                System.out.println("Digite um número válido!");
                scanner.nextLine();
                option = 0;
                continue;
            }

            option = scanner.nextInt();

            if (option < 1 || option > 5) {
                System.out.println("Opção inválida!");
            }

        } while (option < 1 || option > 5);

        return option;
    }

    public static BankAccount RegisterData(Scanner scanner) {
        scanner.nextLine();

        System.out.println("Digite o nome:");
        String name = scanner.nextLine();

        System.out.println("Digite o número da conta:");
        int accountNumber = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o nome da agência:");
        String agency = scanner.nextLine();

        BankAccount newAccount = new BankAccount(
                name,
                accountNumber,
                agency
        );

        System.out.println("Conta criada com sucesso!");
        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + accountNumber + " e seu saldo R$" + newAccount.getMoney() + " já está disponível para saque");
        return newAccount;
    }

    public static void ViewData(BankAccount account) {
        if (account == null) {
            System.out.println("Nenhuma conta cadastrada!");
            return;
        }

        System.out.println("""
        
        ===== DADOS BANCÁRIOS =====
        """);

        System.out.println("Nome: " + account.getName());
        System.out.println("Conta: " + account.getAccountNumber());
        System.out.println("Agência: " + account.getAgency());
        System.out.printf("Saldo: R$ %.2f%n", account.getMoney());
    }

}
