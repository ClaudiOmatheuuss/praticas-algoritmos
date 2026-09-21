public class ListaLigada implements EstruturaBasica {
    private No cabeca;

    public ListaLigada() {
        this.cabeca = null;
    }

    public void inserir(int valor) {
        No n = new No(valor);
        if (cabeca == null) {
            cabeca = n;
            return;
        }
        n.setProximo(cabeca);
        cabeca = n;
    }

    public boolean buscarElemento (int valor) {
        No n = cabeca;
        while (n != null) {
            if (n.getValor() == valor) {
                return true;
            }
            n = n.getProximo();
        }
        return false;
    }
}
