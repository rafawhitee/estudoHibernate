package hierarquia.joined;

import util.CrudUtil;

public class MainJoined {

	// Inserindo alguns registros no JOINED
	public static void main(String[] args) {
		FilhoJoined filhoJoined1 = new FilhoJoined();
		filhoJoined1.setNome("Lucas");
		filhoJoined1.setAtributoSomenteDoFilhoJoined("Teste Filho LUCAS");

		FilhoJoined filhoJoined2 = new FilhoJoined();
		filhoJoined2.setNome("Leandro");
		filhoJoined2.setAtributoSomenteDoFilhoJoined("Teste Filho LEANDRO");

		FilhaJoined filhaJoined1 = new FilhaJoined();
		filhaJoined1.setNome("Filha Alessandra");
		filhaJoined1.setAtributoSomenteDoFilhaJoined("Teste Filha ALESSANDRA");

		CrudUtil.inserir(filhoJoined1);
		CrudUtil.inserir(filhoJoined2);
		CrudUtil.inserir(filhaJoined1);
	}

}
