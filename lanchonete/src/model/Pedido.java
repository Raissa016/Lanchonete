package model;

public class Pedido {

    private Cliente cliente;
    private Hamburguer ingredientes;
  //  public Preco valor;


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
  public String getTudo(){
        return cliente.getNomeInteiro() +" "+ ingredientes.getIngredientes();
  }

   // public Preco getValor() {
    //    return valor;
    }

    //public void setValor(Preco valor) {
        //this.valor = valor;
  //  }

