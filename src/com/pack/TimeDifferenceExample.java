package com.pack;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TimeDifferenceExample {
    public static void main(String[] args) {
    	
    	ArrayList<String> list = new ArrayList<String>();
    	String jsonData = "[{\"roi\":\"\",\"sno\":1,\"tenure\":\"\",\"acm_name\":\"System\",\"k_status\":\"Application\",\"loan_amt\":\"\",\"insert_dt\":\"Mon Mar 06 18:39:22 IST 2023\",\"losNumber\":\"\",\"request_id\":\"d70c01e7-0c59-4c09-848c-60236585c256\",\"sub_status\":\"PAN Verification Pending\",\"prospect_id\":\"7d9a3b4b-ecee-419d-a3cf-4d9e1e95851f\",\"application_id\":\"ABF-M-23384240-01\",\"finn_application_id\":\"\"},{\"roi\":\"13.99\",\"sno\":2,\"tenure\":\"60\",\"acm_name\":\"System\",\"k_status\":\"Application\",\"loan_amt\":\"700000\",\"insert_dt\":\"Mon Mar 06 18:46:48 IST 2023\",\"losNumber\":\"\",\"request_id\":\"d70c01e7-0c59-4c09-848c-60236585c256\",\"sub_status\":\"PAN Verification Active\",\"prospect_id\":\"7d9a3b4b-ecee-419d-a3cf-4d9e1e95851f\",\"application_id\":\"ABF-M-23384240-01\",\"finn_application_id\":\"\"},{\"roi\":\"13.99\",\"sno\":3,\"tenure\":\"60\",\"acm_name\":\"System\",\"k_status\":\"Application\",\"loan_amt\":\"700000\",\"insert_dt\":\"Mon Mar 06 18:51:14 IST 2023\",\"losNumber\":\"\",\"request_id\":\"d70c01e7-0c59-4c09-848c-60236585c256\",\"sub_status\":\"PAN Verification Active\",\"prospect_id\":\"7d9a3b4b-ecee-419d-a3cf-4d9e1e95851f\",\"application_id\":\"ABF-M-23384240-01\",\"finn_application_id\":\"\"},{\"roi\":\"13.99\",\"sno\":4,\"remark\":\"\",\"tenure\":\"60\",\"acm_name\":\"System\",\"k_status\":\"Credit Approval\",\"loan_amt\":\"700000\",\"insert_dt\":\"Mon Mar 06 18:53:17 IST 2023\",\"losNumber\":\"\",\"request_id\":\"d70c01e7-0c59-4c09-848c-60236585c256\",\"sub_status\":\"\",\"prospect_id\":\"7d9a3b4b-ecee-419d-a3cf-4d9e1e95851f\",\"application_id\":\"ABF-M-23384240-01\",\"finn_application_id\":\"\"}]";
    			
    	try {
            JSONArray jsonArray = new JSONArray(jsonData);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String insertDt = jsonObject.getString("insert_dt");
                list.add(insertDt);
                
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    	ArrayList<Map<String, Long>> timeDiffs = new ArrayList<>();
    	
    	for (int i = 1; i < list.size(); i++) {
    	    String str1 = list.get(i-1);
    	    String str2 = list.get(i);
    	    Map<String, Long> timeDiff = getTimeDifference(str1, str2);
    	    timeDiffs.add(timeDiff);
    	}
    	System.out.println(timeDiffs);
    	
    	// add elements to the list

    	for (Map<String, Long> timeDiff : timeDiffs) {
    	    long days = timeDiff.get("days");
    	    long hours = timeDiff.get("hours");
    	    long minutes = timeDiff.get("minutes");
    	    long seconds = timeDiff.get("seconds");
    	    
    	    // use the variables as required
    	    System.out.println("Time difference between : " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    	}
  
    }
    
    public static Map<String, Long> getTimeDifference(String str1, String str2) {
        DateFormat format = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
        try {
            Date date1 = format.parse(str1);
            Date date2 = format.parse(str2);
            long diffInMillis = Math.abs(date2.getTime() - date1.getTime());

            long seconds = TimeUnit.MILLISECONDS.toSeconds(diffInMillis) % 60;
            long minutes = TimeUnit.MILLISECONDS.toMinutes(diffInMillis) % 60;
            long hours = TimeUnit.MILLISECONDS.toHours(diffInMillis) % 24;
            long days = TimeUnit.MILLISECONDS.toDays(diffInMillis);

            Map<String, Long> timeDiff = new TreeMap<>();
            timeDiff.put("days", days);
            timeDiff.put("hours", hours);
            timeDiff.put("minutes", minutes);
            timeDiff.put("seconds", seconds);

            return timeDiff;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}

