package br.com.projeto.modelo.basico.teste;

import br.com.projeto.infra.DAO;
import br.com.projeto.modelo.basico.Sobrinho;
import br.com.projeto.modelo.basico.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio tio1 = new Tio("Maria");
		Tio tio2 = new Tio("João");
		
		Sobrinho sobrinho1 = new Sobrinho("Júnior");
		Sobrinho sobrinho2 = new Sobrinho("Ana");
		
		tio1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio1);
		
		tio1.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio1);
		
		tio2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio2);
		
		tio2.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio2);
		
		DAO<Object> dao = new DAO<>();
		dao.abrirTransacao().incluir(tio1).incluir(tio2).incluir(sobrinho1).incluir(sobrinho2).commitarTransacao().fecharTransacao();
	}

}
