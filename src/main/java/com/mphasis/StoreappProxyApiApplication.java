package com.mphasis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.mphasis.filter.ErrorFilter;
import com.mphasis.filter.PostFilter;
import com.mphasis.filter.PreFilter;
import com.mphasis.filter.RouteFilter;

@EnableZuulProxy 
@SpringBootApplication
public class StoreappProxyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreappProxyApiApplication.class, args);
	}
	
	@Bean
	PreFilter getPreFilter() {
		
		return new PreFilter();
	}
	
	@Bean
	PostFilter getPostFilter() {
		
		return new PostFilter();
	}
	
	@Bean
	RouteFilter getRouteFilter() {
		
		return new RouteFilter();
	}
	
	@Bean
	ErrorFilter getErrorFilter() {
		
		return new ErrorFilter();  
	}

}
