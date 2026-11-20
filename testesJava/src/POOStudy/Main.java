package POOStudy;

public class Main {
    public void main(String[] args){
        Banco banco = new Banco("Santander");

        Cliente c1 = new Cliente("Jorge");
        Cliente c2 = new Cliente("Matheus");

        Conta cc = criarNovaContaCorrente(c1, banco);
        Conta cp = criarNovaContaPoupanca(c2, banco);


        cc.depositar(1000.00);
        cc.transferir(234.00, cp);

        cp.sacar(110.00);

        cp.imprimirExtrato();
        cc.imprimirExtrato();

        banco.listarTodasContas();
    }

    private Conta criarNovaContaCorrente(Cliente c, Banco b){
        Conta conta = new ContaCorrente(c, b);
        adicionarNoBanco(conta, b);
        return conta;
    }

    private Conta criarNovaContaPoupanca(Cliente c, Banco b){
        Conta conta = new ContaCorrente(c, b);
        adicionarNoBanco(conta, b);
        return conta;
    }

    void adicionarNoBanco(Conta conta, Banco b){
        b.setContas(conta);
    }
}
