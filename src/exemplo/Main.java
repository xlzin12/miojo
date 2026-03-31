package exemplo;

public class Main {

    private static final int NOME = 0;
    public static final int RACA = 1;
    public static final int PORTE = 2;

    public static void main (String[] args){
        var nome = "maylon";
        var raca = "pinscher";
        var porte = "pequeno";

        imprimir (nome, raca, porte);

        var cat = new gato();

       cat.setNome("luna");
        cat.setIdade(20);
        cat.setPeso(10);
        cat.setRaca("virlata");
        cat.setPorte("pequeno");


        System.out.println("nome do gato: \n" +cat.getNome());
        System.out.println("raca do gato: \n" +cat.getRaca());
        System.out.println("porte do gato: \n" +cat.getPorte());
        System.out.println("idade do gato: \n" +cat.getIdade());



    }

    private static void imprimir(String[] gato) {
        System.out.println("O/A " +  gato[NOME] +
                " é da raça " + gato[RACA] +
                " e tem o porte " + gato[PORTE]);
    }

    private static void imprimir(String nome, String raca, String porte) {
        System.out.println("O/A " +  nome +
                " é da raça " + raca +
                " e tem o porte " + porte);
    }
}
