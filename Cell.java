public class Cell {
    public Cell(int value) {
        this.value = value;
        next = null;
    }

    int value;
    Cell next;
    Cell prev;
}