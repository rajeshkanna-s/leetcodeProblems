package com.pack;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class DateFormatter {
public static void main(String[] args) {
		
		Date date = new Date();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-yy");
	    LocalDate localDate = LocalDate.now();
	    System.out.println("TODAY DATE: "+ dtf.format(localDate)); 
		  
	    //create object of SimpleDateFormat class with custom format
	    SimpleDateFormat sdf = new SimpleDateFormat("MM-yy");
	    String strDate = sdf.format(date);
	    System.out.println("formatted date in mm/dd/yy : " + strDate);
	    
	    ArrayList<Object> arr = new ArrayList<Object>();

	    for(int i=1; i<=60; i++ ) {
	    
	    //System.out.println(dtf.format(localDate.now().minusMonths(i)));
	    arr.add(dtf.format(localDate.now().minusMonths(i)));
	    
	    }
	    
	    System.out.println(arr.size());
	}

	
	}
	