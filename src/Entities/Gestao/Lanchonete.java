package Entities.Gestao;

import Entities.Itens.Acompanhamentos;
import Entities.Itens.Extras;
import Entities.Itens.Hamburguer;
import Entities.Itens.Refrigerante;

import java.util.HashMap;

public class Lanchonete {
    private final HashMap<String, Hamburguer> hamburgueres = new HashMap<>();
    private final HashMap<String, Refrigerante> refrigerantes = new HashMap<>();
    private final HashMap<String, Extras> extras = new HashMap<>();
    private final HashMap<String, Acompanhamentos> acompanhamentos = new HashMap<>();

    public Lanchonete(){};

    public void fazerPedido(String Hamburguer, String Acompanhamentos, String Refrigerante, String Extras){
        Pedido pedido = new Pedido(hamburgueres.get(Hamburguer),
                acompanhamentos.get(Acompanhamentos),
                refrigerantes.get(Refrigerante),
                extras.get(Extras));
        System.out.println(pedido.getInfoPedidio());
    }

    protected void addHamburguer(String nome, String tamanho, double valor, String tipoCarne, String salada, String complementos, boolean artesanal, String adicionais){
        this.hamburgueres.put(nome, new Hamburguer(nome, tamanho, valor, tipoCarne, salada, complementos, artesanal, adicionais));
    }
}
