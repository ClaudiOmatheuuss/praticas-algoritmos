import java.util.ArrayList;

public class FilaDePrioridade {
    public ArrayList<Integer> fila = new ArrayList<>();
    public ArrayList<Integer> filaPrior = new ArrayList<>();


    public boolean isEmpty () {
        return fila.size() == 0 && filaPrior.size() == 0;
    }

    public void enqueue(int n) {
        fila.add(n);
    }

    public void priorEnqueue(int n) {
        filaPrior.add(n);
    }

    public int dequeue () {
        if (filaPrior.size() == 0) {
            return fila.removeFirst();
        }

        return filaPrior.removeFirst();
    }


    public static void main(String[] args) {
        FilaDePrioridade f = new FilaDePrioridade();
        f.enqueue(2);
        f.enqueue(6);
        f.enqueue(4);
        f.dequeue();
        
        f.priorEnqueue(9);
        f.priorEnqueue(7);
        f.priorEnqueue(100);
        f.dequeue();
        f.dequeue();

        System.out.println("___________________________");
        System.out.println("FILA PRIORIDADE \n >>> " + f.filaPrior);
        System.out.println("FILA \n >>> " + f.fila);
        System.out.println("___________________________");
    }
}
