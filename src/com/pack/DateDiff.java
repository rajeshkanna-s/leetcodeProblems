package com.pack;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DateDiff {
	
	
	
	
	
	
		void maxDiff()
		{
			
			String string[] = {"Mon Jan 02 15:17:50 IST 2023",
					   "Mon Jan 02 15:21:27 IST 2023",
					   "Mon Jan 02 15:25:02 IST 2023",
					   "Mon Jan 02 16:59:10 IST 2023",
					   "Tue Jan 03 16:09:31 IST 2023",
					   "Tue Jan 03 16:11:08 IST 2023",
					   "Tue Jan 03 16:13:53 IST 2023"};
			
			ArrayList list1 = new ArrayList<>();
			
			DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
			Date date = null;
			try {
				for (int i = 0; i < string.length; i++)
				{
					list1.add((Date)formatter.parse(string[i]));
			 

			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			String formatedDate = cal.get(Calendar.DATE) + "/" + 
			                     (cal.get(Calendar.MONTH) + 1) + "/" +  
					             cal.get(Calendar.YEAR )+" "+ 
			                     cal.get(Calendar.HOUR_OF_DAY)+":"+
			                     cal.get(Calendar.MINUTE)+":"+
			                     cal.get(Calendar.SECOND);
			
			System.out.println("formatedDate : " + formatedDate); 
			
				}
			int arr[] = {1, 2, 3, 4, 5};
			System.out.println("string[0]=="+string[0]);
			ArrayList list = new ArrayList<>();
			int i, j;
			System.out.println("string.length="+string.length);
			for (i = 0; i < string.length; i++)
			{
				for (j = i + 1; j < j+1; j++)
				{
					//if (arr[j] - arr[i] > list.size())
						//list.add( string[j] - string[i]);
					System.out.println(arr[j] - arr[i]+"==="+list.get(i));
				}
			}
			}catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		/* Driver program to test above functions */
		public static void main(String[] args)
		{
			DateDiff maxdif = new DateDiff();
			maxdif.maxDiff();
			
			
									
		}
	

	// This code has been contributed by Mayank Jaiswal


}
