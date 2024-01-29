package Entities.Itens;

public class Itens {
    private String nome;
    private String tamanho;
    private double valor;

    public Itens(String nome, String tamanho, double valor) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.valor = valor;
    }

    public Itens(String nome, double valor) {
        this(nome, "Único", valor);
    }

    public String getInfoItem() {
        return String.format("Nome: %s\nTamanho: %s\nValor: %.2f\n", this.nome, this.tamanho, this.valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
