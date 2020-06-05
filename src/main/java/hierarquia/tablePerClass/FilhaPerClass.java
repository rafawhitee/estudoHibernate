package hierarquia.tablePerClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//Esse classe ser� uma Tabela no banco de dados
//J� o pai n�o, pois o TABLE_PER_CLASS pega somente as Tabelas que n�o s�o Abstratas

@Entity
@Table(name = "T_FILHA_PER_CLASS")
public class FilhaPerClass extends PaiPerClass {

	private static final long serialVersionUID = 1L;

	// N�o precisa declarar o ID, pois ele usar� o ID do PaiSingle, pois � uma heran�a
	@Column(name = "ATRIBUTO_SOMENTE_DA_FILHA")
	private String atributoSomenteDaFilhaPerClass;

	public FilhaPerClass() {
		super();
	}

	public String getAtributoSomenteDaFilhaPerClass() {
		return atributoSomenteDaFilhaPerClass;
	}

	public void setAtributoSomenteDoFilhaPerClass(String atributoSomenteDaFilhaPerClass) {
		this.atributoSomenteDaFilhaPerClass = atributoSomenteDaFilhaPerClass;
	}

}
