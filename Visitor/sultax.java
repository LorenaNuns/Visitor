public class sultax implements visitor_taxas {
  
  
  public float calculutetaxmaquiagem(maquiagem  make, float tax){
    return make.getPreco() + make.getPreco() * tax;
  }
  public  float calculutetaxroupas(roupas r, float tax){
    return r.getPreco() + r.getPreco() * tax;

  }
  public float calculutetaxeletrodomesticos(eletrodomesticos em, float tax){
    return em.getPreco() + em.getPreco() * tax;
  }

}
