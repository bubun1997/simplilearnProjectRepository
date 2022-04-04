package com.soumya.edgeserverandrouting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy
public class EdgeServerAndRoutingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeServerAndRoutingApplication.class, args);
	}

}
