import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FighterGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FighterGui frame = new FighterGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FighterGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Fighter");
		setBounds(100, 100, 548, 399);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Attack\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(52, 229, 151, 44);
		contentPane.add(btnNewButton);
		
		JButton btnNewEnemy = new JButton("New Enemy");
		btnNewEnemy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewEnemy.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewEnemy.setBounds(323, 229, 151, 44);
		contentPane.add(btnNewEnemy);
		
		JButton btnHeal = new JButton("Heal\r\n");
		btnHeal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHeal.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnHeal.setBounds(52, 284, 151, 44);
		contentPane.add(btnHeal);
		
		textField = new JTextField();
		textField.setBackground(Color.BLACK);
		textField.setForeground(Color.RED);
		textField.setEditable(false);
		textField.setBounds(52, 198, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblHealth = new JLabel("Health");
		lblHealth.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblHealth.setBounds(10, 204, 46, 14);
		contentPane.add(lblHealth);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setForeground(Color.RED);
		textField_1.setBackground(Color.BLACK);
		textField_1.setBounds(388, 198, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEnemyHealth = new JLabel("Enemy health");
		lblEnemyHealth.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblEnemyHealth.setBounds(303, 200, 103, 14);
		contentPane.add(lblEnemyHealth);
	}
}
