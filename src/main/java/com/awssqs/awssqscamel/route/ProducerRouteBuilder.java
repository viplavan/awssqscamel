//package com.awssqs.awssqscamel.route;
//
//import org.apache.camel.builder.RouteBuilder;
//
//import java.util.Random;
//
//public class ProducerRouteBuilder extends RouteBuilder {
//
//
//            Random randomGenerator = new Random();
//            private static final int MAX = 10;
//
//            private static final String LOGIN_MESSAGE =
//                    "{" +
//                            "\"type\": \"login\"," +
//                            "\"payload\" : {" +
//                            "\"name\": \"ceposta\", " +
//                            "\"city\": \"phoenix\"" +
//                            "}" +
//                            "}";
//
//            private static final String LOGOUT_MESSAGE =
//                    "{" +
//                            "\"type\": \"logout\"," +
//                            "\"payload\" : {" +
//                            "\"name\": \"ceposta\", " +
//                            "\"city\": \"phoenix\"" +
//                            "}" +
//                            "}";
//
//            @Override
//            public void configure () throws Exception {
//
//                String queue1 = "CamelQueue";
//                // every two seconds, send a message to the "demo" queue in SQS
//                from("timer:kickoff?period=5000")
//                        .setBody().method(this, "generateJsonString")
//                        .to("aws2-sqs://queue1?amazonSQSClient=#amazonSQSClient&defaultVisibilityTimeout=2");
//
//            }
//
//            public Object generateJsonString () {
//                int rand = randomGenerator.nextInt(MAX);
//                if ((rand % 2) == 0) {
//                    return LOGIN_MESSAGE;
//                } else {
//                    return LOGOUT_MESSAGE;
//                }
//            }
//        }
