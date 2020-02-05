package br.com.projeto.modelo.basico.teste;

import br.com.projeto.infra.DAO;
import br.com.projeto.modelo.basico.Aluno;
import br.com.projeto.modelo.basico.AlunoBolsista;

public class AlunoEAlunoBolsita {

	public static void main(String[] args) {
		DAO<Aluno> dao = new DAO<>();
		
		Aluno aluno1 = new Aluno(123L, "Joao");
		AlunoBolsista aluno2 = new AlunoBolsista(345L, "Maria", 1000.00);
		
		dao.incluirAtomico(aluno1);
		dao.incluirAtomico(aluno2);
		
		dao.fecharTransacao();
	}

}
