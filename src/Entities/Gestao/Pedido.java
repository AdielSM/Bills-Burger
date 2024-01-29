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

    public double getValorTotal(){
        return this.hamburguer.getValor() + this.acompanhamentos.getValor() + this.refrigerante.getValor() + this.extras.getValor();
    }

    public String getInfoPedidio(){
        return String.format("Hamburguer: %s\nAcompanhamentos: %s\nRefrigerante: %s\nExtras: %s\nValor total: %.2f",
                this.hamburguer.getInfoItem(),
                this.acompanhamentos.getInfoItem(),
                this.refrigerante.getInfoItem(),
                this.extras.getInfoItem(),
                this.getValorTotal());
    }

}
