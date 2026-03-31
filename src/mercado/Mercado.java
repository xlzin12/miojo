package mercado;

import java.util.ArrayList;
import java.util.List;


public class Mercado {

    private List<Produto> pratileiraDeProdutos = new ArrayList<>();

    public  void  reporProdutos  (Produto produto){
        pratileiraDeProdutos.add(produto);
    }
    public void venderProdutos (Produto produto){
        pratileiraDeProdutos.remove(produto);
    }

    public void verProdutos (){
        pratileiraDeProdutos.forEach(this::imprimir);

    }

    private void imprimir(Produto p) {
        System.out.println(p.getMarca()+ " "+ p.getNome()+ " "+ p.getPreco()+ " " + p.getVslidade());
    }

}

