public class maquiagem extends visitableproducts {


  float preco;
  maquiagem(float preco) {
    super("Maquiagem", preco);
   this.preco = preco;
  }
 
  public float getPreco() {
    return preco;
  }

 float getPreco_com_Taxa(visitor_taxas tax, float taxa){
  return visitor_taxas.calculutetaxmaquiagem(this, taxa);
  }
 
}     
 