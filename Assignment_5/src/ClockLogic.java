import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClockLogic {

	private ClockGUI ClockGUI;
	private int alarmHour;
	private int alarmMinute;

	public ClockLogic(ClockGUI ClockGUI) {
		this.ClockGUI = ClockGUI;
		new ClockThread().start();
	}

	public void setAlarm(int hour, int minute) {
		this.alarmHour = hour;
		this.alarmMinute = minute;

		System.out.println("alarmset");
	}

	public void clearAlarm() {
	}

	public void checkAlarmTime(int hour, int minute) {
		if (this.alarmHour == hour && this.alarmMinute == minute) {
			ClockGUI.Alarm();
			System.out.println("Alarm!");
		}
	}

	public class ClockThread extends Thread {

		@Override
		public void run() {
			DecimalFormat timeFormat = new DecimalFormat("00");
			while (true) {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println("Starting");
				Calendar cal = Calendar.getInstance();
				if (ClockGUI.isAlarm()) {
					ClockGUI.checkAlarm(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
					System.out.println("waiting for alarm");
				}

				int second = cal.get(Calendar.SECOND);
				int minute = cal.get(Calendar.MINUTE);
				int hour = cal.get(Calendar.HOUR_OF_DAY);
				ClockGUI.setTimeOnLabel(
						timeFormat.format(hour) + ":" + timeFormat.format(minute) + ":" + timeFormat.format(second));

			}
		}
	}
}