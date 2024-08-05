public class ListSE {
    Cell firstCell;

    ListSE() {
        firstCell = null;
    }

    public boolean empty() {
        return (firstCell == null);
    }

    public void inserAtBeginning(Cell c) {
        c.next = firstCell;
        firstCell = c;
    }

    public void impress() {
        Cell aux = firstCell;
        while (aux != null) {
            System.out.println("Value: " + aux.value);
            aux = aux.next;
        }

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
        }
    }

    public void insertAtMiddle(Cell c) {
        Cell aux = firstCell;

    }

    public void removeAtEnding() {
        Cell aux = firstCell;
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

    public void removeAtBeginning() {
        Cell aux = firstCell;
        if (!empty()) {
            if (aux.next != null) {
                firstCell = aux.next;
                aux = null;
            } else {
                firstCell = null;
            }
        }
    }

    public boolean search(int v) {
        Cell aux = firstCell;
        if (!empty()) {
            if (aux.value == v) {
                System.out.println("oi");
                return true;
            } else {
                while (aux.next != null) {
                    if (aux.value == v) {
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