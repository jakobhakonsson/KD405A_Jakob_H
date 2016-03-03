import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JScrollPane;

public class BikeShopGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textSize;
	private JTextField textColor;
	private JTextField textPrice;
	private JScrollPane scrollPane;
	private Bikeshop bikeshop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeShopGUI frame = new BikeShopGUI();
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
	public BikeShopGUI() {
		bikeshop = new Bikeshop();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 267);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 62, 440, 111);
		contentPane.add(scrollPane);

		JTextArea textArea = new JTextArea();
		textArea.setText("");
		scrollPane.setViewportView(textArea);
		textArea.setBackground(Color.WHITE);
		textArea.setForeground(Color.GRAY);
		textArea.setFont(new Font("Avenir", Font.PLAIN, 15));

		textSize = new JTextField();
		textSize.setBounds(112, 186, 74, 29);
		contentPane.add(textSize);
		textSize.setColumns(10);

		textColor = new JTextField();
		textColor.setBounds(279, 186, 74, 29);
		textColor.setColumns(10);
		contentPane.add(textColor);

		textPrice = new JTextField();
		textPrice.setBounds(441, 186, 74, 29);
		textPrice.setColumns(10);
		contentPane.add(textPrice);

		JButton btnNewButton = new JButton("NEW BIKE");
		btnNewButton.setBounds(441, 62, 166, 111);
		btnNewButton.setFont(new Font("Avenir", Font.BOLD, 15));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int convertSize = Integer.parseInt(textSize.getText());
				int convertPrice = Integer.parseInt(textPrice.getText());

				bikeshop.addBike(textColor.getText(), convertSize, convertPrice);
				textArea.setText(bikeshop.getAllBikes1());
				textColor.setText("");
				textSize.setText("");
				textPrice.setText("");
			}
		});
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Cykelaff\u00E4r");
		lblNewLabel.setBounds(34, 4, 371, 45);
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblNewLabel);

		JLabel lblSize = new JLabel("SIZE");
		lblSize.setBounds(54, 185, 56, 29);
		lblSize.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblSize);

		JLabel lblColor = new JLabel("COLOR");
		lblColor.setBounds(210, 186, 57, 29);
		lblColor.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblColor);

		JLabel lblPrice = new JLabel("PRICE");
		lblPrice.setBounds(373, 191, 56, 16);
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblPrice);
	}
}