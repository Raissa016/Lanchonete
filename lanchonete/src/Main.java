import model.Cliente;
import model.Hamburguer;
import model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class  Main {
    public static void main(String[] args) {

        ArrayList<String> ingredienteList = new ArrayList<>();
        ingredienteList.add("pao");
        ingredienteList.add("Hamburguer");
        ingredienteList.add("bacon");
        ingredienteList.add("ovo");



        Hamburguer hamburguer = new Hamburguer (ingredienteList,23);

        System.out.println(hamburguer.getIngredientes());

        System.out.println("antes de tirar"+ hamburguer.getIngredientes());
        hamburguer.tiraringredientes("ovo");
        System.out.println("depois de tirar"+ hamburguer.getIngredientes());






    }
}





