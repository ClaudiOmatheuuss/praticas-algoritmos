public interface EstruturaBasica{
  //Métodos Consultivos
  public boolean buscaElemento(int valor);
  public int minimo();
  public int maximo();

  //Metodos Modificadores
  public void inserir(int valor);
  public void remover(int valor);
}
