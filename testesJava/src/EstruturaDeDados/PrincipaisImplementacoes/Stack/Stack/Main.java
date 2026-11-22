package EstruturaDeDados.PrincipaisImplementacoes.Stack.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Yamaha"));
        stackCarros.push(new Carro("BYD"));

        System.out.println(stackCarros);

        stackCarros.pop();

        System.out.println(stackCarros);

        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty());
    }

}
