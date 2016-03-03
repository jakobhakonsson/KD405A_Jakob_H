import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ClockGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblAlarmset;
	private boolean alarmSet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClockGUI frame = new ClockGUI();
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
	public ClockGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	public void activateAlarm(boolean activate) {
		if (activate) {
			lblAlarmset.setText(" TIME TO WAKE!");
		} else {
			lblAlarmset.setText(" ");
		}
	}

	public boolean isAlarm() {
		return alarmSet;
	}

	public void checkAlarm(int hour, int minute) {
		// clockLogic.checkAlarmTime(hour, minute);
	}

	public void Alarm() {
		lblAlarmset.setText("ALARM");
	}

	public void setTimeOnLabel(String string) {
		// TODO Auto-generated method stub

	}
}
