package br.com.projeto.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarTabelaPessoas {

	public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Digite um codigo");
        int codigoPesquisa = entrada.nextInt();

        String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
        String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
        PreparedStatement stmt = conexao.prepareStatement(select);
        stmt.setInt(1, codigoPesquisa);
        ResultSet resultado = stmt.executeQuery();

        if(resultado.next()){
            Pessoa pessoa = new Pessoa(resultado.getInt(1), resultado.getString(2));
           
            System.out.println("Nome atual " + pessoa.getNome());
            entrada.nextLine();
           
            System.out.println("Digite um novo nome");
            String novoNome = entrada.nextLine();
           
            stmt.close();
           
            stmt = conexao.prepareStatement(update);
            stmt.setString(1, novoNome);
            stmt.setInt(2, codigoPesquisa);
            stmt.execute();
           
            System.out.println("Pessoa alterada com sucesso.");
        } else {
            System.out.println("Pessoa nao encontrada.");
        }
       
        stmt.close();
        conexao.close();
        entrada.close();

	}

}
