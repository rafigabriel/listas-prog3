public class Row {
    Cell front;
    Cell back;

    public Row() {
        front = new Cell(-1);
        back = front;
        front.next = null;
    }

    public boolean empty() {
        return (back == front);
    }

    public void lineUp(Cell element) {
        back.next = element;
        back = back.next;
        back.next = null;
    }

    public Cell removeLast() throws Exception {
        Cell item = null;
        if (this.empty()) {
            throw new Exception("Error: Empty row.");
        }

        item = this.front.next;
        front.next = item.next;
        item.next = null;
        if (item == back) {
            back = front;
        }

        return item;
    }

    public void showAll(){
        if(empty()){
            System.out.println("There are no items to be shown.");
        }
        else{
            Cell aux = front.next;
            while (aux != null) {
                System.out.println("Element: " + aux.value);
                aux = aux.next;
            }
        }
    }
}
