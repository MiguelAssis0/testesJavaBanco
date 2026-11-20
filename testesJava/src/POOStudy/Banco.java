package POOStudy;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private static List<Conta> contas = new ArrayList<>() {
    };

    public Banco(String nome){
        this.nome = nome;
    }

    public void setContas(Conta conta) {
        this.contas.add(conta);
    }

    public void listarTodasContas(){
        System.out.println("=======================");
        System.out.println(String.format("Cliente: %s", this.nome));
        System.out.println("Contas:");
        for (int i = 0; i < contas.toArray().length; i++){
            System.out.println("=======");
            System.out.println(contas.get(i).cliente.getNome());
            if (contas.get(i) instanceof ContaCorrente) {
                System.out.println("Conta Corrente");
            }else{
                System.out.println("Conta Poupança");
            }
            System.out.println("=======");
        }
        System.out.println("=======================");
        System.out.println(" ");
    }
}
