package EstruturaDeDados.PrincipaisImplementacoes.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args){
        Queue<Carro> filaCarros = new LinkedList<>();

        filaCarros.add(new Carro("Ford"));
        filaCarros.add(new Carro("Yamaha"));
        filaCarros.add(new Carro("Honda"));


        System.out.println(filaCarros);

        System.out.println(filaCarros.offer(new Carro("BYD")));


        System.out.println(filaCarros.peek().getMarca());
        System.out.println(filaCarros);


    }

}
