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
        String formatName = "%-30s";
        String formatValue = "%10.2f%n";
        StringBuilder infoPedido = new StringBuilder("\nInformações Do Pedido:\n");

        infoPedido.append(String.format(formatName, "Hamburguer: " + this.hamburguer.getNome()));
        infoPedido.append(String.format(formatValue, this.hamburguer.getValor()));

        infoPedido.append(String.format(formatName, "Acompanhamento: " + this.acompanhamentos.getNome()));
        infoPedido.append(String.format(formatValue, this.acompanhamentos.getValor()));

        infoPedido.append(String.format(formatName, "Refrigerante: " + this.refrigerante.getNome()));
        infoPedido.append(String.format(formatValue, this.refrigerante.getValor()));

        if (this.extras != null){
            infoPedido.append(String.format(formatName, "Extras: " + this.extras.getNome()));
            infoPedido.append(String.format(formatValue, this.extras.getValor()));
        }

        infoPedido.append("-".repeat(40) + "\n");
        infoPedido.append("Valor total: ");
        infoPedido.append(String.format("%.2f", this.getValorTotal()));
        return infoPedido.toString();
    }
}
