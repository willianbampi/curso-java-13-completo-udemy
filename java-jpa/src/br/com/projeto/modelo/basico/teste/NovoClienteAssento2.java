package br.com.projeto.modelo.basico.teste;

import br.com.projeto.infra.DAO;
import br.com.projeto.modelo.basico.Assento;
import br.com.projeto.modelo.basico.Cliente;

public class NovoClienteAssento2 {

	public static void main(String[] args) {
		Assento assento = new Assento("3F");
        Cliente cliente = new Cliente("Bia", assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);
        dao.incluirAtomico(cliente);
        dao.fecharTransacao();
	}

}
