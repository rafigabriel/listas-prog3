public class Stack {
    Cell top;
    int quantity;

    public Stack() {
        top = null;
        quantity = 0;
    }

    public boolean empty() {
        return (top == null);
    }

    public void stackUp(Cell element) {
        element.next = top;
        top = element;
        quantity++;
    }

    public Cell unStack() {
        if (empty()) {
            System.out.println("There are no items to unstack.");
            return null;
        } else {
            Cell aux = top;
            top = top.next;
            aux.next = null;
            quantity--;
            return aux;
        }
    }

    public void removeAll() {
        top = null;
    }

    public void showAll() {
        if (empty()) {
            System.out.println("There are no items to be shown.");
        } else {
            Cell aux = top;
            while (aux != null) {
                System.out.println("Element: " + aux.value);
                aux = aux.next;
            }
        }
    }
}
