package br.com.jefferson.lojaeletronica.dominio;

public class Fone extends Produto{

    private String cor;

    public Fone(String nome, double preco, int qtdEstoque, String cor){

        super(nome,preco,qtdEstoque);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
