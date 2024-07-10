public class Main {
    public static void main(String[] args) {
        Celula c1 = new Celula(10);
        Celula c2 = new Celula(20);
        Celula c3 = new Celula(30);
        
        ListaSE listaSe = new ListaSE();

        listaSe.inserAtBegin(c1);
        listaSe.inserAtBegin(c2);
        listaSe.inserAtBegin(c3);
        listaSe.impress();
        listaSe.search(40);
    }
}
