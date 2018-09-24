package managedbeans;

import java.util.ArrayList;
import java.util.List;
import entidades.Produto;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ProdutoMB {

	private List<Produto> listaProdutos = new ArrayList<Produto>();
	private Produto produto = new Produto();
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void salvar(){
		listaProdutos.add(produto);
		produto = new Produto();
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	
	
	
	
}
