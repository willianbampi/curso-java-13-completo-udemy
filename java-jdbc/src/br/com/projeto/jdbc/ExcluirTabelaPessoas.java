package br.com.projeto.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirTabelaPessoas {

	public static void main(String[] args) throws SQLException{

        Connection conexao = FabricaConexao.getConexao();
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Digite um codigo");
        int codigo = entrada.nextInt();

        String sql = "DELETE FROM pessoas WHERE codigo = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);

        int contador = stmt.executeUpdate();
        if(contador > 0){
            System.out.println("Pessoa excluida com sucesso.");
        } else {
            System.out.println("Nehum registro excluido.");
        }

        System.out.println("Quantidade de linhas afetadas " + contador);

        stmt.close();
        conexao.close();
        entrada.close();
        
	}

}
