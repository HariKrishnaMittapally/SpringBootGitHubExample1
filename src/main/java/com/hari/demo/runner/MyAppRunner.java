package com.hari.demo.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyAppRunner implements CommandLineRunner {

	private static Logger log=LoggerFactory.getLogger(MyAppRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		int a=10;
		try {
			log.info("STARTED");
			System.out.println("WELCOME TO GITHUB "+a);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("END OF FILE");
	}

}
