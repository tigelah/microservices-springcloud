package br.com.rodrigo.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"br.com.rodrigo.core.model"})
@EnableJpaRepositories({"br.com.rodrigo.core.repository"})
public class MicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesApplication.class, args);
    }

}
