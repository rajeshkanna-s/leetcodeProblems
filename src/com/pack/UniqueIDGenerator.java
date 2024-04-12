package com.pack;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
public class UniqueIDGenerator {
	
	
	/* public static String generateId() {
	        UUID uuid = UUID.randomUUID();
	        String uuidStr = uuid.toString().replace("-", "").substring(0, 8).toUpperCase(); // Change here!
	        return "EXC" + uuidStr;
	    }
	    public static void main(String[] args) {
	        System.out.println(generateId());
	    }
	 */
	public static void main(String[] args) {
        Set<String> uniqueIds = new HashSet<>();
        int count = 0;
        
        while (count < 200) {
            UUID uuid = UUID.randomUUID();
            String uuidStr = uuid.toString().replace("-", "").substring(0, 8).toUpperCase();
            String excId = "EXC" + uuidStr;
            if (!uniqueIds.contains(excId)) {
                uniqueIds.add(excId);
                count++;
            }
        }
        
        // Printing out the unique IDs
        for (String id : uniqueIds) {
            System.out.println(id);
        }
    }
}