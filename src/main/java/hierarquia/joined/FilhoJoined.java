package hierarquia.joined;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/* Automaticamente quando usa Extends e ambas tabelas tem @Entity, elas ser�o ligadas no banco de dados
** E claro, a classe pai tem que ter a anota��o @Inheritance 
*/

@Entity
@Table(name = "T_FILHO_JOINED")
public final class FilhoJoined extends PaiJoined {

	private static final long serialVersionUID = 2191554578970526252L;
	
	// N�o precisa declarar o ID, pois ele usar� o ID do PaiJoined, pois � uma heran�a
	
	// Somente a tabela T_FILHO_JOINED ter� esse atributo
	// Os outros herdados ficar�o na tabela T_PAI_JOINED
	@Column(name = "ATRIBUTO_SOMENTE_DO_FILHO")
	private String atributoSomenteDoFilhoJoined;
	
	public FilhoJoined() {
		super();
	}

	public String getAtributoSomenteDoFilhoJoined() {
		return atributoSomenteDoFilhoJoined;
	}

	public void setAtributoSomenteDoFilhoJoined(String atributoSomenteDoFilhoJoined) {
		this.atributoSomenteDoFilhoJoined = atributoSomenteDoFilhoJoined;
	}

}
