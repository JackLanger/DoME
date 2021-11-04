package jah.app.dome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot application for server pages.
 */
@SpringBootApplication
public class DomeApplication {

  /**
   * Main entry point for SpringApplication.
   *
   * @param args list of arguments
   */
  public static void main(final String... args) {

    SpringApplication.run(DomeApplication.class, args);
  }

}
