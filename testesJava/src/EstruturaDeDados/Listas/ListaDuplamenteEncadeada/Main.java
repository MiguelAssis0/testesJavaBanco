package EstruturaDeDados.Listas.ListaDuplamenteEncadeada;

public class Main {

    public static void main(String[] args){
        ListaDupla<Integer> list = new ListaDupla<>();

        list.add(1);
        list.add(2);
        list.add(0, 100);

        list.remove(1);

        System.out.println(list);
    }
}
