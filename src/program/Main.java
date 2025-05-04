package program;

import utilidades.ExchangeRate;

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
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
        System.out.println("Digite o valor que deseja converter: ");
        double valor = sc.nextDouble();


        switch (opcao) {
            case 1:
                ExchangeRate ex = new ExchangeRate();
                System.out.println(ex.getRates("USD", "BRL",valor));
        }

        sc.close();
    }
}
