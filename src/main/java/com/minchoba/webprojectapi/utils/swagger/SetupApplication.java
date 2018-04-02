package com.minchoba.webprojectapi.utils.swagger;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@ComponentScan
@Import(SwaggerConfig.class)
public class SetupApplication extends WebMvcConfigurationSupport{
	
}
