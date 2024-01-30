import Entities.Gestao.CriarItens;
import Entities.Gestao.Lanchonete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Lanchonete lanchonete = new Lanchonete();
        // Carregar Itens
        CriarItens.criarItens(lanchonete);

        System.out.println("\n ==== Bem-vindo ao Bill's Burger ==== ");

        while(true){
            exibirMenuInicial();
            String opcao = inputUser(in);

            switch (opcao){
                case "1":
                    lanchonete.listarCardapio();
                    break;
                case "2":
                    String hamburguer = lanchonete.selecionarItem(in, "Hamburguer");
                    String acompanhamentos = lanchonete.selecionarItem(in, "Acompanhamento");
                    String refrigerante = lanchonete.selecionarItem(in, "Refrigerante");

                    System.out.println("Deseja adicionar algum extra? (S/N)");
                    String extra = inputUser(in);

                    while (!extra.equalsIgnoreCase("S") && !extra.equalsIgnoreCase("N")){
                        System.out.println("Digite uma opção válida. (S/N)");
                        extra = inputUser(in);
                    }

                    if (extra.equalsIgnoreCase("S")){
                        String extras = lanchonete.selecionarItem(in, "Extra");
                        lanchonete.fazerPedido(hamburguer, acompanhamentos, refrigerante, extras);
                    } else {
                        lanchonete.fazerPedido(hamburguer, acompanhamentos, refrigerante);
                    }

                    break;

                case "3":
                    System.out.println("Obrigado por sua presença!");
                    break;
                default:
                    System.out.println("Digite uma opção válida. (1-3)");
            }

            if (opcao.equals("3")){
                break;
            }
        }
        in.close();
    }

    public static void exibirMenuInicial(){
        System.out.println("""
                 
                 === Menu ===
                 1 - Ver Cardápio
                 2 - Fazer Pedido
                 3 - Sair do programa""");
    }

    public static String inputUser(Scanner scanner){
        System.out.print("Sua opção > ");
        return scanner.nextLine();
    }
}
