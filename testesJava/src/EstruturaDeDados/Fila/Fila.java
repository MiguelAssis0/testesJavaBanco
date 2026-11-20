package EstruturaDeDados.Fila;

public class Fila<T> {

    private No<T> refEntry;

    public Fila(){
        this.refEntry = null;
    }

    public void enqueue(T content){
        No newNo = new No(content);
        newNo.setRefNo(refEntry);
        refEntry = newNo;
    }

    public T dequeue() {
        if (isEmpty()) return null;

        No firstNo = refEntry;
        No previousNo = null;

        while (firstNo.getRefNo() != null) {
            previousNo = firstNo;
            firstNo = firstNo.getRefNo();
        }

        if (previousNo == null) {
            refEntry = null;
        } else {
            previousNo.setRefNo(null);
        }

        return (T) firstNo.getObject();
    }

    public T first(){
        if(isEmpty()) return null;

        No firstNo = refEntry;
        while (true){
            if(firstNo.getRefNo() != null){
                firstNo = firstNo.getRefNo();
            }else{
                break;
            }
        }

        return (T) firstNo.getObject();
    }

    public boolean isEmpty(){
        return refEntry == null ? true : false;
    }

    @Override
    public String toString(){
        String stringReturn = "";
        No aux = refEntry;

        if(refEntry == null) stringReturn = "null";

        stringReturn += "--------\n";

        while (aux != null){
            stringReturn += "[No{Object=" + aux + "}]-->";
            aux =aux.getRefNo();
        }

        return stringReturn;
    }
}
