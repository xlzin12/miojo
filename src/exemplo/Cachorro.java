package exemplo;

public class Cachorro {

    private String nome;
    private String raca;
    private String porte;
    private Integer peso;
    private Integer idade;



    public Cachorro(String nome, String raca, String porte, Integer peso, Integer idade) {
        this.nome = nome;
        this.raca = raca;
        this.porte = porte;
        this.peso = peso;
        this.idade = idade;
    }





    public void comer(){
        System.out.println( nome + " foi alimentado e seu peso aumentou em 1KG.");
        peso++;
    }

    public void fazerAniversario(){
        System.out.println(nome + " fez aniversário e ficou 1 ano mais velho.");
        idade++;
    }

    public String verCachorro(){
        return nome
                +" é da raça " + raca
                + " possui um porte " + porte
                + " tem " + idade + " anos"
                + " está pesando " + peso + "KG.";

    }

}
