package com.mphasis.filter;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class PreFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		
		return true;
	}
 
	@Override
	public Object run() throws ZuulException {
		
		RequestContext requestContext = RequestContext.getCurrentContext();
		HttpServletRequest request = requestContext.getRequest();
		
		System.out.println("-------------In PreFilter----------------");
		System.out.println("Request URI: "+ request.getRequestURI());
		System.out.println("Request Method: "+ request.getMethod()); 
		
		return null;
	}

	@Override
	public String filterType() {
		
		return "pre"; 
	}

	@Override
	public int filterOrder() {
		
		return 0;
	}
 
}
