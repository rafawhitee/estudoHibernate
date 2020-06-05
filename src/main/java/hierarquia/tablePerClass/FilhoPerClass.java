package hierarquia.tablePerClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// Esse classe ser� uma Tabela no banco de dados
// J� o pai n�o, pois o TABLE_PER_CLASS pega somente as Tabelas que n�o s�o Abstratas

@Entity
@Table(name = "T_FILHO_PER_CLASS")
public class FilhoPerClass extends PaiPerClass {

	private static final long serialVersionUID = 1L;

	// N�o precisa declarar o ID, pois ele usar� o ID do PaiSingle, pois � uma heran�a
	@Column(name = "ATRIBUTO_SOMENTE_DO_FILHO")
	private String atributoSomenteDoFilhoPerClass;

	public FilhoPerClass() {
		super();
	}

	public String getAtributoSomenteDoFilhoPerClass() {
		return atributoSomenteDoFilhoPerClass;
	}

	public void setAtributoSomenteDoFilhoPerClass(String atributoSomenteDoFilhoPerClass) {
		this.atributoSomenteDoFilhoPerClass = atributoSomenteDoFilhoPerClass;
	}

}
