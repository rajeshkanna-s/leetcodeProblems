package com.pack;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
	
	public static void main(String[] args) {
        String inputDate = "2024-03-23"; // Your input date with time
        
        LocalTime currentTime = LocalTime.now();
        String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(inputDate+" "+formattedTime);
    }

}
