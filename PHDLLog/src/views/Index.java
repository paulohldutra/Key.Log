package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pedido.Relatorio;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;


public class Index extends JFrame {

	private JPanel contentPane;

	public Index(LinkedList list1, LinkedList list2, Relatorio relatorio) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 218);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFornecedor = new JButton("Fornecedor");
		btnFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			    Menu menu = new Menu(list1);
			    menu.setVisible(true);
				dispose();
			}
		});
		btnFornecedor.setBounds(23, 28, 129, 23);
		contentPane.add(btnFornecedor);
		
		JButton btnTerceiro = new JButton("Terceiro");
		btnTerceiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			    Menu2 menu1 = new Menu2(list2);
			    menu1.setVisible(true);
				dispose();
			}
		});
		btnTerceiro.setBounds(23, 73, 129, 23);
		contentPane.add(btnTerceiro);
		
		JButton btnRelatrio = new JButton("Relat\u00F3rio");
		btnRelatrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			    Menu1 menu2 = new Menu1(relatorio);
			    menu2.setVisible(true);
				dispose();
			}
		});
		btnRelatrio.setBounds(206, 28, 129, 23);
		contentPane.add(btnRelatrio);
	}
}