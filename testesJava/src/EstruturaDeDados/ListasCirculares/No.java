package EstruturaDeDados.ListasCirculares;

public class No<T> {
    private T obj;
    private No<T> next;

    public No(T obj) {
        this.obj = obj;
        this.next = null;
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
}
