package br.com.jefferson.lojaeletronica.teste;

import br.com.jefferson.lojaeletronica.dominio.Calcular;
import br.com.jefferson.lojaeletronica.dominio.Celular;
import br.com.jefferson.lojaeletronica.dominio.Fone;
import br.com.jefferson.lojaeletronica.dominio.Laptop;

import java.util.ArrayList;
import java.util.List;

public class LojaEletronica {

    public static void main(String[] args) {

        List<Celular> celulares = new ArrayList<>();

        celulares.add(new Celular("Galaxy123",1880.50,100,"164GB"));
        celulares.add(new Celular("Xiaomi-LXP",2500.74, 900,"64GB"));
        celulares.add(new Celular("Moto G12", 3450.99,20,"164GB"));
        System.out.println("--- Celular ---");
        System.out.printf("Média: %.2f%n",Calcular.calcular(celulares));
        System.out.println("Menor Preco: " + Calcular.menorPreco(celulares));

        System.out.println(); // pular uma linha

        List<Fone> fones = new ArrayList<>();
        fones.add(new Fone("LX-PBC",164.50,150,"Branco"));
        fones.add(new Fone("MotorolaG50", 1200.00, 500, "Preto"));
        fones.add(new Fone("Beat254X", 18000,10, "Preto"));
        System.out.println("--- Fone ---");

        System.out.printf("Média: %.2f%n",Calcular.calcular(fones));
        System.out.println("Menor preco: "+Calcular.menorPreco(fones));

        System.out.println(); // pular uma linha

        List<Laptop> laptops = new ArrayList<>();

        laptops.add(new Laptop("SamsungBX", 12900,100, "Linux Ubuntu"));
        laptops.add(new Laptop("Dell14X", 14000.78, 500, "Windows 10"));
        laptops.add(new Laptop("MacroX", 2000.90,1800, "Linux Mint"));

        System.out.println("--- Laptop ---");
        System.out.printf("Média: %.2f%n",Calcular.calcular(celulares));
        System.out.println("Menor Preco" + Calcular.menorPreco(fones));
        System.out.println(); // pular uma linha

    }
}