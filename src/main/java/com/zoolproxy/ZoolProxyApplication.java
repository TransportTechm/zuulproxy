package com.zoolproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import com.zoolproxy.filters.pre.SimpleFilter;

@SpringBootApplication
@EnableZuulProxy
@RestController
public class ZoolProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZoolProxyApplication.class, args);
	}

	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}
}
