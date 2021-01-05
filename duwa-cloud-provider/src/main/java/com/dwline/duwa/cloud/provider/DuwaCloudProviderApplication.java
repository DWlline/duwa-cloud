package com.dwline.duwa.cloud.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.dwline.duwa.cloud.provider.mapper")
public class DuwaCloudProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DuwaCloudProviderApplication.class, args);
    }

}
