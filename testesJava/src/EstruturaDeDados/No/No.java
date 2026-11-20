package EstruturaDeDados.No;

public class No<T> {

    private T conteudo;
    private No<T> next;

    public No(T conteudo){
        this.conteudo = conteudo;
        this.next = null;

    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
