package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Configuration
public class CustomFilter implements GlobalFilter{
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomFilter.class);

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		ServerHttpRequest request = exchange.getRequest();
		
		LOGGER.info("Authorization = "+request.getHeaders().getFirst("Authorization"));
		
		return chain.filter(exchange)
				.then(Mono.fromRunnable(() -> {
					ServerHttpResponse response = exchange.getResponse();
					LOGGER.info("Post Filter = "+ response.getStatusCode());
				}));
	}
	
	
}
