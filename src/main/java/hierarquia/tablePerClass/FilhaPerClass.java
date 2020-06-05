package hierarquia.tablePerClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//Esse classe será uma Tabela no banco de dados
//Já o pai não, pois o TABLE_PER_CLASS pega somente as Tabelas que não são Abstratas

@Entity
@Table(name = "T_FILHA_PER_CLASS")
public class FilhaPerClass extends PaiPerClass {

	private static final long serialVersionUID = 1L;

	// Não precisa declarar o ID, pois ele usará o ID do PaiSingle, pois é uma herança
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
