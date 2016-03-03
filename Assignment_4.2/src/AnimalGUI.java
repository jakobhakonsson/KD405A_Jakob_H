
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class AnimalGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
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

	public AnimalGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea txtAnimals = new JTextArea();
		txtAnimals.setBounds(0, 0, 586, 244);
		contentPane.add(txtAnimals);
		ArrayList<Animal> Animals = new ArrayList<Animal>();
		Animals.add(new Dog("Canis", 34, true));
		Animals.add(new Dog("Canis", 2, false, "Sven"));
		Animals.add(new Snake("Vipera berus", true, "Huggorm"));
		Animals.add(new Snake("Hydrus", false, ""));
		Animals.add(new Cat("Felis silvestris catus", 5, 9, "Frasse"));
		Animals.add(new Cat("Felis catus", 10, 2, ""));
		Animals.add(new Koala ("Phascolarctos cinereus", 3, true, ""));
		for (int i = 0; i < Animals.size(); i++) {
			System.out.println(Animals.get(i).getInfo());
			txtAnimals.append(Animals.get(i).getInfo() + "\n");
		}

	}
}