package pedido;

import java.util.LinkedList;
import cadastro.Terceiro;

public class Relatorio {
	private String id;
	private Pedido pedido;
	private LinkedList <Terceiro> listTerceiros;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public LinkedList<Terceiro> getListTerceiros() {
		return listTerceiros;
	}
	public void setListTerceiros(LinkedList<Terceiro> listTerceiros) {
		this.listTerceiros = listTerceiros;
	}
	
	public Relatorio(String id, Pedido pedido, LinkedList<Terceiro> listTerceiros) {
		this.id = id;
		this.pedido = pedido;
		this.listTerceiros = listTerceiros;
	}	
}