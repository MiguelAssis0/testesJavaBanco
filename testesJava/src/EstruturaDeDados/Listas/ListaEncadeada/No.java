package EstruturaDeDados.Listas.ListaEncadeada;

public class No<T> {

    private T conteudo;
    private No next;

    public No(){
        next = null;
    }

    public No(T conteudo){
        this.next = null;
        this.conteudo = conteudo;
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
                "conteudo=" + conteudo +
                '}';
    }

    public String toStringEncadeado(){
        String str = "No{" +
                "conteudo=" + conteudo +
                '}';

        if(next != null){
            str += "-> " + next.toString();
        }else{
            str += "-> null";
        }

        return str;
    }
}
