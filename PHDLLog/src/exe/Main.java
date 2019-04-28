package exe;
import java.util.LinkedList;

import cadastro.*;
import pedido.*;
import views.*;

public class Main {
	
	public static void main(String[] args){
		
		Fornecedor fornecedor1, fornecedor2, fornecedor3, fornecedor4;
		Terceiro terceiro1, terceiro2, terceiro3, terceiro4, terceiro5;
		
		LinkedList<String> op1 = new LinkedList<String>(), op2 = new LinkedList<String>(), op3 = new LinkedList<String>();
		
		op1.add("Costura");
		op1.add("Talha");
		op1.add("Estampa");
		
		op2.add("Malha");
		op2.add("Molde");
		op2.add("Costura");
		
		op3.add("Estampa");
		
		Pedido pedido1, pedido2, pedido3;		
		
		fornecedor1 = new Fornecedor("111111111", "Alberto - ME", "Rua Aleatório", null, "Cartão");
		fornecedor2 = new Fornecedor("222222222", "Paulo - ME", "Rua Tal", null, "PayPal");
		fornecedor3 = new Fornecedor("3333333", "Xablau - ME", "Rua Num Sei", null, "Cartão");
		fornecedor4 = new Fornecedor("4444444", "Né - ME", "Rua Quem sabe", null, "Boleto");		

		terceiro1 = new Terceiro("555555555", "Date", "Rua Irineu", "30", "0.4", op2);
		terceiro2 = new Terceiro("66666666", "Pamonha", "Rua itaquaquecetuba", "20", "0.4", op1);
		terceiro3 = new Terceiro("77777777", "cana de açucar", "Rua bem loco", "12", "0.4", op1);
		terceiro4 = new Terceiro("88888888", "Chinelo", "Rua Ambrósio", "4", "0.4", op3);
		terceiro5 = new Terceiro("99999999", "Paçoca", "Rua bento", "27", "0.4", op1);		

		LinkedList<Terceiro> ter1 = new LinkedList<Terceiro>();
		
		ter1.add(terceiro1);
		ter1.add(terceiro5);
		ter1.add(terceiro3);

		pedido1 = new Pedido("1", fornecedor1, "blusa", 250, op1, 300.0, false);
		pedido2 = new Pedido("2", fornecedor3, "calsa", 70, op2, 125.25, true);
		pedido3 = new Pedido("2", fornecedor3, "vestido", 40, op3, 750.25, true);
		
		Relatorio relatorio = new Relatorio("1", pedido1, ter1);	
		
		LinkedList<Fornecedor> list1 = new LinkedList<Fornecedor>();
		LinkedList<Terceiro> list2 = new LinkedList<Terceiro>();
		
		list1.add(fornecedor1);
		list1.add(fornecedor2);
		list1.add(fornecedor3);
		list1.add(fornecedor4);
		
		list2.add(terceiro1);
		list2.add(terceiro2);
		list2.add(terceiro3);
		list2.add(terceiro4);
		list2.add(terceiro5);	
		
		/*colunas [0] = "ID Relatorio";
		colunas [1] = "ID Pedido";
		colunas [2] = "Razão Social das Facções";	
		
		Object [][] matriz = new String[relatorio.getListTerceiros().size() + 2][1];
		
		matriz [0][0] = relatorio.getId();
		matriz [1][0] = relatorio.getPedido().getId();
			
		for (int cont1 = 0; cont1 < (relatorio.getListTerceiros().size()); cont1++) {
			colunas [cont1+2] = "Razão Social das Facções";
			matriz [cont1+2][0] = (relatorio.getListTerceiros().get(cont1).getRazaoSocial());
		}*/
		
		Index janela = new Index(list1, list2, relatorio);
		janela.setVisible(true);
	}
}