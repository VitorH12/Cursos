package aulas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
//import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Exercicio5 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio5 window = new Exercicio5();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exercicio5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1117, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\V\u00EDtor H\\Desktop\\calendario.png"));
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel nome = new JLabel("                               DATA E HORA ATUAIS");
		nome.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(nome, BorderLayout.WEST);
		
		JButton btnHora = new JButton("CLIQUE AQUI");
		btnHora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date relogio = new Date();
				btnHora.setText(relogio.toString());
				
			}
		});
		frame.getContentPane().add(btnHora, BorderLayout.CENTER);
	}

}
