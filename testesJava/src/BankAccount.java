public class BankAccount {

    private String name;
    private int accountNumber;
    private String agency;
    private double money;

    public BankAccount(String name, int accountNumber, String agency) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.agency = agency;
        this.money = 0;
    }

    public void sacar(double value) {
        if (!Double.isFinite(value) || value <= 0) {
            throw new IllegalArgumentException("Valor inválido!");
        }

        if (value > money) {
            throw new IllegalArgumentException("Saldo insuficiente!");
        }

        money -= value;
    }

    public void depositar(double value) {
        if (!Double.isFinite(value) || value <= 0) {
            throw new IllegalArgumentException("Valor inválido!");
        }

        money += value;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAgency() {
        return agency;
    }

    public double getMoney() {
        return money;
    }
}