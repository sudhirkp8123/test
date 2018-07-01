package com.java.camel;


import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
 
@Component
public class MyRoute extends RouteBuilder {
 
    @Override
    public void configure() throws Exception {
    	// copy file : file:D://reportlogs?noop=true
    	// After Copy file moved to processed : file:D://reportlogs?move=./processed
    	// After Copy file deleted: file:D://reportlogs?delete=true
    	from("file:D://reportlogs?delete=true").to("file:D://outputFolder");
    }
}
