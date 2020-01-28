package br.com.projeto.campominado.modelo;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.projeto.campominado.excecao.ExplosaoException;

class CampoTeste {
	
	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeVizinhoDistanciaEsquerda() {
		Campo vizinho = new Campo(3, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistanciaDireita() {
		Campo vizinho = new Campo(3, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistanciaEncima() {
		Campo vizinho = new Campo(2, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistanciaEmbaixo() {
		Campo vizinho = new Campo(4, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistanciaEncimaEsquerda() {
		Campo vizinho = new Campo(2, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistanciaEncimaDireita() {
		Campo vizinho = new Campo(2, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistanciaEmbaixoEsquerda() {
		Campo vizinho = new Campo(4, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistanciaEmaixoDireita() {
		Campo vizinho = new Campo(4, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeNaoVizinho1() {
		Campo vizinho = new Campo(1, 1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);
	}
	
	@Test
	void testeNaoVizinho2() {
		Campo vizinho = new Campo(1, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);
	}
	
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacaoDuasChamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}
	
	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoNaoMarcado() {
		campo.minar();
		assertThrows(ExplosaoException.class, () -> {
			campo.abrir();
		});
	}
	
	@Test
	void testeAbrirComVizinhos1() {
		Campo campo11 = new Campo(1, 1);
		Campo campo22 = new Campo(2, 2);
		
		campo22.adicionarVizinho(campo11);
		campo.adicionarVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isAberto());
	}
	
	@Test
	void testeAbrirComVizinhos2() {
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);
		campo12.minar();
		
		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		
		campo.adicionarVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isFechado());
	}
	
	@Test
	void testeAberto() {
		assertFalse(campo.isAberto());
	}
	
	@Test
	void testeFechado1() {
		assertTrue(campo.isFechado());
	}
	
	@Test
	void testeFechado2() {
		campo.abrir();
		assertFalse(campo.isFechado());
	}
	
	@Test
	void testeMarcado() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeDesmarcado1() {
		assertTrue(campo.isDesmarcado());
	}
	
	@Test
	void testeDesmarcado2() {
		campo.alternarMarcacao();
		assertFalse(campo.isDesmarcado());
	}
	
	@Test
	void testeMinado() {
		assertFalse(campo.isMinado());
	}
	
	@Test
	void testeNaoMinado1() {
		assertTrue(campo.isNaoMinado());
	}
	
	@Test
	void testeNaoMinado2() {
		campo.minar();
		assertFalse(campo.isNaoMinado());
	}
	
	@Test
	void testeReiniciar1() {
		campo.reiniciar();
		assertFalse(campo.isMinado() && campo.isAberto() && campo.isMarcado());
	}
	
	@Test
	void testeReiniciar() {
		campo.reiniciar();
		assertFalse(campo.isMinado() && campo.isAberto() && campo.isMarcado());
	}
	
	@Test
	void testeObjetivoAlcancado1() {
		assertFalse(campo.objetivoAlcancado());
	}
	
	@Test
	void testeObjetivoAlcancado2() {
		campo.minar();
		assertFalse(campo.objetivoAlcancado());
	}
	
	@Test
	void testeObjetivoAlcancado3() {
		campo.minar();
		campo.alternarMarcacao();
		assertTrue(campo.objetivoAlcancado());
	}
	
	@Test
	void testeObjetivoAlcancado4() {
		campo.abrir();
		assertTrue(campo.objetivoAlcancado());
	}
	
	@Test
	void testeToString1() {
		assertSame("?", campo.toString());
	}
	
	@Test
	void testeToString2() {
		campo.alternarMarcacao();
		assertSame("X", campo.toString());
	}
	
	@Test
	void testeToString3() {
		campo.abrir();
		assertSame(" ", campo.toString());
	}
	
	@Test
	void testeToString4() {
		campo.abrir();
		campo.minar();
		assertSame("*", campo.toString());
	}

}
