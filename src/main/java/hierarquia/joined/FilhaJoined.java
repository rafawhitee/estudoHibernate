package hierarquia.joined;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/* Automaticamente quando usa Extends e ambas tabelas tem @Entity, elas ser�o ligadas no banco de dados
** E claro, a classe pai tem que ter a anota��o @Inheritance 
*/

@Entity
@Table(name = "T_FILHA_JOINED")
public class FilhaJoined extends PaiJoined {

	private static final long serialVersionUID = 2191554578970526252L;
	
	// N�o precisa declarar o ID, pois ele usar� o ID do PaiJoined, pois � uma heran�a
	// Na tabela T_FILHA_JOINED vai ter o atributo ID que foi declarado no pai
	// E para pegar os atributos que est�o no Pai pelo banco, ter� que fazer um INNER JOIN pelo ID
	// Por isso a Strategy JOINED
	
	// Somente a tabela T_FILHO_JOINED ter� esse atributo
	// Os outros herdados ficar�o na tabela T_PAI_JOINED
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
