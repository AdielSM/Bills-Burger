package Entities.Gestao;

import Entities.Itens.Acompanhamentos;
import Entities.Itens.Extras;
import Entities.Itens.Hamburguer;
import Entities.Itens.Refrigerante;

import java.util.HashMap;

public class Lanchonete {
    private static HashMap<String, Hamburguer> hamburgueres = new HashMap<>();
    private static HashMap<String, Refrigerante> refrigerantes = new HashMap<>();
    private static HashMap<String, Extras> extras = new HashMap<>();
    private static HashMap<String, Acompanhamentos> acompanhamentos = new HashMap<>();

    public Lanchonete(){};

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

    protected void addAcompanhamentos(String nome, String tamanho, double valor){
        Lanchonete.acompanhamentos.put(nome, new Acompanhamentos(nome, tamanho, valor));
    }

    protected void addExtras(String nome, String tamanho, double valor){
        Lanchonete.extras.put(nome, new Extras(nome, valor));
    }

}
