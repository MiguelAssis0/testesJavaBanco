package EstruturaDeDados.ArvoreBinaria;

public class BinaryTree<T extends Comparable<T>> {

    private No<T> raiz;

    public BinaryTree(){
        this.raiz = null;
    }

    public void insert(T obj){
        No<T> newNo = new No<>(obj);
        this.raiz = insert(raiz, newNo);
    }

    private No<T> insert(No<T> current, No<T> newNo){
        if(current == null){
            return newNo;
        }else if(newNo.getObj().compareTo(current.getObj()) < 0){
            current.setLeft(insert(current.getLeft(), newNo));
        }else{
            current.setLeft(insert(current.getRight(), newNo));
        }

        return current;
    }

    public void showInOrder(){
        System.out.println("\n Showing in order");
        showInOrder(this.raiz);
    }

    private void showInOrder(No<T> current){
        if(current != null){
            showInOrder(current.getLeft());
            System.out.println(current.getObj() + ",");
            showInOrder(current.getRight());
        }
    }

    public void showPosOrder(){
        System.out.println("\n Showing pos order");
        showPosOrder(this.raiz);
    }

    private void showPosOrder(No<T> current){
        if(current != null){
            showPosOrder(current.getLeft());
            showPosOrder(current.getRight());
            System.out.println(current.getObj() + ",");
        }
    }

    public void showPreOrder(){
        System.out.println("\n Showing pre order");
        showPosOrder(this.raiz);
    }

    private void showPreOrder(No<T> current){
        if(current != null){
            System.out.println(current.getObj() + ",");
            showPreOrder(current.getLeft());
            showPreOrder(current.getRight());
        }
    }

    public void remove(T obj){
        try{
            No<T> current = this.raiz;
            No<T> father = null;
            No<T> children = null;
            No<T> temp = null;

            while(current != null && !current.getObj().equals(current)){
                father = current;
                if(obj.compareTo(current.getObj()) < 0){
                    current = current.getLeft();
                }else{
                    current = current.getRight();
                }
            }

            if(current == null){
                throw new NullPointerException();
            }

            if(father == null){
                if(current.getRight() == null){
                    this.raiz = current.getLeft();
                }else if(current.getLeft() == null){
                    this.raiz = current.getRight();
                }else{
                    for (temp = current, children = current.getLeft();
                    children.getRight() != null;
                    temp = children, children = children.getLeft()
                    ){
                        if(children != current.getLeft()){
                            temp.setRight(children.getLeft());
                            children.setLeft(raiz.getLeft());
                        }
                    }

                    children.setRight(raiz.getRight());
                    raiz = children;
                }
            }else if(current.getRight() == null){
                if(father.getLeft() == current){
                    father.setLeft(current.getLeft());
                }else{
                    father.setRight(current.getLeft());
                }
            }else if(current.getLeft() == null){
                if(father.getLeft() == current){
                    father.setLeft(current.getRight());
                }else{
                    father.setRight(current.getRight());
                }
            }else{
                for (
                        temp = current, children = current.getLeft();
                        children.getRight() != null;
                        temp = children, children = children.getRight()
                ){
                    if(children != current.getLeft()){
                        temp.setRight(children.getLeft());
                        children.setLeft(current.getLeft());
                    }

                    children.setRight(current.getRight());

                    if(father.getLeft() == current){
                        father.setLeft(children);
                    }else{
                        father.setRight(children);
                    }
                }
            }


        }catch (NullPointerException ex){
            System.out.println("Element not found");
        }
    }
}
