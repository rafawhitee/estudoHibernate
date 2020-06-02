package hierarquia.joined;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/* Automaticamente quando usa Extends e ambas tabelas tem @Entity, elas serão ligadas no banco de dados
** E claro, a classe pai tem que ter a anotação @Inheritance 
*/

@Entity
@Table(name = "T_FILHA_JOINED")
public final class FilhaJoined extends PaiJoined {

	private static final long serialVersionUID = 2191554578970526252L;
	
	// Não precisa declarar o ID, pois ele usará o ID do PaiJoined, pois é uma herança
	
	// Somente a tabela T_FILHO_JOINED terá esse atributo
	// Os outros herdados ficarão na tabela T_PAI_JOINED
	@Column(name = "ATRIBUTO_SOMENTE_DA_FILHA")
	private String atributoSomenteDoFilhaJoined;
	
	public FilhaJoined() {
		super();
	}

	public String getAtributoSomenteDoFilhaJoined() {
		return atributoSomenteDoFilhaJoined;
	}

	public void setAtributoSomenteDoFilhaJoined(String atributoSomenteDaFilhoJoined) {
		this.atributoSomenteDoFilhaJoined = atributoSomenteDaFilhoJoined;
	}

}
