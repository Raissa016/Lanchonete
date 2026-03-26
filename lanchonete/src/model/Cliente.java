package model;

public class Cliente {

    private String Nome;
    private String Sobrenome;
    private String Preco1;

    public Cliente(String nome, String sobrenome) {
        Nome = nome;
        Sobrenome = sobrenome;
        Preco1 = Preco1;
    }

    public void Hello(){
        System.out.println("ola mundo");
    }
    public void Bye(){
        System.out.println("Bye Bye baby!");

    }
    public String getNomeInteiro(){
        return Nome + " " + Sobrenome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setPreco(String preco){ Preco1 = preco;}


}
