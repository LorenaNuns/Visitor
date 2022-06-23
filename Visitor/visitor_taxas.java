public interface visitor_taxas {
  public static float calculutetaxmaquiagem(maquiagem make, float tax) {
   
    return make.getPreco() + make.getPreco() * tax;
  }
  public static float calculutetaxroupas(roupas r, float tax){
    return r.getPreco() + r.getPreco() * tax;
  }
  public static float calculutetaxeletrodomesticos(eletrodomesticos em, float tax){
     return em.getPreco() + em.getPreco() * tax;
  }
}
