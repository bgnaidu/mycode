package com.mqmft.rest.api.utility;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

@Configuration
public class MQMFTCommonUtility {

	public static String getJsonResponse(Object result, String responseType) {
		JSONObject jsonResponse = new JSONObject();
		if (responseType.equalsIgnoreCase("Ok")) {

			try {
				jsonResponse.put("Success", true);
				jsonResponse.put("Message", "Ok");
				jsonResponse.put("Result", result);
			} catch (JSONException e) {
				e.printStackTrace();
			}

		} else {

			try {
				jsonResponse.put("Success", false);
				jsonResponse.put("Message", responseType);
				jsonResponse.put("Result", "");
			} catch (JSONException e) {
				e.printStackTrace();
			}

		}
		return jsonResponse.toString();
	}

	public static HttpHeaders getHttpResponseHeader() {
		HttpHeaders responseHeaders = new HttpHeaders();
//		responseHeaders.set("Access-Control-Allow-Origin", "*");
		return responseHeaders;
	}
}
