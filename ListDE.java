public class ListDE {

    Cell firstCell;

    public ListDE() {
        firstCell = null;
    }

    public boolean empty() {
        return (firstCell == null);
    }

    public void insertAtEnding(Cell c) {
        if (empty()) {
            firstCell = c;
        } else {
            Cell aux = firstCell;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = c;
            c.prev = aux;
        }
    }

    public void inserAtBeginning(Cell c) {
        if (!empty()) {
            c.next = firstCell;
            firstCell.prev = c;
        } else {
            firstCell = c;
        }
    }

    Cell search(int value) {
        if (empty()) {
            return null;
        } else {
            Cell aux = firstCell;
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
            Cell aux = firstCell;
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
            Cell aux = firstCell;
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
        Cell aux = firstCell;
        while (aux.next != null) {
            System.out.println("Valor: " + aux.value);
            aux = aux.next;
        }
    }
}
