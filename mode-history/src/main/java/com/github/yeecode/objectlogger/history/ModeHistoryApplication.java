package com.github.yeecode.objectlogger.history;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author mengdewei
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.github.yeecode.objectlogger"})
public class ModeHistoryApplication {

  public static void main(String[] args) {

    SpringApplication.run(ModeHistoryApplication.class, args);
  }
}
