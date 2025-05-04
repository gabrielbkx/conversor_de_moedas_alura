package program;

import utilidades.ExchangeRate;

import java.util.Scanner;

public class Sistema {

    public static void sistema() {

        boolean laco = true;
        ExchangeRate ex = new ExchangeRate();
        Scanner sc = new Scanner(System.in);

        while (laco) {

            System.out.println("*******************************************************");
            System.out.println("Seja bem vindo/a ao conversor de moedas =} ");
            System.out.println();
            System.out.println("1) Dólar >>> Peso argentino");
            System.out.println("2) Peso argentino >>> Dólar");
            System.out.println("3) Dólar >>> Real brasileiro");
            System.out.println("4) Real brasileiro >>> Dólar");
            System.out.println("5) Dólar >>> Peso colombiano");
            System.out.println("6) Peso colombiano >>> Dólar");
            System.out.println("7) sair");
            System.out.println("Escolha uma opção válida: ");
            System.out.println("*******************************************************");
            int opcao = sc.nextInt();

            if (opcao == 7) {
                System.out.println("Encerrando conversor...");
                break;
            }

            System.out.println("Digite o valor que deseja converter: ");
            double valor = sc.nextDouble();

            if (valor <= 0) {
                System.out.println("Erro: O valor deve ser maior que zero. Tente novamente.");
                continue;
            }

                switch (opcao) {

                case 1:

                    System.out.println("Valor: " + valor + "[USD] " + "corresponde ao valor final de >>> "
                            + ex.getRates("USD", "ARS", valor) + "[ARS]");
                    break;

                case 2:

                    System.out.println("Valor: " + valor + "[ARS] " + "corresponde ao valor final de >>> "
                            + ex.getRates("ARS", "USD", valor) + "[USD]");
                    break;
                case 3:
                    System.out.println("Valor: " + valor + "[USD] " + "corresponde ao valor final de >>> "
                            + ex.getRates("USD", "BRL", valor) + "[BRL]");
                    break;
                case 4:
                    System.out.println("Valor: " + valor + "[BRL] " + "corresponde ao valor final de >>> "
                            + ex.getRates("BRL", "USD", valor) + "[USD]");
                    break;
                case 5:
                    System.out.println("Valor: " + valor + "[USD] " + "corresponde ao valor final de >>> "
                            + ex.getRates("USD", "COP", valor) + "[COP]");
                    break;
                case 6:
                    System.out.println("Valor: " + valor + "[COP] " + "corresponde ao valor final de >>> "
                            + ex.getRates("COP", "USD", valor) + "[USD]");
                    break;
                case 7:
                    laco = false;
                    break;

                default:
                    System.out.println("Por favor. digite uma opção válida. A opção " + opcao + " não existe");
            }
        }
        sc.close();
    }
}

