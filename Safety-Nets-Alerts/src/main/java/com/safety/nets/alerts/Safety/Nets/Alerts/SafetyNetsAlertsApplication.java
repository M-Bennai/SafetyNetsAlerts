package com.safety.nets.alerts.Safety.Nets.Alerts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories("com.safety.nets.alerts.Safety.Nets.Repository")
@SpringBootApplication
public class SafetyNetsAlertsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafetyNetsAlertsApplication.class, args);
	}

}
