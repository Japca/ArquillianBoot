package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.system.ApplicationPidFileWriter;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		final Map<String, Object> map = new HashMap<>();
		map.put("endpoints.shutdown.enabled", true);
		map.put("endpoints.shutdown.sensitive", false);
		new SpringApplicationBuilder(DemoApplication.class).listeners(new ApplicationPidFileWriter("app.pid"))
				.logStartupInfo(true).properties(map).run(args);
		SpringApplication.run(DemoApplication.class, args);
	}
}
