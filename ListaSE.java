public class ListaSE {
    Celula firstCell;

    ListaSE() {
        firstCell = null;
    }

    public boolean empty() {
        return (firstCell == null);
    }

    public void inserAtBegin(Celula c) {
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

    public void insertAtEnd(Celula c) {
        if (empty()) {
            firstCell = c;
        } else {
            Celula aux = firstCell;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = c;
        }
    }

    public void insertAtMiddle(Celula c) {
        Celula aux = firstCell;

    }

    public void removeAtEnd() {
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

    public void removeAtBegin() {
        Celula aux = firstCell;
        if (!empty()) {
            if (aux.next != null) {
                firstCell = aux.next;
                aux = null;
            } else {
                firstCell = null;
            }
        }
    }

    Celula search(int value) {
        if (empty()) {
            return null;
        } else {
            Celula aux = firstCell;
            while (aux != null && aux.value != value) {
                aux = aux.next;
            }

            return aux;
        }
    }
}