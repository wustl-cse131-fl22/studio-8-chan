package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	boolean holiday;
	int year;
	int month;
	int day;
	public Date(int year,int month,int day, boolean holiday) {
		// TODO Auto-generated constructor stub
		this.year = year;
		this.month = month;
		this.day = day;
		this.holiday = holiday;
	}
	
	public String getDate() {
		return month + " / " + day + " / " + year;
	}
    public static void main(String[] args) {
    	Date d01 = new Date(2022, 1, 1, false);
    	Date d011 = new Date(2022, 1, 1, true);
    	Date d02 = new Date(2022, 1, 1, false);
    	Date d03 = new Date(2022, 12, 31, false);
    	Date d04 = new Date(2022, 2, 1, false);
    	
    	
    	System.out.println("compare 1/1 (holiday) vs 1/1 (not holiday): "+ 
    			d01.equals(d011)
    			);
    	
    	System.out.println(d01.getDate());
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(d01);
    	list.add(d011);
    	list.add(d02);
    	list.add(d03);
    	list.add(d04);
    	System.out.println(list);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(d01);
    	set.add(d011);
    	set.add(d02);
    	set.add(d03);
    	set.add(d04);
    	System.out.println(set);
    }

	@Override
	public int hashCode() {
		return Objects.hash(day, holiday, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
