package EstruturaDeDados.Listas.ListasCirculares;

public class Main {
    public void main(String[] args){
        ListaCircular<Integer> lista = new ListaCircular<>();

        lista.add(213);
        lista.add(23423);
        lista.add(654645);
        lista.add(654645);

        System.out.println(lista.get(3));

        lista.remove(2);

        System.out.println(lista);
    }

}
