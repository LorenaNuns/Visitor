import java.util.ArrayList;

public class cliente {
  public static void main(String[] args) {
    visitableproducts make = new maquiagem(30f);
    visitableproducts roupa = new roupas(60f);
    visitableproducts em = new eletrodomesticos(100f);

    sultax sul = new sultax();

    nortetax norte = new nortetax();

   ArrayList<visitableproducts> cart = new ArrayList();
   cart.add(make);
   cart.add(roupa);
   cart.add(em);

   float total = make.getPreco() + roupa.getPreco() + em.getPreco();

   float total2 = make.getPreco_com_Taxa(sul, 0.5f) + roupa.getPreco_com_Taxa(sul, 1.5f) + em.getPreco_com_Taxa(sul, 2.5f);

   float total3 = make.getPreco_com_Taxa(norte, 0.2f) + roupa.getPreco_com_Taxa(norte, 0.5f) + em.getPreco_com_Taxa(norte, 1.0f);
   
   /*cart.reduce((sum, item) => item.getPreco() + sum,  0);*/

   System.out.println(total);
   System.out.println(total2);
   System.out.println(total3);
   

   /*for (int i = 0; i < cart.size(); i++) {
    System.out.println(cart.get(0));
    make = 45  (15)
    roupa = 90 (30)
    eletrodomestico = 250 (150)
   }*/

}
}

/*Criar condicionais não é viável, pois sempre terei q voltar nas classes pra alterar e viola  o principio de open e closure principle e single responsability principle*/