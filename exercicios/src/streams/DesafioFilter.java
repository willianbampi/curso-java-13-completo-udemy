package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Caderno", 20.50, 0.15, 0);
		Produto produto2 = new Produto("Tesoura", 11.25, 0.05, 10);
		Produto produto3 = new Produto("Caneta", 2.99, 0.05, 0);
		Produto produto4 = new Produto("Lapis", 25, 0.20, 15);
		Produto produto5 = new Produto("Cola", 5.5, 0.08, 0);
		Produto produto6 = new Produto("Livro", 33, 0.12, 20);
		Produto produto7 = new Produto("Mochila", 150, 0.09, 0);
		
		List<Produto> produtos = Arrays.asList(produto1, produto2, produto3, produto4, produto5, produto6, produto7);
		
		Predicate<Produto> superPromocao = 
				p -> p.desconto >= 0.15;
	    Predicate<Produto> freteGratis = 
	    		p -> p.valorFrete == 0;
	    Predicate<Produto> produtoRelevante = 
	    		p -> p.preco >= 5;
	    		
	    Function<Produto, String> chamadaPromocional = 
	    		p -> "Aproveite! " + p.nome + " por " + p.preco;
	    
	    produtos.stream()
	    .filter(superPromocao)
	    .filter(freteGratis)
	    .filter(produtoRelevante)
	    .map(chamadaPromocional)
	    .forEach(System.out::println);
 	}

}
