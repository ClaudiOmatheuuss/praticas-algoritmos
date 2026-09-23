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

    public void remover(int valor) {
        No n = cabeca;
        
        if (n == null) {return;}

        if (n.getValor() == valor) {
            cabeca = n.getProximo();
            return;
        }
        No i = null;
        while (n != null) {
            if(n.getValor() == valor) {
                i.setProximo(n.getProximo());
                return;
            }
            i = n;
            n = n.getProximo();
        }
    }

    public void removeDuplicados() {
        No n = cabeca;
        while ( n != null ) {

            No m = n;
            No i = m.getProximo();
            
            while (i != null) {

                if(n.getValor() == i.getValor()) {
                    m.setProximo(i.getProximo());
                    i = m.getProximo();
                } else {
                    m = i;
                    i = i.getProximo();
                }                
            }
            n = n.getProximo();
        }

        // No a = cabeca;
        // while (a != null) {
        //     System.out.println(a.getValor());
        //     a = a.getProximo();
        // }
    }
}
