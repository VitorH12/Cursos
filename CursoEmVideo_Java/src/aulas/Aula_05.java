package aulas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Aula_05 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aula_05 window = new Aula_05();
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
	public Aula_05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 776, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblTexto = new JLabel("MENSAGEM AQUI");
		lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setBackground(Color.WHITE);
		lblTexto.setForeground(Color.RED);
		frame.getContentPane().add(lblTexto, BorderLayout.NORTH);
		
		JButton btnBotao = new JButton("BOT\u00C3O");
		btnBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTexto.setText("Olá Mundo");
			}
		});
		btnBotao.setToolTipText("");
		btnBotao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBotao.setBackground(Color.LIGHT_GRAY);
		btnBotao.setForeground(Color.MAGENTA);
		frame.getContentPane().add(btnBotao, BorderLayout.SOUTH);
	}

}
