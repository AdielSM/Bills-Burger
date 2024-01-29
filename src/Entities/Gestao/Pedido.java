package Entities.Gestao;

import Entities.Itens.Acompanhamentos;
import Entities.Itens.Extras;
import Entities.Itens.Hamburguer;
import Entities.Itens.Refrigerante;

public class Pedido {
    private Hamburguer hamburguer;
    private Acompanhamentos acompanhamentos;
    private Refrigerante refrigerante;
    private Extras extras;

    public Pedido(Hamburguer hamburguer, Acompanhamentos acompanhamentos, Refrigerante refrigerante, Extras extras) {
        this.hamburguer = hamburguer;
        this.acompanhamentos = acompanhamentos;
        this.refrigerante = refrigerante;
        this.extras = extras;
    }

    public Pedido(Hamburguer hamburguer, Acompanhamentos acompanhamentos, Refrigerante refrigerante) {
        this.hamburguer = hamburguer;
        this.acompanhamentos = acompanhamentos;
        this.refrigerante = refrigerante;
    }

    public double getValorTotal(){
        if (this.extras != null){
            return this.hamburguer.getValor() + this.acompanhamentos.getValor() + this.refrigerante.getValor() + this.extras.getValor();
        }
        return this.hamburguer.getValor() + this.acompanhamentos.getValor() + this.refrigerante.getValor();
    }

    public String getInfoPedido(){
        if (this.extras != null){
            return String.format("Hamburguer: %s\nAcompanhamento: %s\nRefrigerante: %s\nExtras: %s\nValor total: %.2f", this.hamburguer.getNome(), this.acompanhamentos.getNome(), this.refrigerante.getNome(), this.extras.getNome(), this.getValorTotal());
        }
        return String.format("Hamburguer: %s\nAcompanhamento: %s\nRefrigerante: %s\nValor total: %.2f", this.hamburguer.getNome(), this.acompanhamentos.getNome(), this.refrigerante.getNome(), this.getValorTotal());
    }

}
