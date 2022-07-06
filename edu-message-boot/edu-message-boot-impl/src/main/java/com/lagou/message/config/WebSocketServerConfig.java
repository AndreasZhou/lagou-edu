package com.lagou.message.config;

import com.lagou.message.server.Bootstrap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @author: ma wei long
 * @date: 2020年7月1日 下午8:27:18
*/
@Configuration
public class WebSocketServerConfig {
	
	@Bean
	public Bootstrap bootstrap() {
		return new Bootstrap();
	}
}