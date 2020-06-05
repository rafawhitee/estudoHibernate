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

// SE A CLASSE PAI DA HERAN�A COM STRATEGY TABLE_PER_CLASS FOR ABSTRACT, ELE N�O IR� SE TORNAR UMA TABELA NO BANCO DE DADOS
// SOMENTE OS FILHOS, LOGO SE ELE N�O SE TORNAR� UMA TABELA NO BD, N�O � POSS�VEL COLOCAR A ANOTA��O @Table

@SuppressWarnings("unused")
@Entity
//@Table( name = "T_PAI_PER_CLASS") // S� ir� virar uma tabela no banco de dados se a classe n�o FOR ABSTRACT
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // Declara a Strategy da Heran�a
public abstract class PaiPerClass implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// N�o pode ser usado a strategy de Identity para Chave Prim�ria em HIERARQUIA DE TABLE_PER_CLASS
	// Pois a Identity ele faz a sequ�ncia na coluna, e na strat�gia de heran�a, somente as filhas viram tabelas no banco de dados
	// Logo ficariam "2" ID's e o Identity n�o iria conseguir diferenciar
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
