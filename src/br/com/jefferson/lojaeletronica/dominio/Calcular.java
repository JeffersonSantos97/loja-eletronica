package br.com.jefferson.lojaeletronica.dominio;

import java.util.List;

public class Calcular {

    // Calcular a média dos celulares
    public static double calcular(List<? extends Produto>list){

        double total = 0.0;

        for(int i = 0; i < list.size(); i++){

            total += list.get(i).preco;
        }

        return total / list.size();
    }

    // Listar os produtos

    public static void printarProdutos(List<? extends Produto>list){
        String nome;
        for(int i = 0; i < list.size() - 1; i++){

            nome = list.get(i).nome;
            System.out.println(nome);
            System.out.println("------");
        }
        if(list.size() > 0){

            nome = list.get(list.size()-1).nome;
            System.out.println(nome);
            System.out.println("FIM");
        }
    }

    // menor preco

    public static double menorPreco(List<? extends Produto>list) {

        double menor = Integer.MAX_VALUE;
        double preco = 0.0;
        for(int i = 0; i < list.size(); i++) {

            preco = list.get(0).preco;

            if(preco < menor){

                menor = preco;
            }
        }
        return menor;
    }
}
