package anotacoes;

import java.util.Date;

import util.CrudUtil;
import util.Util;

public class MainAnotacoes {

	public static void main(String[] args) {
		
		Date nascimento = Util.dataEspecifica(1999, 04, 11);
		
		Anotacoes a1 = new Anotacoes();
		a1.setNome("Rafael Nunes");
		a1.setEmail("rafaelnunes.inf@gmail.com");
		a1.setNascimento(nascimento);
		a1.setIdade(21);
		a1.setAltura(1.83);
		a1.setPeso(86.2);
		a1.setAtributoTeste("Testando Transient");
		a1 = (Anotacoes) CrudUtil.inserir(a1);
		
		a1 = (Anotacoes) CrudUtil.findById(Anotacoes.class, a1.getId());
		System.out.println(a1);
	}

}
