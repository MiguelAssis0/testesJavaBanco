package EstruturaDeDados.Pilha_Fila.Pilha;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha(){
        this.refNoEntradaPilha = null;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(isEmpty()) return null;

        No noPoped = refNoEntradaPilha.getRefNo();
        refNoEntradaPilha = refNoEntradaPilha.getRefNo();
        return noPoped;
    }

    @Override
    public String toString(){
        String stringRetorno = "------------\n";
        stringRetorno += "    Pilha\n";
        stringRetorno += "------------\n";

        No noAux = refNoEntradaPilha;

        while (noAux != null){

            stringRetorno += "[No{dado=" +noAux.getDado() + "}]\n";
            noAux = noAux.getRefNo();
        }

        stringRetorno += "------------\n";
        return stringRetorno;

    }
}
