package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4200);		
		Produto.desconto = 0.25;
		System.out.printf("Nome: %s\nPreço: %.2f\nDesconto: %.2f\nPreço com desconto: %.2f\n", p1.nome, p1.preco, Produto.desconto, p1.precoComDesconto());
		
		Produto p2 = new Produto();		
		p2.nome = "Caneta";
		p2.preco = 4200;		
		System.out.printf("Nome: %s\nPreço: %.2f\nDesconto: %.2f\nPreço com desconto: %.2f\n", p2.nome, p2.preco, Produto.desconto, p2.precoComDesconto(0.1));
		
	}

}
