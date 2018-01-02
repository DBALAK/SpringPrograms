package com.datetimeAPI;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;import java.time.ZoneId;

// Date is now immutable in java 8
// Date is only given,it will not give time
public class DateTimeAPI {
	
	public static void main(String[] args) {
		LocalDate d=LocalDate.now();
		System.out.println(d);
		
		LocalDate d1=LocalDate.of(1990, Month.MARCH, 20);
		System.out.println(d1);
		
		LocalTime t=LocalTime.now(); // LocalTime.of(12,35,29);
		System.out.println(t);
		
		LocalTime t1=LocalTime.now(ZoneId.of("Asia/Kuwait"));
		System.out.println(t1);
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		Instant i=Instant.now(); //Machine readbale
		System.out.println(i);
		
	}

}
