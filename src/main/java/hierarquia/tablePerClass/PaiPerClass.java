package hierarquia.tablePerClass;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

// SE A CLASSE PAI DA HERANÇA COM STRATEGY TABLE_PER_CLASS FOR ABSTRACT, ELE NÃO IRÁ SE TORNAR UMA TABELA NO BANCO DE DADOS
// SOMENTE OS FILHOS, LOGO SE ELE NÃO SE TORNARÁ UMA TABELA NO BD, NÃO É POSSÍVEL COLOCAR A ANOTAÇÃO @Table

@SuppressWarnings("unused")
@Entity
//@Table( name = "T_PAI_PER_CLASS") // Só irá virar uma tabela no banco de dados se a classe não FOR ABSTRACT
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // Declara a Strategy da Herança
public abstract class PaiPerClass implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// Não pode ser usado a strategy de Identity para Chave Primária em HIERARQUIA DE TABLE_PER_CLASS
	// Pois a Identity ele faz a sequência na coluna, e na stratégia de herança, somente as filhas viram tabelas no banco de dados
	// Logo ficariam "2" ID's e o Identity não iria conseguir diferenciar
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NOME")
	private String nome;

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
