package principal;

import hierarquia.joined.FilhaJoined;
import hierarquia.joined.FilhoJoined;
import hierarquia.singleTable.FilhaSingle;
import hierarquia.singleTable.FilhoSingle;
import hierarquia.singleTable.PaiSingle;
import util.CrudUtil;

public class Principal {

	public static void main(String[] args) {
		// Inserindo alguns registros no JOINED
		FilhoJoined filhoJoined1 = new FilhoJoined();
		filhoJoined1.setNome("Filho Joined 1");
		filhoJoined1.setAtributoSomenteDoFilhoJoined("Teste Filho Joined");
		
		FilhoJoined filhoJoined2 = new FilhoJoined();
		filhoJoined2.setNome("Filho Joined 2");
		filhoJoined2.setAtributoSomenteDoFilhoJoined("Teste Filho Joined 2");
		
		FilhaJoined filhaJoined1 = new FilhaJoined();
		filhaJoined1.setNome("Filha Joined 1");
		filhaJoined1.setAtributoSomenteDoFilhaJoined("Teste Filha Joined 1");
		
		CrudUtil.inserir(filhoJoined1);
		CrudUtil.inserir(filhoJoined2);
		CrudUtil.inserir(filhaJoined1);
		
		// Inserindo alguns registros no SINGLE_TABLE
		FilhoSingle filhoSingle1 = new FilhoSingle();
		filhoSingle1.setNome("Filho Single 1");
		filhoSingle1.setAtributoSomenteDoFilhoSingle("Teste Filho Single 1");
		
		FilhaSingle filhaSingle1 = new FilhaSingle();
		filhaSingle1.setNome("Filha Single 1");
		filhaSingle1.setAtributoSomenteDoFilhaSingle("Teste Filha Single 1");
		
		CrudUtil.inserir(filhoSingle1);
		CrudUtil.inserir(filhaSingle1);
		
		FilhoSingle procurarPorIdTeste = (FilhoSingle) CrudUtil.findById(FilhoSingle.class, 4);
		System.out.println(procurarPorIdTeste);
	}

}
