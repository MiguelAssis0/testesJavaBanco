package EstruturaDeDados.ArvoreBinaria;

public class No<T extends Comparable<T>>{

    private T obj;
    private No<T> left;
    private No<T> right;

    public No(T obj){
        this.obj = obj;
        this.left = this.right = null;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public No<T> getLeft() {
        return left;
    }

    public void setLeft(No<T> left) {
        this.left = left;
    }

    public No<T> getRight() {
        return right;
    }

    public void setRight(No<T> right) {
        this.right = right;
    }
}
