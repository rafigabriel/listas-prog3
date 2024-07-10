public class ListaSEC {
    Celula head;

    public ListaSEC() {
        Celula head = new Celula(-1);
        head.next = head;
    }

    public boolean empty() {
        return (head.next == head);
    }

    public void insertAtEnd(Celula c) {
        if (empty()) {
            head.next = c;
            c.next = head;
        } else {
            Celula aux = head.next;
            while (aux.next != head) {
                aux = aux.next;
            }
            aux.next = c;
            c.next = head;
        }
    }

    public void inserAtBegin(Celula c) {
        Celula aux = head.next;
        head.next = c;
        c.next = aux;
    }

    Celula search(int value) {
        if (empty()) {
            return null;
        } else {
            Celula aux = head.next;

            while (aux != head && aux.value != value) {
                aux = aux.next;
            }

            if (aux == head) {
                return null;
            }

            return aux;
        }
    }
}