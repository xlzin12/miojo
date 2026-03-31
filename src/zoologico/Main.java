package zoologico;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criamos os objetos uma única vez
        Cadastrar acaoCadastro = new Cadastrar();
        ListarAnimais acaoListagem = new ListarAnimais();

        int opcao;
        do {
            System.out.println("\n1-Listar | 3-Cadastrar | 0-Sair");
            opcao = scanner.nextInt();

            if (opcao == 3) {
                // Preenche a lista que está DENTRO do objeto acaoCadastro
                acaoCadastro.executarCadastro();
            }
            else if (opcao == 1) {
                // PEGUE a lista do cadastro e PASSE para a listagem
                List<Animais> listaPreenchida = acaoCadastro.getAnimais();
                acaoListagem.verAnimais();
            }
        } while (opcao != 0);
    }
}