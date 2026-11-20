package EstruturaDeDados.No;

public class Main {
    public static void main(String[] args){
        No<String> no1 = new No("conteudo nó 1");
        No<String> no2 = new No("Conteudo nó 2");

        no1.setNext(no2);

        No<String> no3 = new No("Cont");

        no2.setNext(no3);

        No<String> no4 = new No("Cont");

        no3.setNext(no4);

        System.out.println(no1);
        System.out.println(no1.getNext().getNext());
        System.out.println(no1.getNext().getNext().getNext());
        System.out.println(no1.getNext().getNext().getNext().getNext());
    }
}
