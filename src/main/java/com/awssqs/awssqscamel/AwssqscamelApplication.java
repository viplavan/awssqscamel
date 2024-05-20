//package com.awssqs.awssqscamel;
//
//import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
//import com.amazonaws.services.sqs.AmazonSQS;
//import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
//import org.apache.camel.main.Main;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class AwssqscamelApplication {
//
//	public static void main(String[] args) throws Exception {
//
//		// Instantiate AmazonSQSClient using DefaultAWSCredentialsProviderChain
//		AmazonSQS amazonSQSClient = AmazonSQSClientBuilder.standard()
//				.withRegion("us-east-1")
//				.withCredentials(DefaultAWSCredentialsProviderChain.getInstance())
//				.build();
//
//		// use Camels Main class
//
//		Main main = new Main(AwssqscamelApplication.class);
//		main.bind("amazonSQSClient", amazonSQSClient);
//		// now keep the application running until the JVM is terminated (ctrl + c or sigterm)
//		main.run(args);
//	}
//	}
//
