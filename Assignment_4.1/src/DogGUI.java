
//package se.mah.ke.k3lara.Assignment4A;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class DogGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtHuman;
	private JTextField txtDog;
	private JTextArea txtInfo;
	Human human;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DogGUI frame = new DogGUI();
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

	public DogGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 374);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtHuman = new JTextField();
		txtHuman.setBounds(87, 38, 146, 26);
		contentPane.add(txtHuman);
		txtHuman.setColumns(10);

		txtDog = new JTextField();
		txtDog.setBounds(87, 102, 146, 26);
		contentPane.add(txtDog);
		txtDog.setColumns(10);

		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.setBounds(255, 37, 131, 29);
		contentPane.add(btnNewHuman);

		JButton btnNewDog = new JButton("New Dog");

		btnNewDog.setBounds(255, 101, 131, 29);
		contentPane.add(btnNewDog);

		JButton btnPrntInfo = new JButton("Print Info");

		btnPrntInfo.setBounds(175, 149, 131, 29);
		contentPane.add(btnPrntInfo);

		JPanel panel = new JPanel();
		panel.setBounds(34, 191, 401, 124);
		contentPane.add(panel);
		panel.setLayout(null);

		txtInfo = new JTextArea();
		txtInfo.setBounds(15, 16, 371, 95);
		panel.add(txtInfo);

		JLabel lblNewLabel = new JLabel("Human name:");
		lblNewLabel.setBounds(50, 13, 81, 20);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Dog name:");
		lblNewLabel_1.setBounds(62, 75, 69, 20);
		contentPane.add(lblNewLabel_1);

		/** Button to add Human */

		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtHuman.getText().length() < 3) {
					JOptionPane.showMessageDialog(null, "ERROR! Namn saknas!");

				} else {
					human = new Human(txtHuman.getText());
				}

			}
		});

		/** Button to print info */

		btnPrntInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtHuman.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "ERROR! En hund måste ha en ägare");
				} else {
					txtInfo.setText(human.getInfo());
				}

			}
		});

		/** Button to add new Dog */

		btnNewDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtHuman.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "ERROR! Du måste skapa en ägare före du skapar en hund");
				} else {
					Dog dog = new Dog(txtDog.getText());
					human.buyDog(dog);
				}

			}
		});
	}
}