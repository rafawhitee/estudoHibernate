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


@Entity // Diz que a Classe é uma Entidade
@Table(name = "T_ANOTACOES") // Diz que a classe é uma Tabela no Banco de Dados, e o parâmetro name é pra especificar qual o nome da tabela que será criada
public class Anotacoes implements Serializable {


	private static final long serialVersionUID = 1L;
	
	/* *
	 * Tipos de Strategy para o @GenerationType:
	 * 
	 *  @GenerationType.AUTO
	 * 	  - O JPA/Hibernate que será o encarregado de escolher a melhor opção de GenerationType
	 * 
	 * 	@GenerationType.SEQUENCE
	 *    - Se for não declarado o nome de um Sequence (que exista no Banco de dados), irá ser criado uma tabela para gerenciar a criação automática dos ID's,
	 *   	 logo todas as Entitades que estão mapeadas com GenerationType.SEQUENCE usarão dessa mesma tabela.
	 *   
	 *   EXEMPLO: Tem 3 tabelas com o ID declarado como GenerationType.SEQUENCE, o último a ser inserido foi Usuário com o ID 99, e uma pessoa depois vai ser inserir um novo produto
	 *    esse produto terá o ID 100, pois ele está usando a mesma tabela para gerenciar o GenerationType.SEQUENCE
	 *    
	 *    
	 * 	@GenerationType.IDENTITY
	 *     - O JPA/Hibernate gerenciará a criação do ID somente naquela coluna, por exemplo, se o último ID a ser inserido na Tabela T_USUARIO foi o 11, o próximo automaticamente será o 12,
	 *       logo cada tabela terá sua própria sequência de id gerada pelo JPA.
	 *       
	 *     OBS: Não pode ser usado em tipo de Herança TABLE_PER_CLASS, sendo o Pai da Herança uma classe Abstract.
	 *       
	 *  @GenerationType.TABLE
	 *     - O JPA/Hibernate irá gerenciar a criação da chave primária pela tabela
	 *    
	 */
	
	@Id // Diz que é a Chave Primária da Tabela (OBS: é obrigatório se a classe for uma @Entity)
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Diz que o JPA/Hibernate que será o encarregado de gerar o ID para a Chave Primária
	@Column(name = "ID") // Declara que o atributo vai ser uma Coluna no banco de dados
	private Integer id;
	
	// OBS: A Anotação @Column também tem outras propriedades além do NAME 
	
	@Column(name = "NOME", nullable = false) // Diz que a Coluna NOME não pode ser Nula
	private String nome;
	
	@Column(name = "EMAIL", unique = true, nullable = false) // Diz que o Email é ÚNICO, ou seja não pode repetir e não pode ser Nulo.
	private String email;
	
	@Column(name = "IDADE", nullable = false)
	private Integer idade;
	
	@Column(name = "PESO", nullable = false)
	private Double peso;
	
	@Column(name = "ALTURA", nullable = false)
	private Double altura;
	
	@Column(name = "NASCIMENTO", nullable = false)
	@Temporal(TemporalType.DATE) // O @Temporal diz que a coluna no banco será uma data e o parâmetro dentro é o tipo DATE = Somente Data e TIMESTAMP = Data com Hora
	private Date nascimento;
		
	@Lob // É uma representação de binários (Database Large Objects) no banco de dados, um exemplo é pra guardar uma foto, ela é guardar em formato byte
	@Column(name = "FOTO", nullable = true) // Diz que a foto não é obrigatório, ou seja, pode ser nula
	private byte[] foto;
	
	@Transient // Diz que ele não será guardado no banco de dados, ou seja, não é uma Coluna do BD
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