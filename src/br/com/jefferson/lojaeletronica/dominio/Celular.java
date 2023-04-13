package br.com.jefferson.lojaeletronica.dominio;

public class Celular extends Produto{

    private String memoria;

    public Celular(String nome, double price, int qtdEstoque, String memoria){

        super(nome,price,qtdEstoque);
        this.memoria = memoria;

    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }


}
