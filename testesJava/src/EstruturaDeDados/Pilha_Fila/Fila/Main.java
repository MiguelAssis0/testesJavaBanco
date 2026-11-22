package EstruturaDeDados.Pilha_Fila.Fila;

public class Main {
    public static void main(String[] args){
        Fila<Integer> minhaFila = new Fila();

        minhaFila.enqueue(1);
        minhaFila.enqueue(2);
        minhaFila.enqueue(3);
        minhaFila.enqueue(4);


        minhaFila.dequeue();

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

    }
}
