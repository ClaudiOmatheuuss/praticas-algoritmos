public class ListaArray implements EstruturaBasica {
  private int[] elementos;
  private int tamanho;

  public ListaArray() {
    elementos = new int[1000];
    tamanho = 0;
  }

  @Override
  public boolean buscaElemento(int valor) {
    for (int i = 0; i < tamanho; i++) {
      if (elementos[i] == valor) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int minimo() {
    int min = elementos[0];
    for (int i = 1; i < tamanho; i++) {
      if (elementos[i] < min) {
        min = elementos[i];
      }
    }
    return min;
  }

  @Override
  public int maximo() {
    int max = elementos[0];
    for (int i = 1; i < tamanho; i++) {
      if (elementos[i] > max) {
        max = elementos[i];
      }
    }
    return max;
  }

  @Override
  public void inserir(int valor) {
    if (tamanho >= elementos.length) {
      throw new IllegalStateException("Lista cheia");
    }
    elementos[tamanho++] = valor;
  }

  @Override
  public void remover(int valor) {
    for (int i = 0; i < tamanho; i++) {
      if (elementos[i] == valor) {
        elementos[i] = elementos[tamanho - 1];
        tamanho--;
        return;
      }
    }
  }
}
