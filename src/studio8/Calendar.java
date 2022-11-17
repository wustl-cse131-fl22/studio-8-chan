package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Calendar {
	Set<Appointment> appointments;
	public Calendar() {
		appointments = new HashSet<>();
	}
	
	public void addAppointment(int year, int month, int day, int hour, int munite, boolean holiday) {
		Appointment app01 = new Appointment(year, month, day, hour, munite, holiday);
		appointments.add(app01);
	}
	
	public void addAppointment(Appointment app02) {
		appointments.add(app02);
	}
	
	public void printCalender() {
		System.out.print(appointments.toString());
	}
}
