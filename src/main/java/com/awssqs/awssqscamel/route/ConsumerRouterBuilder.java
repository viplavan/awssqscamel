//package com.awssqs.awssqscamel.route;
//
//import org.apache.camel.builder.RouteBuilder;
//
//public class ConsumerRouterBuilder extends RouteBuilder {
//
//    @Override
//    public void configure() throws Exception {
//
//        String queue1 = "CamelQueue";
//        String queue2 = "ConsumerQueue";
//        from("aws2-sqs://queue1?amazonSQSClient=#amazonSQSClient&deleteIfFiltered=false")
//                .setHeader("identity").jsonpath("$['type']")
//                .filter(simple("${header.identity} == 'login'"))
//                .log("We have a message! ${body}")
//                .to("aws2-sqs://queue2?amazonSQSClient=#amazonSQSClient&deleteIfFiltered=false");
//    }
//}
