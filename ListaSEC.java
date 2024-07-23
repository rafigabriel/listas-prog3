public class ListaSEC {
    Celula head;

    public ListaSEC() {
        Celula head = new Celula(-1);
        head.next = head;
    }

    public boolean empty() {
        return (head.next == head);
    }

    public void insertAtEnding(Celula c) {
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

    public void inserAtBeginning(Celula c) {
        Celula aux = head.next;
        head.next = c;
        c.next = aux;
    }
    
    public boolean removeAtBeginning() {
        if (empty()) {
            return false;
        } else {
            Celula aux = head.next;
            head.next = aux.next;
            aux.next = null;
            return true;
        }
    }

    public boolean removeAtEnding() {
        if (empty()) {
            return false;
        } else {
            Celula aux = head.next;
            if (aux.next != head) {
                while ((aux.next).next != head) {
                    aux = aux.next;
                }
                Celula aux2 = aux.next;
                aux.next = head;
                aux2.next = null;
                return true;
            } else {
                head.next = head;
                aux.next = null;
                return true;
            }
        }
    }
    
    public void impress() {
        Celula aux = head.next;
        while (aux != head) {
            System.out.println("Valor = " + aux.value);
            aux = aux.next;
        }
    }
}