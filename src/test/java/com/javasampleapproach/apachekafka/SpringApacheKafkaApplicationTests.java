package com.javasampleapproach.apachekafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.htmlunit.webdriver.WebConnectionHtmlUnitDriver;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.Method;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import com.keywords.LaunchingURLs;
import static com.jayway.restassured.RestAssured.*;

@RunWith(SpringRunner.class)
@SpringBootConfiguration()
@WebAppConfiguration
@SpringBootTest(
  classes = SpringApacheKafkaApplication.class)
public class SpringApacheKafkaApplicationTests {

	// @Autowired
	// LaunchingURLs launch;
	WebDriver driver;

	
	@Test
	public void contextLoads() {

//		driver = new SafariDriver();
//		driver.get("http://localhost:8080/jsa/kafka/producer/");
//		System.out.println("******************************************************************hello");
//
//		System.out.println("******************************************************************hello");
//
//		System.out.println("******************************************************************hello");
//		System.out.println("------------------->"+given().when().get("http://localhost:8080/jsa/kafka/producer/").then()
//				.extract().body().asString());
	}

	//@Test
	public void test() {

		RequestSpecification httpRequest = RestAssured.given();

		System.out.println("------------------->"+given().when().get("http://localhost:8080/jsa/kafka/producer/").then()
				.extract().body().asString());

//		// Make a request to the server by specifying the method Type and the
//		// method URL.
//		// This will return the Response from the server. Store the response in
//		// a variable.
//		Response response = httpRequest.request(Method.GET, "http://localhost:8080/jsa/kafka/consumer/");
//
//		// Now let us print the body of the message to see what response
//		// we have recieved from the server
//		String responseBody = response.getBody().asString();
//		System.out.println("Response Body is =>  " + responseBody);
//
//		LaunchingURLs.verifyLinkProducer("0000000000000000000000000");
//		LaunchingURLs.verifyLinkConsumer("111111111111111111111");
	}

}
