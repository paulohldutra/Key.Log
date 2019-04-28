package cadastro;

import java.util.LinkedList;
import pedido.Pedido;

public class Fornecedor extends Cliente{
	private LinkedList <Pedido> listPedido;
	private String metodoPagamento;
	
	public LinkedList<Pedido> getListPedido() {
		return listPedido;
	}
	public void setListPedido(LinkedList<Pedido> listPedido) {
		this.listPedido = listPedido;
	}
	public String getMetodoPagamento() {
		return metodoPagamento;
	}
	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	public Fornecedor(String cnpj, String razaoSocial, String endereco, LinkedList<Pedido> listPedido,
			String metodoPagamento) {
		super(cnpj, razaoSocial, endereco);
		this.listPedido = listPedido;
		this.metodoPagamento = metodoPagamento;
	}	
	public void addPedido(Pedido pedido) {
		this.listPedido.add(pedido);
	}
}