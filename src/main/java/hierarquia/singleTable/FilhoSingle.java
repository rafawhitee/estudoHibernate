package hierarquia.singleTable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/* Automaticamente quando usa Extends e ambas tabelas tem @Entity, elas serão ligadas no banco de dados
*  E claro, a classe pai tem que ter a anotação @Inheritance 
*
*  A anotação @DiscriminatorValue é usado para diferenciar no banco de dados qual é o tipo daquela linha, pois
*  a strategy do Pai é SINGLE_TABLE, logo é uma única tabela para toda a hierarquia, juntando todas as colunas nela
*  então para diferenciar é colocado um discriminador que quando insere tal registro do banco, ele pega o discriminador e cria uma coluna naquele registro para ele
*/

@Entity
@DiscriminatorValue(value = "FILHO") // Para diferenciar no Banco de dados qual o tipo daquela Linha (o Hibernate cria uma Coluna DType para colocar esse valor)
public class FilhoSingle extends PaiSingle {

	private static final long serialVersionUID = 2191554578970526252L;
	
	// Não precisa declarar o ID, pois ele usará o ID do PaiSingle, pois é uma herança
	
	@Column(name = "ATRIBUTO_SOMENTE_DO_FILHO")
	private String atributoSomenteDoFilhoSingle;
	
	public FilhoSingle() {
		super();
	}

	public String getAtributoSomenteDoFilhoSingle() {
		return atributoSomenteDoFilhoSingle;
	}

	public void setAtributoSomenteDoFilhoSingle(String atributoSomenteDoFilhoSingle) {
		this.atributoSomenteDoFilhoSingle = atributoSomenteDoFilhoSingle;
	}

}
