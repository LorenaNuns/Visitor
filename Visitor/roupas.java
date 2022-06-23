public class roupas extends visitableproducts {

  float preco;
  roupas(float preco) {
    super("roupas", preco);
    this.preco = preco;
  }
  
  public float getPreco() {
    return preco;
  }
 
  float getPreco_com_Taxa(visitor_taxas tax, float taxa){
    return visitor_taxas.calculutetaxroupas(this, taxa);
    }
}  
