import java.util.ArrayList;

public class Fila {
    private ArrayList<Integer> fila = new ArrayList<>();

    public boolean isEmpty () {
        return fila.isEmpty();
    }

    public void enqueue(int n) {
        fila.add(n);
        System.out.println("Elemento " + "{" + n + "}" + " adicionado a fila: \n >> " + fila);
    }

    public int dequeue () {
        return (int)fila.removeFirst();
    }


    public static void main(String[] args) {
        Fila f = new Fila();
        f.enqueue(2);
        f.enqueue(6);
        f.dequeue();
        f.enqueue(2);
    }
}
