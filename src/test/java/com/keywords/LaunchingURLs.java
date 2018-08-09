package com.keywords;

import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.Assert;


public class LaunchingURLs {
	
	public static String verifyLinkConsumer(String linkName) {
		URL url;
		String message = "";
		try {
			url = new URL("http://localhost:8080/jsa/kafka/consumer/");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.connect();
			int code = connection.getResponseCode();
			System.out.println(code);
			if (code == 401)
				System.out.println("[401]: " + linkName);
			else
				Assert.assertTrue(code < 400 || code == 403, "Broken link: " + linkName);
			message = "Info :: " + linkName;
		} catch (ConnectException ex) {
			System.out.println("Error Reference is: " + linkName);
			Assert.fail("Link is broken");
			message = "Error :: " + linkName;
		} catch (Exception e) {
			message = "Error :: " + linkName;
		}
		return message;
	}
	
	public static String verifyLinkProducer(String linkName) {
		URL url;
		String message = "";
		try {
			url = new URL("http://localhost:8080/jsa/kafka/producer/");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.connect();
			int code = connection.getResponseCode();
			System.out.println(code);
			if (code == 401)
				System.out.println("[401]: " + linkName);
			else
				Assert.assertTrue(code < 400 || code == 403, "Broken link: " + linkName);
			message = "Info :: " + linkName;
		} catch (ConnectException ex) {
			System.out.println("Error Reference is: " + linkName);
			Assert.fail("Link is broken");
			message = "Error :: " + linkName;
		} catch (Exception e) {
			message = "Error :: " + linkName;
		}
		return message;
	}


}
