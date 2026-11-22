package EstruturaDeDados.ListaDuplamenteEncadeada;

import EstruturaDeDados.ListaEncadeada.ListaEncadeada;

public class ListaDupla<T> {
    private No<T> refFirstNo;
    private No<T> refLastNo;

    private static int listSize;

    public ListaDupla(){
        refFirstNo = null;
        refLastNo = null;
        this.listSize = 0;
    }

    public int size(){
        return this.listSize;
    }

    private No<T> getNo(int index){
        if(index > listSize) throw new IndexOutOfBoundsException("Índice inexistente");

        No<T> aux = refFirstNo;

        for (int i = 0; (i < index) && (aux != null); i++){
            aux = aux.getNext();
        }

        return aux;
    }

    public T get(int index){
        return this.getNo(index).getObj();
    }

    public void add(T obj){
        No<T> newNo = new No<>(obj);
        newNo.setNext(null);
        newNo.setPrevius(refLastNo);

        if(refFirstNo == null){
            refFirstNo = newNo;
        }
        if(refLastNo != null){
            refLastNo.setNext(newNo);
        }

        refLastNo = newNo;
        listSize++;
    }

    public void add(int index, T obj) {
        if (index < 0 || index > listSize) {
            throw new IndexOutOfBoundsException("Índice inexistente");
        }

        No<T> newNo = new No<>(obj);

        if (index == listSize) {
            add(obj);
            return;
        }

        No<T> aux = getNo(index);

        newNo.setNext(aux);
        newNo.setPrevius(aux.getPrevius());

        if (index == 0) {
            refFirstNo = newNo;
        } else {
            aux.getPrevius().setNext(newNo);
        }

        aux.setPrevius(newNo);

        listSize++;
    }

    public void remove(int index){
        No<T> obj = getNo(index);

        if(listSize == 1){
            refLastNo = null;
            refFirstNo = null;
            listSize--;
            obj.setObj(null);
            return;
        }

        if(index == 0){
            obj.getNext().setPrevius(null);
            refFirstNo = obj.getNext();
        }else if(index == listSize - 1){
            obj.getPrevius().setNext(null);
            refLastNo = obj.getPrevius();
        }else{
            obj.getPrevius().setNext(obj.getNext());
            obj.getNext().setPrevius(obj.getPrevius());
        }

        obj.setNext(null);
        obj.setPrevius(null);
        obj.setObj(null);
        listSize--;
    }

    @Override
    public String toString() {
        String str = "";

        No<T> aux = refFirstNo;

        for (int i = 0; i < size();i++){
            str += "[No{conteudo=" + aux.getObj() + "}] ->";
            aux = aux.getNext();
        }

        str += "null";

        return str;
    }
}
