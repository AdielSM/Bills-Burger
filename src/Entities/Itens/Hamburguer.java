package Entities.Itens;

public class Hamburguer extends Itens {
    private String tipoCarne;
    private String salada;
    private String complementos;
    private String extras;

    public Hamburguer(String nome, String tamanho, double valor, String tipoCarne,
                      String salada, String complementos) {
        super(nome, tamanho, valor);
        this.tipoCarne = tipoCarne;
        this.salada = salada;
        this.complementos = complementos;
        this.extras = "";
    }

    public Hamburguer(String nome, String tamanho, double valor, String tipoCarne,
                      String salada, String complementos, String adicionais) {
        super(nome, tamanho, valor);
        this.tipoCarne = tipoCarne;
        this.salada = salada;
        this.complementos = complementos;
        this.extras = "";
    }

    @Override
    public String getInfoItem() {
        return super.getInfoItem() + "\nTipo de carne: " + this.tipoCarne +
                "\nSalada: " + this.salada + "\nComplementos: " + this.complementos +
                "\nExtras: " + this.extras + "\n";
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

    public String getSalada() {
        return salada;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public String getComplementos() {
        return complementos;
    }

    public void setComplementos(String complementos) {
        this.complementos = complementos;
    }

}
