package studio8;

import java.util.Objects;

public class Time {
	int hour;
	int minute;
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	public String getTime(boolean twentyFourHour) {
		if (twentyFourHour) {
			return hour + " : " + minute;
		} 
		return (hour - 12) + " : " + minute;
	}
	
	public static void main(String[] args) {
		Time t01 = new Time(23, 11);
		System.out.println(t01.getTime(true));
		Time t02 = new Time(23, 11);
		System.out.println(t02.getTime(false));
    }
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

}