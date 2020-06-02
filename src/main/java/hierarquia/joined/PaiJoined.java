package hierarquia.joined;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/* 
 *  A strategy de Joined na Herança do Hibernate criará uma Tabela para cada Entidade contido no relacionamento
 *  mesmo a classe pai sendo abstrata por exemplo, ela terá sua tabela representada no Banco de Dados.
 *  E seus filhos terão as colunas próprias da classe dele na tabela, com uma chave estrangeira apontando para a classe pai
 * 
 * */

@Entity
@Table(name = "T_PAI_JOINED")
@Inheritance(strategy = InheritanceType.JOINED) // Declara a Strategy da Herança
public abstract class PaiJoined implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NOME")
	private String nome;
	
	public PaiJoined() {
		id = -1;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}