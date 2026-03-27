package model;

public class Pedido {

    private Cliente cliente;
    private Hamburguer ingredientes;
    //public  Preco1 hamburguer;


    public Pedido(Cliente cliente, Hamburguer ingredientes) {
        this.cliente = cliente;
        this.ingredientes = ingredientes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Hamburguer getHamburguer() {
        return ingredientes;
    }

    public void setHamburguer(Hamburguer ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getTudo() {
        return cliente.getNomeInteiro() + " " + ingredientes.getIngredientes();
    }



}




