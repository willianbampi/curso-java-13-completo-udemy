package br.com.projeto.modelo.basico.teste;

import br.com.projeto.infra.DAO;
import br.com.projeto.modelo.basico.Assento;
import br.com.projeto.modelo.basico.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
        Cliente cliente = daoCliente.obterPorId(1L);
        System.out.println("Nome do assento (através do cliente, pesquisando o cliente por id): " + cliente.getAssento().getNome());
        System.out.println("Nome do cliente (através do assento, pesquisando o cliente por id): " + cliente.getAssento().getCliente().getNome());
        daoCliente.fecharTransacao();

        DAO<Assento> daoAssento = new DAO<>(Assento.class);
        Assento assento = daoAssento.obterPorId(3L);
        System.out.println("Nome do cliente (através do assento, pesquisando o assento por id): " + assento.getCliente().getNome());
        daoAssento.fecharTransacao();
	}

}
