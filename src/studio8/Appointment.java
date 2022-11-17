package studio8;

import java.util.Objects;

public class Appointment {
	Time time;
	Date date;
	
	
	public Appointment(int year, int month, int day, int hour, int munite, boolean holiday) {
		this.date = new Date(year, month, day, holiday);
		this.time = new Time(hour, munite);
	}
	
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
