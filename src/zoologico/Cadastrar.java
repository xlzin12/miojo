package zoologico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastrar {
    private Scanner scanner = new Scanner(System.in);
    // Lista correta para guardar os objetos do tipo Animais
    private List<Animais> ListarAnimais = new ArrayList<>();

    public void executarCadastro() {
        // 1. Criamos um novo objeto da classe Animais
        Animais novo = new Animais();

        System.out.println("Digite o nome do animal:");
        String nomeDigitado = scanner.nextLine();

        // 2. Colocamos o nome dentro do objeto
        novo.setNome(nomeDigitado);

        // 3. ADICIONAMOS o objeto na lista (Isso salva o bicho!)
        ListarAnimais.add(novo);

        System.out.println("Animal " + nomeDigitado + " cadastrado com sucesso!");
    }

    // Método para o Main conseguir ler a lista depois
    public List<Animais> getAnimais() {
        return ListarAnimais;
    }
}