package com.sanslearningpath;


public class Application {
	enum Season {
		Spring, Summer, Fall, Winter
	}
	public static void main(String[] args) {

		Season season = Season.Spring;

		String weather = switch(season) {
			case Spring, Summer -> "Sunny";
			case Fall -> "Rainy";
			case Winter -> "Snowy";
			default ->  "Invalid stage";
			};


		System.out.println(weather);
	}

}
