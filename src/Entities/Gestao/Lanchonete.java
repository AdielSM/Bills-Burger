package Entities.Gestao;

import Entities.Itens.Acompanhamentos;
import Entities.Itens.Extras;
import Entities.Itens.Hamburguer;
import Entities.Itens.Refrigerante;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Lanchonete {
    private static final LinkedHashMap<String, Hamburguer> hamburgueres = new LinkedHashMap<>();
    private static final LinkedHashMap<String, Refrigerante> refrigerantes = new LinkedHashMap<>();
    private static final LinkedHashMap<String, Extras> extras = new LinkedHashMap<>();
    private static final LinkedHashMap<String, Acompanhamentos> acompanhamentos = new LinkedHashMap<>();

    public Lanchonete(){};

    public String selecionarItem(Scanner scanner, String tipoItem) {
        HashMap<String, ?> itens = switch (tipoItem) {
            case "Hamburguer" -> Lanchonete.hamburgueres;
            case "Refrigerante" -> Lanchonete.refrigerantes;
            case "Acompanhamento" -> Lanchonete.acompanhamentos;
            case "Extra" -> Lanchonete.extras;
            default -> throw new IllegalArgumentException("Tipo de item inválido");
        };

        switch (tipoItem) {
            case "Hamburguer" -> listarHambugueres();
            case "Refrigerante" -> listarRefrigerantes();
            case "Acompanhamento" -> listarAcompanhamentos();
            default -> listarExtras();
        }

        System.out.print("Selecione um " + tipoItem + " pelo Número > ");
        int count = 1;

        int opcao = scanner.nextInt();
        scanner.nextLine();

        while (opcao < 1 || opcao > itens.size()) {
            System.out.println("Opção inválida. Digite apenas o número do item desejado.");
            opcao = scanner.nextInt();
            scanner.nextLine();
        }

        return (String) itens.keySet().toArray()[opcao - 1];
    }

    public void fazerPedido(String Hamburguer, String Acompanhamentos, String Refrigerante, String Extras){
        Hamburguer hamburguer = getItem(Lanchonete.hamburgueres, Hamburguer, "Hamburguer não encontrado");
        Acompanhamentos acompanhamentos = getItem(Lanchonete.acompanhamentos, Acompanhamentos, "Acompanhamento não encontrado");
        Refrigerante refrigerante = getItem(Lanchonete.refrigerantes, Refrigerante, "Refrigerante não encontrado");
        Extras extras = getItem(Lanchonete.extras, Extras, "Extra não encontrado");

        Pedido pedido = new Pedido(hamburguer, acompanhamentos, refrigerante, extras);

        System.out.println(pedido.getInfoPedido());
    }

    public void fazerPedido(String Hamburguer, String Acompanhamentos, String Refrigerante){
        Hamburguer hamburguer = getItem(Lanchonete.hamburgueres, Hamburguer, "Hamburguer não encontrado");
        Acompanhamentos acompanhamentos = getItem(Lanchonete.acompanhamentos, Acompanhamentos, "Acompanhamento não encontrado");
        Refrigerante refrigerante = getItem(Lanchonete.refrigerantes, Refrigerante, "Refrigerante não encontrado");

        Pedido pedido = new Pedido(hamburguer, acompanhamentos, refrigerante);

        System.out.println(pedido.getInfoPedido());
    }

    private <T> T getItem(HashMap<String, T> map, String key, String errorMessage) {
        T item = map.get(key);
        if (item == null) {
            throw new RuntimeException(errorMessage);
        }
        return item;
    }

    protected void addHamburguer(String nome, String tamanho, double valor,String tipoCarne, String complementos){
        Lanchonete.hamburgueres.put(nome, new Hamburguer(nome, tamanho, valor, tipoCarne, complementos));
    }

    protected void addRefrigerante(String nome, String tamanho, double valor){
        Lanchonete.refrigerantes.put(nome, new Refrigerante(nome, tamanho, valor));
    }

    protected void addAcompanhamento(String nome, String tamanho, double valor){
        Lanchonete.acompanhamentos.put(nome, new Acompanhamentos(nome, tamanho, valor));
    }

    protected void addExtra(String nome, double valor){
        Lanchonete.extras.put(nome, new Extras(nome, valor));
    }
    public void listarCardapio(){
        listarHambugueres();
        listarRefrigerantes();
        listarAcompanhamentos();
        listarExtras();
    }

    public void listarHambugueres(){
        System.out.printf("\n%15s=== Hamburgueres === \n", " ");
        System.out.printf("%-10s %-20s %-10s %-10s%n", "Número", "Nome", "Tamanho", "Valor");
        int count = 1;
        for (String key : Lanchonete.hamburgueres.keySet()) {
            Hamburguer h = Lanchonete.hamburgueres.get(key);
            System.out.printf("%-10d %-20s %-10s %-10.2f%n", count, h.getNome(), h.getTamanho(), h.getValor());
            count++;
        }
    }

    public void listarRefrigerantes(){
        System.out.printf("\n%15s=== Refrigerantes === \n", " ");
        System.out.printf("%-10s %-20s %-10s %-10s%n", "Número", "Nome", "Tamanho", "Valor");
        int count = 1;
        for (String key : Lanchonete.refrigerantes.keySet()) {
            Refrigerante r = Lanchonete.refrigerantes.get(key);
            System.out.printf("%-10d %-20s %-10s %-10.2f%n", count, r.getNome(), r.getTamanho(), r.getValor());
            count++;
        }
    }

    public void listarAcompanhamentos(){
        System.out.printf("\n%15s=== Acompanhamentos === \n", " ");
        System.out.printf("%-10s %-20s %-10s %-10s%n", "Número", "Nome", "Tamanho", "Valor");
        int count = 1;
        for (String key : Lanchonete.acompanhamentos.keySet()) {
            Acompanhamentos a = Lanchonete.acompanhamentos.get(key);
            System.out.printf("%-10d %-20s %-10s %-10.2f%n", count, a.getNome(), a.getTamanho(), a.getValor());
            count++;
        }
    }

    public void listarExtras(){
        System.out.printf("\n%17s=== Adicionais === \n", " ");
        System.out.printf("%-10s %-20s %-10s %-10s%n", "Número", "Nome", "Tamanho", "Valor");
        int count = 1;
        for (String key : Lanchonete.extras.keySet()) {
            Extras e = Lanchonete.extras.get(key);
            System.out.printf("%-10d %-20s %-10s %-10.2f%n", count, e.getNome(), e.getTamanho(), e.getValor());
            count++;
        }
    }

}
