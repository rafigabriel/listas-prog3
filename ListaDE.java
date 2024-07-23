public class ListaDE {
    
    Celula firstCell;

    public ListaDE() {
        firstCell = null;
    }

    public boolean empty() {
        return (firstCell == null);
    }

    public void insertAtEnding(Celula c) {
        if (empty()) {
            firstCell = c;
        } else {
            Celula aux = firstCell;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = c;
            c.prev = aux;
        }
    }
    
    public void inserAtBeginning(Celula c) {
        if (!empty()) {
            c.next = firstCell;
            firstCell.prev = c;
        } else {
            firstCell = c;
        }
    }
    
    Celula search(int value) {
        if (empty()) {
            return null;
        } else {
            Celula aux = firstCell;
            while (aux.next != null && aux.value != value) {
                aux = aux.next;
            }
            return aux;
        }
    }
    
    public boolean removeAtBeginning() {
        if (empty()) {
            return false;
        } else {
            Celula aux = firstCell;
            if (aux.next == null) {
                firstCell = null;
            } else {
                firstCell = aux.next;
                firstCell.prev = null;
                aux.next = null;
            }
            return true;
        }
    }
    
    public boolean removeAtEnding() {
        if (empty()) {
            return false;
        } else {
            Celula aux = firstCell;
            while (aux.next != null) {
                aux = aux.next;
            }

            if (aux.prev != null) {
                (aux.prev).next = null;
            }
            aux.prev = null;
            return true;
        }
    }
    
    public void impress() {
        Celula aux = firstCell;
        while (aux.next != null) {
            System.out.println("Valor: " + aux.value);
            aux = aux.next;
        }
    }
}
