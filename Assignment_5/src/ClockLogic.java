import java.text.DecimalFormat;
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

		// System.out.println("alarmset");
	}

	public void clearAlarm() {
		setAlarm(-1, -1);
		ClockGUI.activateAlarm(false);
	}

	public void checkAlarmTime(int hour, int minute) {
		if (this.alarmHour == hour && this.alarmMinute == minute) {
			ClockGUI.Alarm();
			System.out.println("Alarm!");
		}
	}

	private class ClockThread extends Thread {

		@Override
		public void run() {
			while (true) {
				// System.out.println("Starting");

				Calendar cal = Calendar.getInstance();
				int second = cal.get(Calendar.SECOND);
				int minute = cal.get(Calendar.MINUTE);
				int hour = cal.get(Calendar.HOUR_OF_DAY);

				DecimalFormat timeFormat = new DecimalFormat("00");
				ClockGUI.setTimeOnLabel(
						timeFormat.format(hour) + ":" + timeFormat.format(minute) + ":" + timeFormat.format(second));

			//	if (ClockGUI.isAlarm()) {
			//		ClockGUI.checkAlarm(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
			//		System.out.println("waiting for alarm");
			//	}

				if (hour == alarmHour && minute == alarmMinute) {
					ClockGUI.activateAlarm(true);
				} else {
					ClockGUI.activateAlarm(false);
				}
				
				try {
					Thread.sleep(900);
				} catch (InterruptedException e) {
					e.printStackTrace();
					return;
				}
			}
		}
	}
}