package EstruturaDeDados.Listas.ListaDuplamenteEncadeada;

public class No<T> {
    private T obj;
    private No<T> next;
    private No<T> previus;

    public No(){
        this.next = null;
        this.previus = null;
    }

    public No(T obj){
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public No<T> getNext() {
        return next;
    }

    public void setNext(No<T> next) {
        this.next = next;
    }

    public No<T> getPrevius() {
        return previus;
    }

    public void setPrevius(No<T> previus) {
        this.previus = previus;
    }

    @Override
    public String toString() {
        return "No{" +
                "obj=" + obj +
                '}';
    }
}
