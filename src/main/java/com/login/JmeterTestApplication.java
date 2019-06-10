package com.login;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.SpringServletContainerInitializer;

import com.login.domain.LoginVoImpl;
import com.login.repository.LoginRepository;

@SpringBootApplication
public class JmeterTestApplication extends SpringServletContainerInitializer implements CommandLineRunner{

	@Autowired
	private LoginRepository loginRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JmeterTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		LoginVoImpl login1 = new LoginVoImpl(null,"willian","123456");
		LoginVoImpl login2 = new LoginVoImpl(null,"cassio", "654321");
		LoginVoImpl login3 = new LoginVoImpl(null,"joao", "654321");
		
		loginRepository.saveAll(Arrays.asList(login1,login2,login3));
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JmeterTestApplication.class);
	}
}
