package com.pack;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class Fg {
	
    public static void main(String[] args) {
        //String inputDate = "12-07-2023";
        String inputDate = "24-08-2023";
        
        LocalDate inputDate1 = LocalDate.parse(inputDate, java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        //DayOfWeek day = dayOfWeek(inputDate1);
            List<LocalDate> lastSixBusinessDays = getLastSixBusinessDays(inputDate);
            
            //System.out.println("Last six business days:");
            for (LocalDate date : lastSixBusinessDays) {
                //System.out.println(date);
            }
            LocalDate date = LocalDate.parse(inputDate, java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            if(lastSixBusinessDays.contains(date)) {
            	//System.out.println("Yes in Last 6 Days");
            	LocalDate nextMonthDate = lastSixBusinessDays.get(0).plusDays(1);
            	weekendSkip(nextMonthDate);
            }else {
            	//System.out.println("Not in Last 6 Days");
            	if(dayOfWeek(date)!=DayOfWeek.SATURDAY && dayOfWeek(date)!=DayOfWeek.SUNDAY) {
            		//System.out.println("Invoice Date==="+date);
            	}else {
            		LocalDate weekendSkipDate =  weekendSkip(inputDate1);
            		if(lastSixBusinessDays.contains(weekendSkipDate)) {
            			getFirstBusinessDayOfNextMonth(weekendSkipDate);
            		}
            	}
            }
        
    }

    public static List<LocalDate> getLastSixBusinessDays(String dateString) {
        List<LocalDate> lastSixBusinessDays = new ArrayList<>();

        try {
            LocalDate date = LocalDate.parse(dateString, java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            LocalDate lastDayOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());

            int count = 0;
            while (count < 6) {
                if (isBusinessDay(lastDayOfMonth)) {
                    lastSixBusinessDays.add(lastDayOfMonth);
                    count++;
                }
                lastDayOfMonth = lastDayOfMonth.minusDays(1);
            }
        } catch (java.time.format.DateTimeParseException e) {
            System.out.println("Invalid date format.");
        }

        return lastSixBusinessDays;
    }

    public static boolean isBusinessDay(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY;
    }
    
    public static DayOfWeek dayOfWeek(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek;
    }
    
    public static LocalDate weekendSkip(LocalDate date) {
    	LocalDate nextMonthDate = date;
    	DayOfWeek dayOfWeek = nextMonthDate.getDayOfWeek();
    	if(dayOfWeek== DayOfWeek.SATURDAY){
    		nextMonthDate = nextMonthDate.plusDays(2); //3
        	int count =  0;
            while (count < 6) {
                if (isBusinessDay(nextMonthDate)) {
                	System.out.println(nextMonthDate);
                	break;
                }else {
                    count++;
                }
            }
    	}else if(dayOfWeek== DayOfWeek.SUNDAY){
    		nextMonthDate = nextMonthDate.plusDays(1);
        	int count =  0;
            while (count < 6) {
                if (isBusinessDay(nextMonthDate)) {
                	System.out.println(nextMonthDate);
                	break;
                }else {
                    count++;
                }
            }
    	}else {
        	int count =  0;
            while (count < 6) {
                if (isBusinessDay(nextMonthDate)) {
                	System.out.println(nextMonthDate);
                	break;
                }else {
                    count++;
                }
            }
    	}
    	return nextMonthDate;
    }
    
    public static LocalDate getFirstBusinessDayOfNextMonth(LocalDate dateString) {
    	LocalDate firstBusinessDay = null;
        try {
            //LocalDate date = LocalDate.parse(dateString, java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            LocalDate firstDayOfNextMonth = dateString.plusMonths(1).withDayOfMonth(1);

            firstBusinessDay = firstDayOfNextMonth;
            while (!isBusinessDay(firstBusinessDay)) {
                firstBusinessDay = firstBusinessDay.plusDays(1);
            }
            System.out.println(firstBusinessDay);
        } catch (java.time.format.DateTimeParseException e) {
            System.out.println("Invalid date format.");
        }
        return firstBusinessDay;
    }

}

