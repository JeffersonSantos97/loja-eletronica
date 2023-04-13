package br.com.jefferson.lojaeletronica.dominio;

public class Laptop extends Produto{

    private String sistemaOperacional;

    public Laptop(String nome, double preco, int qtdEstoque,String sistemaOperacional){

        super(nome, preco,qtdEstoque);
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
}
