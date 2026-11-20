package EstruturaDeDados.ListaEncadeada;

public class Main {
    public static void main(String[] args){
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.add("1");
        lista.add("2");
        lista.add("3");

        lista.remove(1);

        System.out.println(lista);
        System.out.println(lista.get(0));
    }
}
