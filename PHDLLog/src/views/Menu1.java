package views;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cadastro.Cliente;
import cadastro.Fornecedor;
import pedido.Relatorio;

import javax.swing.JTable;
import java.util.LinkedList;
import javax.swing.JList;

public class Menu1 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTable table;
	
	public Menu1(Relatorio relatorio) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		

		DefaultListModel model = new DefaultListModel();

		model.add(0, relatorio.getId() + " ID - relatório");
		model.add(1, relatorio.getPedido().getId() + " ID - pedido");
			
		for (int cont1 = 0; cont1 < (relatorio.getListTerceiros().size()); cont1++) {
			model.add(cont1 + 2, "Empresa : " + relatorio.getListTerceiros().get(cont1).getRazaoSocial());
		}
		
		JList list = new JList(model);
		list.setBounds(40, 55, 333, 172);
		contentPane.add(list);
	}
}