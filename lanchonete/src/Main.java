import model.Cliente;
import model.Hamburguer;
import model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class  Main {
    public static void main(String[] args) {

        ArrayList<String> ingredienteList = new ArrayList<String>();
        ingredienteList.add("pao");
        ingredienteList.add("Hamburguer");
        ingredienteList.add("bacon");
        ingredienteList.add("ovo");

        ArrayList<String> preco1 = new ArrayList<>();
        preco1.add("35,00");
        

        ingredienteList.remove("pao");
        System.out.println(ingredienteList);



        Cliente cliente = new Cliente("Raissa","Gabriela");
        Hamburguer hamburguer = new Hamburguer (ingredienteList);


        Pedido pedido1 = new Pedido(cliente, hamburguer);
        System.out.println(hamburguer.getIngredientes());





    }
}





