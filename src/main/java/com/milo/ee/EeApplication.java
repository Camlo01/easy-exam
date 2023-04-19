package com.milo.ee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EeApplication implements CommandLineRunner {

    private final Log Logger = LogFactory.getLog(EeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EeApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Logger.info("------------------------------");
        Logger.info("INITIALIZED SUCCESSFULLY! :D  ");
        Logger.info("------------------------------");
    }
}
