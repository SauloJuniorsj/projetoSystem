package projetoSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args){
		notaFiscal nota = new notaFiscal();
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto(1,"Maça", "Fruta", 5,  3.45f));
		lista.add(new Produto(2,"Morango", "Fruta", 3,  2.15f));
		nota.setProdutos(lista);
		nota.getProdutos().forEach((n) -> System.out.println(n.getNome()));

	}

}
