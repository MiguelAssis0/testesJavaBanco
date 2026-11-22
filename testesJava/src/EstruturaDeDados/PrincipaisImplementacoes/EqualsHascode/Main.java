package EstruturaDeDados.PrincipaisImplementacoes.EqualsHascode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Carro> carros = new ArrayList<>();


        carros.add(new Carro("Ford"));
        carros.add(new Carro("Honda"));
        carros.add(new Carro("Yamaha"));

        System.out.println(new Carro("Ford").hashCode());
    }

}
