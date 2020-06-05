package hierarquia.tablePerClass;

import util.CrudUtil;

public class MainPerClass {
	
	// Inserindo alguns registros no SINGLE_TABLE
	public static void main(String[] args) {
		FilhoPerClass filho1 = new FilhoPerClass();
		filho1.setNome("Rodrigo");
		filho1.setAtributoSomenteDoFilhoPerClass("Teste RENAN");
		
		FilhaPerClass filha1 = new FilhaPerClass();
		filho1.setNome("Rebekah");
		filho1.setAtributoSomenteDoFilhoPerClass("Teste DANIELA");
		
		CrudUtil.inserir(filho1);
		CrudUtil.inserir(filha1);
	}

}
