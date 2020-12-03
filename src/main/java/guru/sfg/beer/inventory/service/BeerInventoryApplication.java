package guru.sfg.beer.inventory.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisAutoConfiguration;

@SpringBootApplication(exclude = ArtemisAutoConfiguration.class)
public class BeerInventoryApplication {

    public static void main(String[] args) {

        SpringApplication.run(BeerInventoryApplication.class, args);
    }

}
/*
(exclude = ArtemisAutoConfiguration.class)
if we get a JMSSecurityException then if we put this it will not come.

 */
