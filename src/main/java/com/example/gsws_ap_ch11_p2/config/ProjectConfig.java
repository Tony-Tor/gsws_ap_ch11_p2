package com.example.gsws_ap_ch11_p2.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.example.gsws_ap_ch11_p2")
public class ProjectConfig {
}
