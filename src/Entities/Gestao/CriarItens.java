package Entities.Gestao;

public class CriarItens {
    public CriarItens(Lanchonete lanchonete){
        // Adicionando Hamburgueres
        lanchonete.addHamburguer("X-Tudo", "Grande", 25.0, "Bovina","Bacon, ovo, calabresa, queijo, presunto, alface, tomate, maionese");
        lanchonete.addHamburguer("X-Bacon", "Grande", 20.0, "Bovina","Bacon, queijo, alface, tomate, maionese");
        lanchonete.addHamburguer("X-Frango", "Grande", 18.0, "Frango","Queijo, alface, tomate, cebola caramelizada, maionese");
        lanchonete.addHamburguer("X-Burger", "Médio", 15.0, "Bovina","Queijo, presunto, alface, tomate, maionese");
        lanchonete.addHamburguer("X-Salada", "Médio", 12.0, "Bovina","Alface, tomate, maionese");
        lanchonete.addHamburguer("X-burguer Kids", "Pequeno", 10.0, "Bovina","Queijo, alface, tomate, maionese");

        // Adicionando Refrigerantes
        lanchonete.addRefrigerante("Coca-Cola", "Grande", 12.0);
        lanchonete.addRefrigerante("Fanta", "Grande", 8.0);
        lanchonete.addRefrigerante("Sprite", "Grande", 7.0);
        lanchonete.addRefrigerante("Guaraná", "Médio", 5.0);
        lanchonete.addRefrigerante("Pepsi", "Médio", 5.0);
        lanchonete.addRefrigerante("Soda", "Pequeno", 4.0);

        // Adicionando Acompanhamentos
        lanchonete.addAcompanhamento("Nuggets", "Grande", 15.0);
        lanchonete.addAcompanhamento("Onion Rings", "Médio", 12.0);
        lanchonete.addAcompanhamento("Milk Shake", "Médio", 12.0);
        lanchonete.addAcompanhamento("Batata Frita", "Pequeno", 10.0);

        // Adicionando Extras
        lanchonete.addExtra("Bacon", 5.0);
        lanchonete.addExtra("Ovo", 3.0);
        lanchonete.addExtra("Calabresa", 4.0);
        lanchonete.addExtra("Queijo", 2.0);
    }
}
