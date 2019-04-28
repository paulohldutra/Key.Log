package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import cadastro.Terceiro;
import cadastro.Cliente;

import java.util.LinkedList;

public class Menu2 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTable table;
	
	public Menu2(LinkedList list) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Object [] colunas = {"Razão Social", "Peça por hora", "Preço por peça"};
		
		Object [][] matriz = new String[list.size()][3];
		
		for (int cont = 0; cont < 3; cont++) {
			if (cont == 0) {
				for (int cont1 = 0; cont1 < list.size(); cont1++) {
					matriz[cont1][cont] = ((Cliente) list.get(cont1)).getRazaoSocial();
				}	
			} else if (cont == 1) {
				for (int cont1 = 0; cont1 < list.size(); cont1++) {
					matriz[cont1][cont] = ((Terceiro)list.get(cont1)).getPeca_hora();
				}
			} else {
				for (int cont1 = 0; cont1 < list.size(); cont1++) {
					matriz[cont1][cont] = ((Terceiro)list.get(cont1)).getPreco_peca();
				}
			}
		}

		JTable table = new JTable((Object[][])matriz, colunas);
		table.setBounds(10, 24, 414, 226);
		contentPane.add(table);
	}
}