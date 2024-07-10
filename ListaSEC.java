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

    public void inserAtBegin(){
        
    }
}