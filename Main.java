public class Main {
    public static void main(String[] args) {
        Celula c1 = new Celula(10);
        Celula c2 = new Celula(20);
        Celula c3 = new Celula(30);
        
        ListaSE listaSe = new ListaSE();

        listaSe.inserAtBeginning(c1);
        listaSe.inserAtBeginning(c2);
        listaSe.inserAtBeginning(c3);
        listaSe.impress();
        listaSe.search(40);
    }
}
