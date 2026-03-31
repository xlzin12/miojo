package farmacia;

import java.time.LocalDate;

public class Remedio {

    private String nome;
    private Float miligrama;
    private String laboratorio;
    private Tarja tarja;
    private LocalDate validade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getMiligrama() {
        return miligrama;
    }

    public void setMiligrama(float miligrama) {
        this.miligrama = miligrama;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Tarja getTarja() {
        return tarja;
    }

    public void setTarja(Tarja tarja) {
        this.tarja = tarja;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }
}
