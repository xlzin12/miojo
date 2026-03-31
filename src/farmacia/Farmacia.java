package farmacia;

import java.util.ArrayList;
import java.util.List;

public class Farmacia {

    private List<Remedio> pratileiraRemedios = new ArrayList<>();

    public void reporRemedios (Remedio remedio) {

        pratileiraRemedios.add(remedio);

    }
    public  void venderRemedio(Remedio remedio){

        pratileiraRemedios .remove(remedio);
    }
    public void verRemedios(){
        pratileiraRemedios.forEach(this::imprimir);
    }

    private void imprimir (Remedio r){
        System.out.println(r.getNome()+ " " + r.getLaboratorio()+ " " + r.getMiligrama()+ " " + r.getTarja() + " " + r.getValidade() );
    }
}
