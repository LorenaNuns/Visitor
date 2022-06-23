public abstract class visitableproducts {
  String nome;
  float preco;

  visitableproducts(String nome, float preco) {
  }

  public float getPreco() {
    return preco;
  }

  public String getNome() {
    return nome;
  }

  abstract float getPreco_com_Taxa(visitor_taxas tax, float taxa);

}