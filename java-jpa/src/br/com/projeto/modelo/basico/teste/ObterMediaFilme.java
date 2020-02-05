package br.com.projeto.modelo.basico.teste;

import br.com.projeto.infra.DAO;
import br.com.projeto.modelo.basico.NotaFilme;

public class ObterMediaFilme {

	public static void main(String[] args) {
		DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
		NotaFilme nota = dao.consultarUm("obterMediaGeralDosFilmes");
		System.out.println("Media: " + nota.getMedia());
		dao.fecharTransacao();
	}

}
