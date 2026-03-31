package farmacia;

import java.time.LocalDate;

public class Main {
    public  static void main (String[] args){
        System.out.println("farmacia");

        var farmacia = new Farmacia();


        var paracetamol = new Remedio();
        paracetamol.setNome("Paracetamol");
        paracetamol.setLaboratorio("Saude");
        paracetamol.setMiligrama(0.5f);
        paracetamol.setValidade(LocalDate.of(2026,3,31));
        paracetamol.setTarja(Tarja.BRANCA);

        var as = new Remedio();
        as.setNome("as Infantil");
        as.setLaboratorio("Saude");
        as.setMiligrama(0.5f);
        as.setValidade(LocalDate.of(2025,2,10));
        as.setTarja(Tarja.BRANCA);

        farmacia.reporRemedios(paracetamol);
        farmacia.reporRemedios(as);

        farmacia.verRemedios();
        System.out.println("Adiran comprou remedios");
        farmacia.venderRemedio(paracetamol);

        farmacia.verRemedios();
    }
}
