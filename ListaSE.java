public class ListaSE{
    Celula firstCell;

    ListaSE() {
        firstCell = null;
    }

    public boolean empty() {
        return (firstCell == null);
    }

    public void inserAtBeginning(Celula c) {
        c.next = firstCell;
        firstCell = c;
    }

    public void impress() {
        Celula aux = firstCell;
        while (aux != null) {
            System.out.println("Value: " + aux.value);
            aux = aux.next;
        }

    }

    public void insertAtEnding(Celula c) {
        if(empty()){
            firstCell = c;
        }
        else{
            Celula aux = firstCell;
            while(aux.next != null){
                aux = aux.next;
            }
            aux.next = c;
        }
    }
       

    public void insertAtMiddle(Celula c) {
        Celula aux = firstCell;

    }

    public void removeAtEnding() {
        Celula aux = firstCell;
        if (empty()) {
            if (aux.next == null) {
                firstCell = null;
            } else {
                while (aux.next.next == null) {
                    aux = aux.next;
                }
                aux.next = null;
            }
        }
    }

    public void removeAtBeginning(){
        Celula aux = firstCell;
        if(!empty()){
            if(aux.next != null){
                firstCell = aux.next;
                aux = null;
            }
            else{
                firstCell = null;
            }
        }
    }

    public boolean search(int v){
        Celula aux = firstCell;
        if(!empty()){
           if(aux.value == v){
            System.out.println("oi");
            return true;
           }
           else{
            while(aux.next != null){
                if(aux.value == v){
                    System.out.println("oiii");
                    return true;
                }
                aux = aux.next;
            }
           }
        }
        System.out.println("nada");
        return false;
    }
}