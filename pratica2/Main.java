public class Main {
  public static void main(String[] args) {
    EstruturaBasica e = new ListaArray();
    e.inserir(0);
    e.inserir(1);
    e.inserir(2);
    e.inserir(3);
    // e.remover(2);
    System.out.println(e.buscaElemento(2)); // false
    System.out.println(e.buscaElemento(3)); // true
    // System.out.println(e.minimo()); // 0
    // System.out.println(e.maximo()); // 3
  }
}