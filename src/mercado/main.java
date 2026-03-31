package mercado;

import java.time.LocalDate;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoes = 2;


        System.out.println("==================================");
        System.out.println("OPÇÕES");
        System.out.println("Digite 1 para cadastrar");
        System.out.println("digite 2 para imprimir a nota fiscal");
        System.out.println("Digite 3 para sair");
        System.out.println("==================================");
        opcaoes= scanner.nextInt();
        while (opcaoes == 1){

            System.out.println("Merdcado");
            var produto = new Mercado();

            var chocolate = new Produto();
            System.out.println("digite o nome do produto");
            String nome = scanner.nextLine();
            chocolate.setNome(nome);

            System.out.println("digite o marca do produto");
            String marca = scanner.nextLine();
            chocolate.setMarca(marca);


            System.out.println("digite o preco do produto");
            float preco = scanner.nextFloat();
            chocolate.setPreco(preco       );

            System.out.println("digite o dia de validade do produto");
            int dia = scanner.nextInt();
            System.out.println("digite o mes de validade do produto");
            int mes = scanner.nextInt();
            System.out.println("digite o ano de validade do produto");
            int ano = scanner.nextInt();

            chocolate.setVslidade(LocalDate.of((int) ano, (int) mes, (int) dia));


            produto.reporProdutos(chocolate);


            produto.verProdutos();

            System.out.println("thiago comprou produtos");
            produto.venderProdutos(chocolate);

            produto.verProdutos();
            System.out.println("cadastrar outro produto");

        }
    }}
