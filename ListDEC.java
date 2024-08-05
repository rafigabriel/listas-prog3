public class ListDEC {
    Cell head;

    public ListDEC() {
        Cell head = new Cell(-1);
        head.next = head;
        head.prev = head;
    }

    public boolean empty() {
        return (head.next == head);
    }

    public void inserAtEnding(Cell c) {
        if (empty()) {
            head.next = c;
            c.prev = head;
            c.next = head;
            head.prev = c;
        } else {
            Cell aux = head.prev;
            aux.next = c;
            head.prev = c;
            c.next = head;
            c.prev = aux;
        }
    }

    public void inserAtBeginning(Cell c) {
        Cell aux = head.next;
        head.next = c;
        c.next = head;
        head.prev = c;
        c.prev = head;

    }

    public Cell search(int value) {
        if (empty()) {
            return null;
        } else {
            int diff = (head.prev).value - value;
            int diff2 = (head.next).value - value;
            if (diff < diff2) {
                Cell aux = head.prev;
                while (aux != head && aux.value != value) {
                    aux = aux.prev;
                }
                return aux;
            } else {
                Cell aux = head.next;
                while (aux != head && aux.value != value) {
                    aux = aux.next;
                }
                return aux;
            }

        }
    }
}
