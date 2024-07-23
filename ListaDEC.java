public class ListaDEC {
    Celula head;

    public ListaDEC() {
        Celula head = new Celula(-1);
        head.next = head;
        head.prev = head;
    }

    public boolean empty() {
        return (head.next == head);
    }

    public void inserAtEnding(Celula c) {
        if (empty()) {
            head.next = c;
            c.prev = head;
            c.next = head;
            head.prev = c;
        } else {
            Celula aux = head.prev;
            aux.next = c;
            head.prev = c;
            c.next = head;
            c.prev = aux;
        }
    }

    public void inserAtBeginning(Celula c) {
        Celula aux = head.next;
        head.next = c;
        c.next = head;
        head.prev = c;
        c.prev = head;

    }

    public Celula search(int value) {
        if (empty()) {
            return null;
        } else {
            int diff = (head.prev).value - value;
            int diff2 = (head.next).value - value;
            if (diff < diff2) {
                Celula aux = head.prev;
                while (aux != head && aux.value != value) {
                    aux = aux.prev;
                }
                return aux;
            } else {
                Celula aux = head.next;
                while (aux != head && aux.value != value) {
                    aux = aux.next;
                }
                return aux;
            }

        }
    }
}
