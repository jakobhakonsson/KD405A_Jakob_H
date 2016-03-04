import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.text.DecimalFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ClockGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblAlarmset;
	private boolean alarmSet;
	private ClockLogic clockLogic;
	private JTextField hourField;
	private JTextField minuteField;
	private JLabel clockLabel;
	private JLabel alarmLabel;
	private JLabel alarmMessageLabel;
	private JLabel photoLabel;
	DecimalFormat timeFormat = new DecimalFormat("00");

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
		setBounds(100, 100, 761, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		photoLabel = new JLabel("");
		photoLabel.setIcon(new ImageIcon("/Users/Jakob/Documents/GitHub/KD405A_Jakob_H/Assignment_5/src/hallstatt-night-with-church.jpg"));
		photoLabel.setBounds(15, 179, 491, 250);
		contentPane.add(photoLabel);
		
		hourField = new JTextField();
		hourField.setBounds(47, 102, 69, 26);
		contentPane.add(hourField);
		hourField.setColumns(10);
		
		minuteField = new JTextField();
		minuteField.setBounds(185, 103, 69, 26);
		contentPane.add(minuteField);
		minuteField.setColumns(10);
		
		JLabel lblHour = new JLabel("Hour:");
		lblHour.setBounds(0, 106, 43, 16);
		contentPane.add(lblHour);
		
		JLabel lblMinute = new JLabel("Minute:");
		lblMinute.setBounds(129, 108, 61, 16);
		contentPane.add(lblMinute);
		
		JButton btnSetAlarm = new JButton("Set Alarm");
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hourString = hourField.getText();
				int hour = Integer.parseInt(hourString);
				String minuteString = minuteField.getText();
				int minute = Integer.parseInt(minuteString);
				clockLogic.setAlarm(hour, minute);
				
				alarmLabel.setText("Alarm set at: " + hourField.getText() + ":" + minuteField.getText());
			}
		});
		btnSetAlarm.setBounds(273, 102, 117, 29);
		contentPane.add(btnSetAlarm);
		
		JButton btnClearAlarm = new JButton("Clear Alarm");
		btnClearAlarm.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				clockLogic.clearAlarm();
				alarmLabel.setText("");
				hourField.setText("");
				minuteField.setText("");
			}
		});
		btnClearAlarm.setBounds(129, 51, 117, 29);
		contentPane.add(btnClearAlarm);
		
		clockLabel = new JLabel("");
		clockLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		clockLabel.setBounds(410, 22, 138, 52);
		contentPane.add(clockLabel);
		
		alarmLabel = new JLabel("");
		alarmLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 18));
		alarmLabel.setBounds(410, 102, 138, 38);
		contentPane.add(alarmLabel);
		
		alarmMessageLabel = new JLabel("");
		alarmMessageLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		alarmMessageLabel.setBounds(410, 140, 138, 26);
		contentPane.add(alarmMessageLabel);
		
		clockLogic = new ClockLogic(this);

	}

	public void activateAlarm(boolean activate) {
		if (activate) {
			lblAlarmset.setText(" TIME TO WAKE!");
			photoLabel.setIcon(new ImageIcon("/Users/Jakob/Documents/GitHub/KD405A_Jakob_H/Assignment_5/src/Church-bells-001.jpg"));

		} else {
			lblAlarmset.setText(" ");
			photoLabel.setIcon(new ImageIcon("/Users/Jakob/Documents/GitHub/KD405A_Jakob_H/Assignment_5/src/hallstatt-night-with-church.jpg"));

		}
	}
	
	public void setTimeOnLabel(String AlarmTime) {
		// TODO Auto-generated method stub
		alarmLabel.setText(AlarmTime);
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


	

}

