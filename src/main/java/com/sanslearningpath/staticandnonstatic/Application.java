package com.sanslearningpath.staticandnonstatic;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println(Dice.sidesOfDice);
		Dice myFirstDice = new Dice();
		Dice myOtherDice = new Dice();
		System.out.println();
		for(int i=0;i<10;i++){
			System.out.println("First Dice:"+ myFirstDice.roll());
			System.out.println("Second Dice:"+ myOtherDice.roll());
		}
		System.out.println();

		System.out.println("1st face:"+myFirstDice.getFaceValue());
		System.out.println("Other face:" + myOtherDice.getFaceValue());
	}
}
