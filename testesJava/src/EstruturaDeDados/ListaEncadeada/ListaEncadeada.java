package EstruturaDeDados.ListaEncadeada;

public class ListaEncadeada<T> {

    private No refEntry;


    public ListaEncadeada(){
        this.refEntry = null;
    }

    public boolean isEmpty(){
        return refEntry == null ? true : false;
    }

    public int size(){
        int size = 0;
        No<T> refAux = refEntry;

        while (refAux != null){
            size++;
            if(refAux.getNext() == null) break;
            refAux = refAux.getNext();
        }

        return size;
    }

    public void add(T obj){
        No<T> newNo = new No<>(obj);

        if(this.isEmpty()){
            refEntry = newNo;
            return;
        }

        No<T> noAux = refEntry;

        for (int i = 0; i < this.size() - 1; i++){
            noAux = noAux.getNext();
        }

        noAux.setNext(newNo);
    }

    private No<T> getNo(int index){
        if(index < 0 || index >= this.size()){
            throw new IndexOutOfBoundsException(
                    "Não existe conteúdo no índice: " + index
            );
        }

        No<T> noAux = refEntry;

        for(int i = 0; i < index; i++){
            noAux = noAux.getNext();
        }

        return noAux;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    public T remove(int index){
        No<T> pivot = this.getNo(index);
        if(index == 0){
            refEntry = pivot.getNext();
            return pivot.getConteudo();
        }

        No<T> anterior = getNo(index - 1);
        anterior.setNext(pivot.getNext());
        return pivot.getConteudo();
    }

    @Override
    public String toString() {
        String str = "";

        No<T> aux = refEntry;

        for (int i = 0; i < this.size();i++){
            str += " | " + aux.getConteudo() + " | ";

            aux = aux.getNext();
        }

        return str;
    }
}
