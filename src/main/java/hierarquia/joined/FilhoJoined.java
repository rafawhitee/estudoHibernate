package hierarquia.joined;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/* Automaticamente quando usa Extends e ambas tabelas tem @Entity, elas serão ligadas no banco de dados
** E claro, a classe pai tem que ter a anotação @Inheritance 
*/

@Entity
@Table(name = "T_FILHO_JOINED")
public class FilhoJoined extends PaiJoined {

	private static final long serialVersionUID = 2191554578970526252L;
	
	// Não precisa declarar o ID, pois ele usará o ID do PaiJoined, pois é uma herança
	// Na tabela T_FILHO_JOINED vai ter o atributo ID que foi declarado no pai
	// E para pegar os atributos que estão no Pai pelo banco, terá que fazer um INNER JOIN pelo ID
	// Por isso a Strategy JOINED
	
	// Somente a tabela T_FILHO_JOINED terá esse atributo
	// Os outros herdados ficarão na tabela T_PAI_JOINED
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
