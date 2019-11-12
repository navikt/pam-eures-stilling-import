package no.nav.arbeid.euresapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EuresApiApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(EuresApiApplication.class, args);
  }

}