package com.maple.pro.courier.usermanagementms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration;
import org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchRestClientAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, ElasticsearchDataAutoConfiguration.class, ElasticsearchRestClientAutoConfiguration.class })
public class UserManagementMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementMsApplication.class, args);
	}

}
