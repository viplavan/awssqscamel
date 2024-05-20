package com.awssqs.awssqscamel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.builder.endpoint.EndpointRouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class SQSRouteBuilder extends EndpointRouteBuilder {

    @Override
    public void configure() throws Exception {
        System.out.println("CamelContext routers about to add.");
        from(aws2Sqs("{{sqs-queue-name}}").deleteAfterRead(true).autoCreateQueue(true))
                .log("Received message from sourceQueue: ${body}")
                .to(aws2Sqs("{{sqs-queue2-name}}"))
        .log("Messages Published: ${body}");

    }
}
