package hierarquia.singleTable;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/* 
 *  A strategy de SINGLE_TABLE na Heran�a do Hibernate criar� uma �NICA TABELA PARA TODAS AS CLASSES CONTIDAS NO RELACIONAMENTO DE HERAN�A
 *  ENT�O SE EXITIR A CLASSE PAI COM 5 ATRIBUTOS, E 3 FILHOS COM 4 ATRIBUTOS CADA UM, TER� UMA �NICA TABELA COM 17 ATRIBUTOS
 *  E o que vai diferenciar cada "Classe" na tabela vai ser um Descriminador que � uma anota��o do Hibernate
 */

@Entity
@Table(name = "T_PAI_SINGLE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Declara a Strategy da Heran�a
public abstract class PaiSingle implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NOME")
	private String nome;
	
	public PaiSingle() {
		id = -1;
	}

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
