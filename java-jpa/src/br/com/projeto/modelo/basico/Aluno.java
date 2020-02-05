package br.com.projeto.modelo.basico;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
/*
se eu nao colocar nenhuma estrategia sera gerada uma unica tabela no banco de dados para as classes aluno e aluno bolsista
sem criar nenhum descriminado para saber de qual classe o registro veio
*/

/*
essa estrategia de table_per_class gera uma tabela para aluno e outra tabela para aluno bolsista no banco de dados
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
*/

/*
essa estrategia cria apenas uma tabela no banco de dados para a classe aluno e aluno bolsista
porem eu tenho que determinar um campo a mais para que seja possivel identificar de onde o registro veio
quando for um aluno sera criado um registro de aluno e vinculado o valor AL
quando for um aluno bolsista sera criado um registro de aluno e vincluado o valor AB pois na classe aluno bolsista tem esse mapeamento
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("AL")
*/

/*
essa estrategia cria duas tabelas no banco de dados, uma para a classe aluno e outra para a classe aluno bolsista
porem a tabela de aluno bolsista vai conter apenas o que é diferente de aluno
continuo tendo que determinar um campo a mais para que seja possivel identificar de onde o registro veio
quando for um aluno sera criado um registro de aluno e vinculado o valor AL
quando for um aluno bolsista sera criado um registro de aluno e vincluado o valor AB e o id de aluno
pois na classe aluno bolsista tem esse mapeamento
*/
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("AL")

public class Aluno {
	
	@Id
	private Long matricula;
	
	private String nome;
	
	public Aluno() {
		
	}
	
	public Aluno(Long matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
