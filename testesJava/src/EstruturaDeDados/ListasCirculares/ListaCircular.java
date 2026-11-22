package EstruturaDeDados.ListasCirculares;

public class ListaCircular<T> {
    private No<T> refEntry;
    private No<T> refFinal;
    private int listSize;

    public ListaCircular(){
        this.refEntry = null;
        this.refFinal = null;
        this.listSize = 0;
    }

    private No<T> getNo(int index){
        if (index < 0 || index >= listSize) {
            throw new IndexOutOfBoundsException("Elemento inexistente");
        }

        if (index == 0) return refEntry;
        if (index == listSize - 1) return refFinal;

        No<T> aux = refEntry;

        for(int i = 0; i < index; i++){
            aux = aux.getNext();
        }

        return aux;
    }

    public T get(int index){
        return getNo(index).getObj();
    }

    public void add(T obj){
        No<T> newNo = new No<>(obj);

        if(refEntry == null){
            refEntry = newNo;
            refFinal = newNo;
            newNo.setNext(newNo);
        }else{
            refFinal.setNext(newNo);
            newNo.setNext(refEntry);
            refFinal = newNo;
        }

        listSize++;
    }

    public void remove(int index){
        if (index < 0 || index >= listSize) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        No<T> remove = getNo(index);

        if(listSize == 1){
            refFinal = null;
            refEntry = null;
        }else if(index == 0){
            refEntry = remove.getNext();
            refFinal.setNext(remove.getNext());
        }else if(index < listSize - 1){
            No<T> previus = getNo(index - 1);
            previus.setNext(remove.getNext());
        }else{
            No<T> previus = getNo(index - 1);
            previus.setNext(refEntry);
            refFinal = previus;
        }

        listSize--;
    }

    public boolean isEmpty(){
        return refEntry == null;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        No<T> aux = refEntry;

        for (int i = 0; i < listSize;i++){
            str.append(" | ")
                .append(aux.getObj())
                    .append(" | ");


            aux = aux.getNext();
        }

        return str.toString();
    }

}
