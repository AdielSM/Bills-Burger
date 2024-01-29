package Entities.Itens;

import java.util.Objects;

public class Hamburguer extends Itens {
    private String tipoCarne;
    private String complementos;
    private String extras;

    public Hamburguer(String nome, String tamanho, double valor, String tipoCarne, String complementos) {
        super(nome, tamanho, valor);
        this.tipoCarne = tipoCarne;
        this.complementos = complementos;
    }
    
    @Override
    public String getInfoItem() {
        if(!Objects.equals(extras, null)){
            return super.getInfoItem() + String.format("Tipo da carne: %s\nComplementos: %s\nExtras: %s\n", this.tipoCarne, this.complementos, this.extras);
        }

        return super.getInfoItem() + String.format("Tipo da carne: %s\nComplementos: %s\n", this.tipoCarne, this.complementos);
    }

    public void adicionarExtras(String extras) {
        this.extras = extras;
    }

    public String getExtras() {
        return extras;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public String getComplementos() {
        return complementos;
    }

    public void setComplementos(String complementos) {
        this.complementos = complementos;
    }

}
