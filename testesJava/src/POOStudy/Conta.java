package POOStudy;

public abstract class Conta {
    protected int agencia;
    protected int numero;
    protected double saldo = 0;
    protected Cliente cliente;
    protected Banco banco;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
    }

    void depositar(double valor){
        saldo += valor;
    }

    void sacar(double valor){
        if(valor > saldo){
            return;
        }

        saldo -= valor;
    }

    void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirExtrato(){
        System.out.println("=======================");
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d",this.numero));
        System.out.println(String.format("R$%.2f", this.saldo));
        System.out.println("=======================");
        System.out.println(" ");
    }


    public int getAgencia() {
        return agencia;
    }

    public double getSaldo(){
        return saldo;
    }

    public int getNumero() {
        return numero;
    }
}
