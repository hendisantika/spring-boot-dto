package com.hendisantika.demo;

import com.hendisantika.demo.entity.Role;
import com.hendisantika.demo.entity.User;
import com.hendisantika.demo.repository.RoleRepository;
import com.hendisantika.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.Random;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    CommandLineRunner initialize(UserRepository repo, RoleRepository roleRepository) {
        Random rand = new Random();

        int n = rand.nextInt(5) + 1;

        return args -> {

            roleRepository.save(new Role("ADMIN"));
            roleRepository.save(new Role("BP"));
            roleRepository.save(new Role("BE"));
            roleRepository.save(new Role("SEC-BA"));
            roleRepository.save(new Role("SEC-BP"));
            roleRepository.save(new Role("HOR"));

            repo.save(new User("Hendi", "Santika", "Hendi.Santika@example.co.id", "BP", new Date(), new Date(), new Date(), 1, "Password failed", 1));

            for (int i = 1; i < 25; i++) {
                repo.save(new User("Hendi" + i, "Santika" + i, "Hendi.Santika" + i + "@example.co.id", "BE", new Date(), new Date(), new Date(), 1, "Password failed", 1));

            }

        };
    }
}
