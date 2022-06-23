public class eletrodomesticos extends visitableproducts {

  float preco;

  eletrodomesticos(float preco) {
    super("Eletrodomesticos", preco);
    this.preco = preco;
   
  }

  public float getPreco() {
    return preco;
  }

  float getPreco_com_Taxa(visitor_taxas tax, float taxa){
    return visitor_taxas.calculutetaxeletrodomesticos(this, taxa);
    }
  
 
}  
