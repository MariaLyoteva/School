package time;
import java.util.Date;
import java.util.*;
import java.text.*;

public class Time {
	private int hour = 0;
	private int minute = 0;
	private int second = 0;
	Time (int newHour, int newMinute, int newSecond){
		hour = newHour;
		minute = newMinute;
		second = newSecond;
	}
	Time (long a){
		Date date = new Date(a);
		SimpleDateFormat ft = new SimpleDateFormat ("HH");
		int b = Integer.parseInt(ft.format(date));
		hour = b;
		ft = new SimpleDateFormat ("mm");
		b = Integer.parseInt(ft.format(date));
		minute = b;
		ft = new SimpleDateFormat ("ss");
		b = Integer.parseInt(ft.format(date));
		second = b;
	}
	Time (){
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("HH");
		int a = Integer.parseInt(ft.format(date));
		hour = a;
		ft = new SimpleDateFormat ("mm");
		a = Integer.parseInt(ft.format(date));
		minute = a;
		ft = new SimpleDateFormat ("ss");
		a = Integer.parseInt(ft.format(date));
		second = a;
	}
	int getHour(){
		return hour;
	}
	int getMinute(){
		return minute;
	}
	int getSecond(){
		return second;
	}
	
}
