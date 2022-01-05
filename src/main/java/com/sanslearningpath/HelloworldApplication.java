package com.sanslearningpath;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		Counter c = new Counter();
		c.incrementCount(1);
		System.out.println(c.count);
			}

}
