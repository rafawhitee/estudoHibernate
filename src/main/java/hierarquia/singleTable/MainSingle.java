package hierarquia.singleTable;

import util.CrudUtil;

public class MainSingle {
	
	// Inserindo alguns registros no SINGLE_TABLE
	public static void main(String[] args) {
		FilhoSingle filhoSingle1 = new FilhoSingle();
		filhoSingle1.setNome("Rafael");
		filhoSingle1.setAtributoSomenteDoFilhoSingle("Teste Filho RAFAEL");
		
		FilhaSingle filhaSingle1 = new FilhaSingle();
		filhaSingle1.setNome("Andreza");
		filhaSingle1.setAtributoSomenteDoFilhaSingle("Teste Filha ANDREZA");
		
		CrudUtil.inserir(filhoSingle1);
		CrudUtil.inserir(filhaSingle1);
	}

}
