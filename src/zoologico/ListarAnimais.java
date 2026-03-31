package zoologico;

public class ListarAnimais {
    // Agora o método recebe a lista preenchida como "ingrediente"
    public void verAnimais() {
        if (listaParaExibir.isEmpty()) {
            System.out.println("O zoológico ainda não tem animais cadastrados.");
        } else {
            listaParaExibir.forEach(this::imprimir);
        }
    }

    private void imprimir(Animais p) {
        System.out.println("Nome: " + p.getNome() +
                " | Raça: " + p.getRaca() +
                " | Alimento: " + p.getAlimentacao());
    }
}