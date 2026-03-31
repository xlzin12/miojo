package exemplo;

public class gato {

    private String nome;
    private String raca;
    private String porte;
    private Integer peso;
    private Integer idade;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
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

