package oo.desafiocomposicao;

public class Teste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Ana");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Notebook", 4200.20), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 18.00, 5);
		compra2.adicionarItem(new Produto("Calculadora", 30.20), 2);
		
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);
		
		System.out.println("Nome: " + cliente.nome + "\nValor total comprado: " +cliente.obterValorTotal());
		
	}

}
