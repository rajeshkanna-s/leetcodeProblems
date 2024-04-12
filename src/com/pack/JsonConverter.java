package com.pack;
import org.json.JSONException;
import org.json.JSONObject;
public class JsonConverter {

	// Method to convert one String to JSON
    public static String convertToJsonString(String string) {
        JSONObject jsonObject = new JSONObject();
        try {
			jsonObject.put("string", string);
		} catch (JSONException e) {
			e.printStackTrace();
		}
        return jsonObject.toString();
    }

    // Method to convert multiple Strings to JSON
    public static String convertToJsonString(String... strings) {
        JSONObject jsonObject = new JSONObject();
        for (int i = 0; i < strings.length; i++) {
            try {
				jsonObject.put("string" + (i + 1), strings[i]);
			} catch (JSONException e) {
				e.printStackTrace();
			}
        }
        return jsonObject.toString();
    }

    public static void main(String[] args) {
        String singleStringJson = convertToJsonString("Hello");
        System.out.println("Single String JSON: " + singleStringJson);

        String multipleStringJson = convertToJsonString("Hello", "World", "OpenAI", "Java", "Rajesh");
        System.out.println("Multiple Strings JSON: " + multipleStringJson);
    }
}
