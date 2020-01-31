package br.com.projeto.jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		DAO dao = new DAO();
		String sql = "INSERT INTO pessoas (nome) VALUES(?);";
		
		System.out.println(dao.incluir(sql, "Marcos"));
		System.out.println(dao.incluir(sql, "Lucas"));
		System.out.println(dao.incluir(sql, "Renata"));
		
		dao.close();
	}

}
