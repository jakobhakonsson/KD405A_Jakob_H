package groda;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class frogGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtHejDinLilla;
	private bla[]  myFrogs;

	private ArrayList<bla> frogArmy = new ArrayList<bla>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frogGUI frame = new frogGUI();
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
	public frogGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		bla frog1 = new bla(1, "Kalle", 100);
		
		String frog1Name = frog1.getName();
		int frogAge = frog1.getAge();
		int frogSize = frog1.getSize();
		
		myFrogs = new bla[3];
		
		myFrogs[0] = new bla(70, "Joel", 1);
		myFrogs[1] = new bla (20, "Boll", 40);
		myFrogs[2] = new bla (10, "minigrodan", 1);
		
		for(int i = 0; i <100; i++){
			frogArmy.add(new bla(1, "identiskGroda", 20));
		}
		
		
		
		txtHejDinLilla = new JTextField();
		txtHejDinLilla.setText(frog1Name + " " +frogAge + " " + frogSize);
		txtHejDinLilla.setBounds(12, 152, 610, 126);
		contentPane.add(txtHejDinLilla);
		txtHejDinLilla.setColumns(10);
		
		for(int i = 0; i <myFrogs.length; i++){
			txtHejDinLilla.setText(myFrogs[i].getName() + " "); 
		}
		
		
	}
}
