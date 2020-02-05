package br.com.projeto.modelo.basico.teste;

import br.com.projeto.infra.DAO;
import br.com.projeto.modelo.basico.Assento;
import br.com.projeto.modelo.basico.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		Assento assento = new Assento("8A");
        Cliente cliente = new Cliente("Pedro", assento);

        DAO<Object> dao = new DAO<>();
        dao.abrirTransacao().incluir(assento).incluir(cliente).commitarTransacao().fecharTransacao();
	}

}
