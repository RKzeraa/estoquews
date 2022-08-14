package br.ufrpe.ramom.fpsilva.estoque.ws;

import java.util.List;

import br.ufrpe.ramom.fpsilva.estoque.modelo.item.Item;
import br.ufrpe.ramom.fpsilva.estoque.modelo.item.ItemDao;


@WebService
public class EstoqueWS {
	
	private ItemDao dao = new ItemDao();
	
	public List<Item> getItens() {
		
		System.out.println("Chamando getItens()");
		List<Item> lista = dao.todosItens();
		return lista;
	}

}
