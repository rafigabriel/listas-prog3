public class Main {
    public static void main(String[] args) {
        Cell c1 = new Cell(10);
        Cell c2 = new Cell(20);
        Cell c3 = new Cell(30);
        
        ListSE listaSe = new ListSE();

        listaSe.inserAtBeginning(c1);
        listaSe.inserAtBeginning(c2);
        listaSe.inserAtBeginning(c3);
        listaSe.impress();
        listaSe.search(40);
    }
}
