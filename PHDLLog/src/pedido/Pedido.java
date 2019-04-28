package pedido;
import java.util.LinkedList;
import cadastro.Fornecedor;

public class Pedido {
	private String id;
	private Fornecedor fornecedor;
	private String peca;
	private int lote;
	private LinkedList <String> operacao;
	private double totalPreco;
	private boolean pronto;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getPeca() {
		return peca;
	}
	public void setPeca(String peca) {
		this.peca = peca;
	}
	public int getLote() {
		return lote;
	}
	public void setLote(int lote) {
		this.lote = lote;
	}
	public LinkedList<String> getOperacao() {
		return operacao;
	}
	public void setOperacao(LinkedList<String> operacao) {
		this.operacao = operacao;
	}
	public double getTotalPreco() {
		return totalPreco;
	}
	public void setTotalPreco(double totalPreco) {
		this.totalPreco =+ totalPreco;
	}
	public boolean isPronto() {
		return pronto;
	}
	public void setPronto(boolean pronto) {
		this.pronto = pronto;
	}
	public Pedido(String id, Fornecedor fornecedor, String peca, int lote, LinkedList<String> operacao,
			double totalPreco, boolean pronto) {
		this.id = id;
		this.fornecedor = fornecedor;
		this.peca = peca;
		this.lote = lote;
		this.operacao = operacao;
		this.totalPreco = totalPreco;
		this.pronto = pronto;
	}	
	
}