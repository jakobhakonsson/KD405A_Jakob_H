package mah.assignmentett;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Assignment_1 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtPelleSvensson;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtsvgen;
	private JTextField textField_2;
	private JTextField txtPellegmailcom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignment_1 frame = new Assignment_1();
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
	public Assignment_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 460);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JCheckBoxMenuItem chckbxmntmSkrivUt = new JCheckBoxMenuItem("Skriv ut");
		mnArkiv.add(chckbxmntmSkrivUt);
		
		JCheckBoxMenuItem chckbxmntmAvsluta = new JCheckBoxMenuItem("Avsluta");
		mnArkiv.add(chckbxmntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JCheckBoxMenuItem chckbxmntmNyMedlem = new JCheckBoxMenuItem("Ny medlem");
		mnMedlem.add(chckbxmntmNyMedlem);
		
		JCheckBoxMenuItem chckbxmntmHittaMedlem = new JCheckBoxMenuItem("Hitta medlem");
		mnMedlem.add(chckbxmntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JCheckBoxMenuItem chckbxmntmHjlp = new JCheckBoxMenuItem("Hj\u00E4lp");
		mnHjlp.add(chckbxmntmHjlp);
		
		JCheckBoxMenuItem chckbxmntmOmProgrammet = new JCheckBoxMenuItem("Om programmet");
		mnHjlp.add(chckbxmntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(357, 120, 355, 267);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"512", "Aaron Anderson"},
				{"235", "Abel Andersen"},
				{"239", "Goran Andersen"},
				{"221", "Karin Bengtsson"},
				{"643", "Pelle Blomkvist"},
				{"754", "Marcus Bader"},
				{"432", "Tim Bengtsson"},
				{"245", "Per Danielson"},
				{"153", "Kristoffer Damfri"},
				{"754", "Erik Frisk"},
				{"265", "Anders Flores"},
				{"975", "Karl Finn"},
				{"364", "Erik Gunnarsson"},
				{"957", "\u00D6rjan H\u00E5kansson"},
				{"274", "B\u00F6rjan Henriksson"},
				{"468", "Mikael Johnsson"},
				{"632", "Karl Johansson"},
			},
			new String[] {
				"Medlems nr.", "Namn"
			}
		));
		scrollPane.setViewportView(table);
		
		txtPelleSvensson = new JTextField();
		txtPelleSvensson.setText("Pelle Svansson");
		txtPelleSvensson.setBounds(97, 36, 116, 22);
		contentPane.add(txtPelleSvensson);
		txtPelleSvensson.setColumns(10);
		
		textField = new JTextField();
		textField.setText("12");
		textField.setBounds(97, 71, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNamn = new JLabel("Namn");
		lblNamn.setLabelFor(txtPelleSvensson);
		lblNamn.setBounds(12, 37, 45, 19);
		contentPane.add(lblNamn);
		
		JLabel lblMedlemsnr = new JLabel("Medlemsnr:");
		lblMedlemsnr.setLabelFor(textField);
		lblMedlemsnr.setBounds(12, 71, 84, 22);
		contentPane.add(lblMedlemsnr);
		
		JLabel lblPersonnr = new JLabel("Personnr:");
		lblPersonnr.setBounds(12, 102, 71, 31);
		contentPane.add(lblPersonnr);
		
		textField_1 = new JTextField();
		lblPersonnr.setLabelFor(textField_1);
		textField_1.setText("810601 - 0061");
		textField_1.setBounds(97, 106, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setBounds(12, 137, 104, 31);
		contentPane.add(lblAdress);
		
		txtsvgen = new JTextField();
		lblAdress.setLabelFor(txtsvgen);
		txtsvgen.setText("\u00C5sv\u00E4gen 6");
		txtsvgen.setBounds(97, 141, 116, 22);
		contentPane.add(txtsvgen);
		txtsvgen.setColumns(10);
		
		JLabel lblTelefonnr = new JLabel("Telefonnr:");
		lblTelefonnr.setBounds(12, 169, 101, 36);
		contentPane.add(lblTelefonnr);
		
		textField_2 = new JTextField();
		lblTelefonnr.setLabelFor(textField_2);
		textField_2.setText("555-89 98 99");
		textField_2.setBounds(97, 176, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setBounds(12, 214, 56, 16);
		contentPane.add(lblEmail);
		
		txtPellegmailcom = new JTextField();
		lblEmail.setLabelFor(txtPellegmailcom);
		txtPellegmailcom.setText("pelle@gmail.com");
		txtPellegmailcom.setBounds(97, 211, 116, 22);
		contentPane.add(txtPellegmailcom);
		txtPellegmailcom.setColumns(10);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSpara.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSpara.setBounds(55, 271, 97, 25);
		contentPane.add(btnSpara);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Jakob\\Documents\\GitHub\\KD405A_Jakob_H\\mah.assignmentett\\src\\mah\\assignmentett\\pics\\faf.jpg"));
		label_1.setBounds(224, 34, 121, 295);
		contentPane.add(label_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Jakob\\Documents\\GitHub\\KD405A_Jakob_H\\mah.assignmentett\\src\\mah\\assignmentett\\pics\\okma.jpg"));
		label.setBounds(357, 0, 355, 119);
		contentPane.add(label);
		
	}
}
