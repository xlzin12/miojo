package mercado;

import java.time.LocalDate;

public class Produto {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public LocalDate getVslidade() {
        return vslidade;
    }

    public void setVslidade(LocalDate vslidade) {
        this.vslidade = vslidade;
    }

    private String nome ;
    private String marca;
    private Float  preco;
    private LocalDate vslidade;

}
