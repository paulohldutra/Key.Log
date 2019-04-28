package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cadastro.Cliente;
import cadastro.Fornecedor;

import javax.swing.JTable;
import java.util.LinkedList;

public class Menu extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTable table;
	
	public Menu(LinkedList list) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Object [] colunas = {"Razão Social", "Peça po hora", "Preço por peça"};
		
		Object [][] matriz = new String[list.size()][3];
		
		for (int cont = 0; cont < 3; cont++) {
			if (cont == 0) {
				for (int cont1 = 0; cont1 < list.size(); cont1++) {
					matriz[cont1][cont] = ((Cliente) list.get(cont1)).getRazaoSocial();
				}	
			} else if (cont == 1) {
				for (int cont1 = 0; cont1 < list.size(); cont1++) {
					matriz[cont1][cont] = ((Fornecedor)list.get(cont1)).getMetodoPagamento();
				}
			} else {
				for (int cont1 = 0; cont1 < list.size(); cont1++) {
					matriz[cont1][cont] = ((Cliente)list.get(cont1)).getCnpj();
				}
			}
		}

		JTable table = new JTable((Object[][])matriz, colunas);
		table.setBounds(33, 25, 376, 225);
		contentPane.add(table);
	}
}