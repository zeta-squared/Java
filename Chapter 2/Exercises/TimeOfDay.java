public record TimeOfDay(int hour, int minute) {
	public TimeOfDay {
		hour %= 24;
		hour += minute/60;
		minute %= 60;
	}

	public TimeOfDay plusMinutes(int minutes) {
		return new TimeOfDay(this.hour(), this.minute() + minutes);
	}

	public int minutesFrom(TimeOfDay other) {
		int hDiff = (this.hour() - other.hour()) * 60;
		int mDiff = this.minute() - other.minute();
		return Math.abs(hDiff + mDiff);
	}

	public static void main(String[] args) {
		TimeOfDay morning = new TimeOfDay(7, 20);
		System.out.printf("TimeOfDay(7, 20).hour() = %d " +
				"TimeOfDay(7, 20).minute() = %d\n", morning.hour(),
				morning.minute());

		TimeOfDay afternoon = new TimeOfDay(39, 90);
		System.out.printf("TimeOfDay(39, 90).hour() = %d " +
				"TimeOfDay(39, 90).minute() = %d\n", afternoon.hour(),
				afternoon.minute());

		TimeOfDay morningTea = morning.plusMinutes(40);
		System.out.printf("TimeOfDay(7, 20).plusMinutes(40).hour() = %d " +
				"TimeOfDay(7, 20).plusMinutes(40).minute() = %d\n",
				morningTea.hour(), morningTea.minute());

		TimeOfDay time1 = new TimeOfDay(11, 20);
		TimeOfDay time2 = new TimeOfDay(7, 30);
		System.out.printf("TimeOfDay(7, 30).minutesFrom(TimeOfDay(11, 20)) = %d\n",
				time2.minutesFrom(time1));

		TimeOfDay time3 = new TimeOfDay(11, 30);
		System.out.printf("TimeOfDay(7, 20).minutesFrom(TimeOfDay(11, 30)) = %d\n",
				morning.minutesFrom(time3));
	}
}
