package com.sanslearningpath;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

			Optional<String> emptyOpt = Optional.empty();
			Optional<String> nameOpt = Optional.of("Kathryn");

        if (emptyOpt.isEmpty()) {
            System.out.println("Hi " + nameOpt.get());
        } else {
            System.out.println("Hi");
        }
			System.out.println("Hi " + nameOpt.isPresent());
		System.out.println("Hi "+nameOpt.orElse("ggg"));
		System.out.println("Hi "+nameOpt.get());
		System.out.println("Hi "+nameOpt.isEmpty());
		System.out.println("Hi "+nameOpt.orElse(""));
			System.out.println("Hi " + emptyOpt.orElse(""));
		}
	}
