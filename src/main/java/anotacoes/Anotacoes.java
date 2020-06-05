package anotacoes;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Formula;


@Entity // Diz que a Classe � uma Entidade
@Table(name = "T_ANOTACOES") // Diz que a classe � uma Tabela no Banco de Dados, e o par�metro name � pra especificar qual o nome da tabela que ser� criada
public class Anotacoes implements Serializable {


	private static final long serialVersionUID = 1L;
	
	/* *
	 * Tipos de Strategy para o @GenerationType:
	 * 
	 *  @GenerationType.AUTO
	 * 	  - O JPA/Hibernate que ser� o encarregado de escolher a melhor op��o de GenerationType
	 * 
	 * 	@GenerationType.SEQUENCE
	 *    - Se for n�o declarado o nome de um Sequence (que exista no Banco de dados), ir� ser criado uma tabela para gerenciar a cria��o autom�tica dos ID's,
	 *   	 logo todas as Entitades que est�o mapeadas com GenerationType.SEQUENCE usar�o dessa mesma tabela.
	 *   
	 *   EXEMPLO: Tem 3 tabelas com o ID declarado como GenerationType.SEQUENCE, o �ltimo a ser inserido foi Usu�rio com o ID 99, e uma pessoa depois vai ser inserir um novo produto
	 *    esse produto ter� o ID 100, pois ele est� usando a mesma tabela para gerenciar o GenerationType.SEQUENCE
	 *    
	 *    
	 * 	@GenerationType.IDENTITY
	 *     - O JPA/Hibernate gerenciar� a cria��o do ID somente naquela coluna, por exemplo, se o �ltimo ID a ser inserido na Tabela T_USUARIO foi o 11, o pr�ximo automaticamente ser� o 12,
	 *       logo cada tabela ter� sua pr�pria sequ�ncia de id gerada pelo JPA.
	 *       
	 *     OBS: N�o pode ser usado em tipo de Heran�a TABLE_PER_CLASS, sendo o Pai da Heran�a uma classe Abstract.
	 *       
	 *  @GenerationType.TABLE
	 *     - O JPA/Hibernate ir� gerenciar a cria��o da chave prim�ria pela tabela
	 *    
	 */
	
	@Id // Diz que � a Chave Prim�ria da Tabela (OBS: � obrigat�rio se a classe for uma @Entity)
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Diz que o JPA/Hibernate que ser� o encarregado de gerar o ID para a Chave Prim�ria
	@Column(name = "ID") // Declara que o atributo vai ser uma Coluna no banco de dados
	private Integer id;
	
	// OBS: A Anota��o @Column tamb�m tem outras propriedades al�m do NAME 
	
	@Column(name = "NOME", nullable = false) // Diz que a Coluna NOME n�o pode ser Nula
	private String nome;
	
	@Column(name = "EMAIL", unique = true, nullable = false) // Diz que o Email � �NICO, ou seja n�o pode repetir e n�o pode ser Nulo.
	private String email;
	
	@Column(name = "IDADE", nullable = false)
	private Integer idade;
	
	@Column(name = "PESO", nullable = false)
	private Double peso;
	
	@Column(name = "ALTURA", nullable = false)
	private Double altura;
	
	@Column(name = "NASCIMENTO", nullable = false)
	@Temporal(TemporalType.DATE) // O @Temporal diz que a coluna no banco ser� uma data e o par�metro dentro � o tipo DATE = Somente Data e TIMESTAMP = Data com Hora
	private Date nascimento;
		
	@Lob // � uma representa��o de bin�rios (Database Large Objects) no banco de dados, um exemplo � pra guardar uma foto, ela � guardar em formato byte
	@Column(name = "FOTO", nullable = true) // Diz que a foto n�o � obrigat�rio, ou seja, pode ser nula
	private byte[] foto;
	
	@Transient // Diz que ele n�o ser� guardado no banco de dados, ou seja, n�o � uma Coluna do BD
	private String atributoTeste;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getAtributoTeste() {
		return atributoTeste;
	}

	public void setAtributoTeste(String atributoTeste) {
		this.atributoTeste = atributoTeste;
	}

	
}