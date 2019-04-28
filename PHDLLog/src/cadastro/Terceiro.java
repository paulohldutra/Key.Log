package cadastro;
import java.util.LinkedList;

public class Terceiro extends Cliente{
	private String peca_hora;
	private String preco_peca;
	private LinkedList <String> listProcesso;
	
	public String getPeca_hora() {
		return peca_hora;
	}
	public void setPeca_hora(String peca_hora) {
		this.peca_hora = peca_hora;
	}
	public String getPreco_peca() {
		return preco_peca;
	}
	public void setPreco_peca(String preco_peca) {
		this.preco_peca = preco_peca;
	}
	public LinkedList<String> getListProcesso() {
		return listProcesso;
	}
	public void setListProcesso(LinkedList<String> listProcesso) {
		this.listProcesso = listProcesso;
	}
	public Terceiro(String cnpj, String razaoSocial, String endereco, String peca_hora, String preco_peca,
			LinkedList<String> listProcesso) {
		super(cnpj, razaoSocial, endereco);
		this.peca_hora = peca_hora;
		this.preco_peca = preco_peca;
		this.listProcesso = listProcesso;
	}	
}